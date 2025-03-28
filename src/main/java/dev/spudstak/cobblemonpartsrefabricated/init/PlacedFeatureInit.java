package dev.spudstak.cobblemonpartsrefabricated.init;

import dev.spudstak.cobblemonpartsrefabricated.CobblemonPartsRefabricated;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatureInit {
    public static final ResourceKey<PlacedFeature> AMBIGUITY_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(CobblemonPartsRefabricated.MOD_ID, "ambiguity_ore"));

    public static void generateOres()
    {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Decoration.UNDERGROUND_ORES, AMBIGUITY_ORE_PLACED_KEY);
    }
}
