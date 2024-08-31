package bep.biomedifficulty;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static bep.biomedifficulty.Biomedifficulty.*;

public class EventHandle {

    private static final Logger LOGGER = LogUtils.getLogger();

    // ダメージを与えた時、ダメージ補正を行う
    @SubscribeEvent
    public void onLivingAttack(LivingHurtEvent event) {
        Entity entity = event.getSource().getEntity();
        if (entity instanceof LivingEntity) {
            LivingEntity mob = (LivingEntity)entity;
            // ダメージ量補正
            float damagevalue = event.getAmount();
            if (mob.getAttributes().hasAttribute(DamageFactor.get())) {
                double damageFactor = mob.getAttributes().getValue(DamageFactor.get());
                if (damageFactor > 0) {
                    damagevalue *= (float)damageFactor;
                    event.setAmount(damagevalue);
                }
            }
            // 真のダメージ
            if (mob.getAttributes().hasAttribute(TrueDamageValue.get())) {
                double trueDamageValue = mob.getAttributes().getValue(TrueDamageValue.get());
                if (trueDamageValue > 0.0D) {
                    if (event.getEntity() != null) {
                        float health = event.getEntity().getHealth() - (float)trueDamageValue;
                        event.getEntity().setHealth(health);
                    }
                }
            }
        }
    }


    // 特定のバイオームで敵対的なエンティティがスポーンした時に設定された能力補正を付与する
    @SubscribeEvent
    public void onLivingSpawn(LivingSpawnEvent.SpecialSpawn event) {
        Mob entity = event.getEntity();
        if (!entity.getType().getCategory().isFriendly()) {
            // 登場予定のバイオームを取得
            Holder<Biome> nowBiome = entity.getCommandSenderWorld().getBiome(entity.blockPosition());
            ResourceKey<Biome> biomeKey = nowBiome.unwrapKey().get();
            CommonConfig_BiomeSetting biomeSetting = BiomeSetting.getOrDefault(biomeKey.location().getNamespace() + ":" + biomeKey.location().getPath(), null);
            // セッティングを使用する場合
            if (biomeSetting != null && biomeSetting.UseSetting) {
                int i = 0;
                boolean flag = false;
                for (HashMap.Entry<String, Double> entry : biomeSetting.StatFactor.entrySet()) {
                    String id = String.format("%03d", i);
                    AttributeModifier modifier = new AttributeModifier(UUID.fromString("40c79cf6-bf1d-4f87-8cb9-95fb5a745" + id), "BEPBD", entry.getValue(), AttributeModifier.Operation.MULTIPLY_BASE);
                    // 能力補正のパス
                    String[] attributes_path = entry.getKey().split(":", 2);
                    Attribute getAttribute = ForgeRegistries.ATTRIBUTES.getValue(ResourceLocation.tryBuild(attributes_path[0], attributes_path[1]));
                    AttributeInstance applyAttribute = event.getEntity().getAttribute(getAttribute);
                    if (applyAttribute != null) {
                        applyAttribute.addPermanentModifier(modifier);
                    }
                    i++;
                    flag = true;
                }
                int j = 0;
                for (HashMap.Entry<String, Double> entry : biomeSetting.StatOffset.entrySet()) {
                    String id = String.format("%03d", j);
                    AttributeModifier modifier = new AttributeModifier(UUID.fromString("40c79cf6-bf1d-4f87-8cb9-95fb5a745" + id), "BEPBD", entry.getValue(), AttributeModifier.Operation.ADDITION);
                    // 能力補正のパス
                    String[] attributes_path = entry.getKey().split(":", 2);
                    Attribute getAttribute = ForgeRegistries.ATTRIBUTES.getValue(ResourceLocation.tryBuild(attributes_path[0], attributes_path[1]));
                    AttributeInstance applyAttribute = event.getEntity().getAttribute(getAttribute);
                    if (applyAttribute != null) {
                        applyAttribute.addPermanentModifier(modifier);
                    }
                    j++;
                    flag = true;
                }
                if (flag) {
                    event.getEntity().setHealth(entity.getMaxHealth());
                }
            }
        }
    }

    // エンティティの経験値ドロップ量に補正を行う
    @SubscribeEvent
    public void onLivingExperienceDropEvent(LivingExperienceDropEvent event) {
        if (event.getDroppedExperience() > 0) {
            AttributeInstance applyAttribute = event.getEntity().getAttribute(BonusExpFactor.get());
            if (applyAttribute != null) {
                event.setDroppedExperience(event.getDroppedExperience() + Math.max((int)(event.getDroppedExperience() * applyAttribute.getValue()),1));
            }
        }
    }

}
