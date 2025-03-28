package dev.spudstak.cobblemonpartsrefabricated;

import dev.spudstak.cobblemonpartsrefabricated.init.BlockInit;
import dev.spudstak.cobblemonpartsrefabricated.init.CreativeModeTabInit;
import dev.spudstak.cobblemonpartsrefabricated.init.ItemInit;
import dev.spudstak.cobblemonpartsrefabricated.init.PlacedFeatureInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonPartsRefabricated implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("CobblemonPartsRefabricated");
	public static final String MOD_ID = "cobblemonpartsrefabricated";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading...");
		ItemInit.load();
		BlockInit.load();
		CreativeModeTabInit.load();
		PlacedFeatureInit.generateOres();
		ModifyLootTable.modifyLootTable();
	}
}