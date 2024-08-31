package bep.biomedifficulty;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class CommonConfig_BiomeSetting {
    // 設定を使用するか？（負荷軽減用設定)
    public Boolean UseSetting = false;
    // 倍率を掛ける(先にこちらを計算する)
    public HashMap<String,Double> StatFactor = new HashMap<>();
    // 直接追加する(後にこちらを計算する)
    public HashMap<String,Double> StatOffset = new HashMap<>();
}
