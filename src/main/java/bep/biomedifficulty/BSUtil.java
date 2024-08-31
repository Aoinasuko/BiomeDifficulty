package bep.biomedifficulty;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

public class BSUtil {
    public static CommonConfig_BiomeSetting createSampleData(ResourceKey<Biome> biomeKey) {
        CommonConfig_BiomeSetting retBiomeSetting = new CommonConfig_BiomeSetting();
        /* ＝＝＝＝＝地上バイオーム＝＝＝＝＝ */
        // ＝＝＝　平原系　＝＝＝
        if (biomeKey == Biomes.MANGROVE_SWAMP) {
            // 危険度2 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.SAVANNA) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.WINDSWEPT_SAVANNA) {
            // 危険度2 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.SAVANNA_PLATEAU) {
            // 危険度2 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.WINDSWEPT_HILLS) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.WINDSWEPT_GRAVELLY_HILLS) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.WINDSWEPT_FOREST) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.STONY_PEAKS) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.STONY_SHORE) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        // ＝＝＝　森系　＝＝＝
        if (biomeKey == Biomes.DARK_FOREST) {
            // 危険度4 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.3D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        // ＝＝＝　ジャングル系　＝＝＝
        if (biomeKey == Biomes.JUNGLE) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.SPARSE_JUNGLE) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.BAMBOO_JUNGLE) {
            // 危険度2 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        // ＝＝＝　砂漠系　＝＝＝
        if (biomeKey == Biomes.DESERT) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.BADLANDS) {
            // 危険度3 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.75D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.25D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.5D);
        }
        if (biomeKey == Biomes.WOODED_BADLANDS) {
            // 危険度4 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.7D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.ERODED_BADLANDS) {
            // 危険度4 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.7D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        // ＝＝＝　海系　＝＝＝
        if (biomeKey == Biomes.OCEAN) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.WARM_OCEAN) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.DEEP_OCEAN) {
            // 危険度3 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.75D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.25D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.5D);
        }
        if (biomeKey == Biomes.COLD_OCEAN) {
            // 危険度2 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.DEEP_COLD_OCEAN) {
            // 危険度3 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.75D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.25D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.5D);
        }
        if (biomeKey == Biomes.DEEP_FROZEN_OCEAN) {
            // 危険度3 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.75D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.25D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.5D);
        }
        if (biomeKey == Biomes.DEEP_LUKEWARM_OCEAN) {
            // 危険度3 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.75D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.55D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.25D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.5D);
        }
        // ＝＝＝　氷系　＝＝＝
        if (biomeKey == Biomes.TAIGA) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.SNOWY_TAIGA) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.ICE_SPIKES) {
            // 危険度2 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.OLD_GROWTH_PINE_TAIGA) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.OLD_GROWTH_SPRUCE_TAIGA) {
            // 危険度1 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.25D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.GROVE) {
            // 危険度2 : 体力重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 0.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.SNOWY_SLOPES) {
            // 危険度1 : 速度重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 0.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 0.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", -0.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.JAGGED_PEAKS) {
            // 危険度1 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.STONY_PEAKS) {
            // 危険度1 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.25D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.1D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.75D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 1.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 1.5D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 0.5D);
        }
        if (biomeKey == Biomes.FROZEN_PEAKS) {
            // 危険度2 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        // ＝＝＝　サブバイオーム　＝＝＝
        if (biomeKey == Biomes.DEEP_DARK) {
            // 危険度4 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.5D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 1.0D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.LUSH_CAVES) {
            // 危険度2 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        if (biomeKey == Biomes.DRIPSTONE_CAVES) {
            // 危険度2 : 攻撃重視型
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 1.2D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 6.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 2.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 1.0D);
        }
        /* ＝＝＝＝＝ネザーバイオーム＝＝＝＝＝ */
        if (biomeKey == Biomes.NETHER_WASTES) {
            // 危険度ネザー
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.SOUL_SAND_VALLEY) {
            // 危険度ネザー
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.CRIMSON_FOREST) {
            // 危険度ネザー
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.WARPED_FOREST) {
            // 危険度ネザー
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        if (biomeKey == Biomes.BASALT_DELTAS) {
            // 危険度ネザー
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 1.5D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.35D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 1.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 9.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 3.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.4D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 2.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 2.0D);
        }
        // エンドバイオーム
        if (biomeKey == Biomes.THE_END) {
            // 危険度エンド
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.5D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 3.0D);
        }
        if (biomeKey == Biomes.SMALL_END_ISLANDS) {
            // 危険度エンド
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.5D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 3.0D);
        }
        if (biomeKey == Biomes.END_MIDLANDS) {
            // 危険度エンド
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.5D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 3.0D);
        }
        if (biomeKey == Biomes.END_HIGHLANDS) {
            // 危険度エンド
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.5D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 3.0D);
        }
        if (biomeKey == Biomes.END_BARRENS) {
            // 危険度エンド
            retBiomeSetting.UseSetting = true;
            // Factor
            retBiomeSetting.StatFactor.put("minecraft:generic.max_health", 2.0D);
            retBiomeSetting.StatFactor.put("minecraft:generic.movement_speed", 0.5D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.damagefactor", 2.0D);
            // Offset
            retBiomeSetting.StatOffset.put("minecraft:follow_range", 16.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor", 12.0D);
            retBiomeSetting.StatOffset.put("minecraft:generic.armor_toughness", 4.0D);
            retBiomeSetting.StatOffset.put("minecraft:knockback_resistance", 0.6D);
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.truedamagevalue", 3.0D);
            // 経験値
            retBiomeSetting.StatOffset.put("biomedifficulty:mob.bonusexpfactor", 3.0D);
        }
        return retBiomeSetting;
    }
}
