package bep.biomedifficulty;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ibm.icu.impl.Pair;
import com.ibm.icu.impl.locale.XCldrStub;
import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;
import org.antlr.v4.runtime.misc.MultiMap;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Supplier;

import static net.minecraft.data.BuiltinRegistries.REGISTRY;

@Mod(Biomedifficulty.MODID)
public class Biomedifficulty {

    // MODID
    public static final String MODID = "biomedifficulty";
    // ログ
    private static final Logger LOGGER = LogUtils.getLogger();
    // BiomeSetting
    public static HashMap<String,CommonConfig_BiomeSetting> BiomeSetting = new HashMap<>();
    // Gson初期化
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    // イベント
    public static EventHandle EVENTS = new EventHandle();

    /* 新規属性 */
    public static final DeferredRegister<Attribute> ATTRIBUTE_REGISTER = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MODID);
    // ボーナス経験値倍率(1.0で経験値実質2倍)
    public static final RegistryObject<Attribute> BonusExpFactor = ATTRIBUTE_REGISTER.register("mob.bonusexpfactor", () -> new RangedAttribute("BonusExpFactor", 0, 0, 1024).setSyncable(true));
    // ダメージ倍率(軽減前の攻撃力の倍率)
    public static final RegistryObject<Attribute> DamageFactor = ATTRIBUTE_REGISTER.register("mob.damagefactor", () -> new RangedAttribute("DamageFactor", 1.0, 0, 1024).setSyncable(true));
    // 真のダメージ値(あらゆる耐性を無視してこの値の数だけダメージを与える)
    public static final RegistryObject<Attribute> TrueDamageValue = ATTRIBUTE_REGISTER.register("mob.truedamagevalue", () -> new RangedAttribute("TrueDamageValue", 0, 0, 1024).setSyncable(true));

    private static <T extends Attribute> RegistryObject<T> registerAttr(final String name, final Supplier<T> sup) {
        return ATTRIBUTE_REGISTER.register(name, sup);
    }

    public Biomedifficulty() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ATTRIBUTE_REGISTER.register(bus);
        MinecraftForge.EVENT_BUS.register(EVENTS);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }

    @SubscribeEvent
    public void onRegisterEvent(RegisterEvent event) {
        if (event.getForgeRegistry() != null) {
            if (!event.getForgeRegistry().getValues().isEmpty()) {
                if (event.getForgeRegistry().getValues().stream().findFirst().get() instanceof Biome) {
                    registerConfig();
                }
            }
        }
    }

    // エンティティの作成時に属性を追加する
    @SubscribeEvent
    public void existingEntityAttributes(EntityAttributeModificationEvent event){
        event.getTypes().forEach(entityType -> {
            if (!entityType.getCategory().isFriendly()) {
                if (!event.has(entityType, BonusExpFactor.get())) {
                    event.add(entityType, BonusExpFactor.get());
                }
                if (!event.has(entityType, DamageFactor.get())) {
                    event.add(entityType, DamageFactor.get());
                }
                if (!event.has(entityType, TrueDamageValue.get())) {
                    event.add(entityType, TrueDamageValue.get());
                }
            }
        });
    }

    // コンフィグの登録を行う
    private void registerConfig() {
        BiomeSetting = new HashMap<>();

        String path = Minecraft.getInstance().gameDirectory.toString() + "/config/biomedifficulty/biomesettings/";

        File baseConfig = new File(Minecraft.getInstance().gameDirectory.toString() + "/config/biomedifficulty");
        if (!baseConfig.exists()) {
            baseConfig.mkdirs();
        }
        File baseBiomeConfig = new File(Minecraft.getInstance().gameDirectory.toString() + "/config/biomedifficulty/biomesettings");
        if (!baseBiomeConfig.exists()) {
            baseBiomeConfig.mkdirs();
        }
        List<String> checked = new ArrayList<>();
        for (Map.Entry<ResourceKey<Biome>, Biome> biome : ForgeRegistries.BIOMES.getEntries()) {
            Gson gson = new Gson();
            ResourceKey<Biome> biomeKey = biome.getKey();
            if (!checked.contains(biomeKey.location().getNamespace())) {
                File baseModConfig = new File(Minecraft.getInstance().gameDirectory.toString() + "/config/biomedifficulty/biomesettings/" + biomeKey.location().getNamespace());
                if (!baseModConfig.exists()) {
                    baseModConfig.mkdirs();
                }
                checked.add(biomeKey.location().getNamespace());
            }
            String filename = biomeKey.location().getNamespace() + "/" + biomeKey.location().getPath() + ".json";
            String filevalue = "";
            CommonConfig_BiomeSetting biomedata = new CommonConfig_BiomeSetting();
            try {
                if (Files.exists(Path.of(path + filename))) {
                    filevalue = Files.readString(Path.of(path + filename));
                    biomedata = GSON.fromJson(filevalue,CommonConfig_BiomeSetting.class);
                    LOGGER.info(biomeKey.location().getPath());
                } else {
                    biomedata = BSUtil.createSampleData(biomeKey);
                    filevalue = GSON.toJson(biomedata);
                    Files.writeString(Path.of(path + filename),filevalue);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            BiomeSetting.put(biomeKey.location().getNamespace() + ":" + biomeKey.location().getPath(), biomedata);
        }
    }
}
