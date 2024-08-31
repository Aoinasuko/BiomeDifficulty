package bep.biomedifficulty;

import com.mojang.logging.LogUtils;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;
import org.jline.utils.Log;
import org.lwjgl.system.Library;
import org.slf4j.Logger;

import java.util.*;
import java.util.function.Supplier;

public class CommonConfig {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec.ConfigValue<HashMap<String,CommonConfig_BiomeSetting>> BIOME_LIST;

    public static ForgeConfigSpec.ConfigValue<Boolean> String_Buf_UseSetting;
    public static ForgeConfigSpec.ConfigValue<Double> String_Buf_ExpFactor;
    public static ForgeConfigSpec.ConfigValue<Double> String_Buf_AttributeFactor;
    public static ForgeConfigSpec.ConfigValue<Double> String_Buf_AttributeOffset;
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.comment("Determine the amount of reinforcement to use for each biome.").push("BiomeSetting");
        for (Map.Entry<ResourceKey<Biome>, Biome> biome : ForgeRegistries.BIOMES.getEntries()) {
            ResourceKey<Biome> biomeKey = biome.getKey();
            BUILDER.push(biomeKey.location().getNamespace());
            BUILDER.comment("================[" + biomeKey.location().getNamespace() + ":" + biomeKey.location().getPath() + "]================").push(biomeKey.location().getPath());
            String_Buf_UseSetting = BUILDER.comment("When false, no correction is applied to enemies appearing in this biome; setting it to true activates the various corrections in the hierarchy below this one.").define("UseSetting", false);
            int i = 0;
            for (Map.Entry<ResourceKey<Attribute>, Attribute> attribute : ForgeRegistries.ATTRIBUTES.getEntries()) {
                ResourceKey<Attribute> attributeKey = attribute.getKey();
                BUILDER.comment("================[Factor(Attribute Multiplier, Default of -1.0 is ignored.)]================").push("Factor");
                BUILDER.push(attributeKey.location().getNamespace());
                String_Buf_AttributeFactor = BUILDER.define(attributeKey.location().getPath(), -1.0D);
                BUILDER.pop();
                BUILDER.pop();
                BUILDER.comment("================[Offset(Direct attribute correction, Default of -1.0 is ignored.)]================").push("Offset");
                BUILDER.push(attributeKey.location().getNamespace());
                String_Buf_AttributeOffset = BUILDER.define(attributeKey.location().getPath(), -1.0D);
                BUILDER.pop();
                BUILDER.pop();
            }
            // String_Buf = BUILDER.comment("Here is where your example integer comment will go.").define("", "0");
            BUILDER.pop();
            BUILDER.pop();
        }
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}