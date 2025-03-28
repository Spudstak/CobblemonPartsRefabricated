package dev.spudstak.cobblemonpartsrefabricated.init;

import dev.spudstak.cobblemonpartsrefabricated.CobblemonPartsRefabricated;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeModeTabInit {
    private static final Component COBBLEMON_PARTS_TITLE = Component.translatable("creativeModeTab." + CobblemonPartsRefabricated.MOD_ID + ".cobblemon_parts");

    public static final CreativeModeTab COBBLEMON_PARTS = register("cobblemon_parts", FabricItemGroup.builder().title(COBBLEMON_PARTS_TITLE).icon(ItemInit.POKE_BALL_LID::getDefaultInstance)
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ItemInit.IRON_HAMMER);
                output.accept(ItemInit.DIAMOND_HAMMER);
                output.accept(ItemInit.NETHERITE_HAMMER);

                output.accept(BlockInit.ENCASED_PURPUR_BLOCK);
                output.accept(BlockInit.AMBIGUITY_ORE);
                output.accept(ItemInit.AMBIGUOUS_SHARD);
                output.accept(ItemInit.MASTER_WORKED_METAL);
                output.accept(ItemInit.MASTERWORK_BLUEPRINT);
                output.accept(ItemInit.MYSTERIOUS_KEYCARD);

                output.accept(ItemInit.DAWN_STONE_SHARD);
                output.accept(ItemInit.DUSK_STONE_SHARD);
                output.accept(ItemInit.FIRE_STONE_SHARD);
                output.accept(ItemInit.ICE_STONE_SHARD);
                output.accept(ItemInit.LEAF_STONE_SHARD);
                output.accept(ItemInit.MOON_STONE_SHARD);
                output.accept(ItemInit.SHINY_STONE_SHARD);
                output.accept(ItemInit.SUN_STONE_SHARD);
                output.accept(ItemInit.THUNDER_STONE_SHARD);
                output.accept(ItemInit.WATER_STONE_SHARD);

                output.accept(ItemInit.BALL_BASE);
                output.accept(ItemInit.ANCIENT_BALL_BASE);
                output.accept(ItemInit.PARK_BALL_BASE);
                output.accept(ItemInit.DIVE_BALL_BASE);
                output.accept(ItemInit.TIMER_BALL_BASE);
                output.accept(ItemInit.LUXURY_BALL_BASE);
                output.accept(ItemInit.DUSK_BALL_BASE);
                output.accept(ItemInit.HEAL_BALL_BASE);
                output.accept(ItemInit.QUICK_BALL_BASE);
                output.accept(ItemInit.DREAM_BALL_BASE);
                output.accept(ItemInit.BEAST_BALL_BASE);
                output.accept(ItemInit.CHERISH_BALL_BASE);
                output.accept(ItemInit.ANCIENT_HEAVY_BALL_BASE);
                output.accept(ItemInit.ANCIENT_ORIGIN_BALL_BASE);

                output.accept(ItemInit.POKE_BALL_LID);
                output.accept(ItemInit.CITRINE_BALL_LID);
                output.accept(ItemInit.VERDANT_BALL_LID);
                output.accept(ItemInit.AZURE_BALL_LID);
                output.accept(ItemInit.ROSEATE_BALL_LID);
                output.accept(ItemInit.SLATE_BALL_LID);
                output.accept(ItemInit.PREMIER_BALL_LID);
                output.accept(ItemInit.GREAT_BALL_LID);
                output.accept(ItemInit.ULTRA_BALL_LID);
                output.accept(ItemInit.SAFARI_BALL_LID);
                output.accept(ItemInit.FAST_BALL_LID);
                output.accept(ItemInit.LEVEL_BALL_LID);
                output.accept(ItemInit.LURE_BALL_LID);
                output.accept(ItemInit.HEAVY_BALL_LID);
                output.accept(ItemInit.LOVE_BALL_LID);
                output.accept(ItemInit.FRIEND_BALL_LID);
                output.accept(ItemInit.MOON_BALL_LID);
                output.accept(ItemInit.SPORT_BALL_LID);
                output.accept(ItemInit.PARK_BALL_LID);
                output.accept(ItemInit.NET_BALL_LID);
                output.accept(ItemInit.DIVE_BALL_LID);
                output.accept(ItemInit.NEST_BALL_LID);
                output.accept(ItemInit.REPEAT_BALL_LID);
                output.accept(ItemInit.TIMER_BALL_LID);
                output.accept(ItemInit.LUXURY_BALL_LID);
                output.accept(ItemInit.DUSK_BALL_LID);
                output.accept(ItemInit.HEAL_BALL_LID);
                output.accept(ItemInit.QUICK_BALL_LID);
                output.accept(ItemInit.DREAM_BALL_LID);
                output.accept(ItemInit.BEAST_BALL_LID);
                output.accept(ItemInit.MASTER_BALL_LID);
                output.accept(ItemInit.CHERISH_BALL_LID);
                output.accept(ItemInit.ANCIENT_POKE_BALL_LID);
                output.accept(ItemInit.ANCIENT_CITRINE_BALL_LID);
                output.accept(ItemInit.ANCIENT_VERDANT_BALL_LID);
                output.accept(ItemInit.ANCIENT_AZURE_BALL_LID);
                output.accept(ItemInit.ANCIENT_ROSEATE_BALL_LID);
                output.accept(ItemInit.ANCIENT_SLATE_BALL_LID);
                output.accept(ItemInit.ANCIENT_IVORY_BALL_LID);
                output.accept(ItemInit.ANCIENT_GREAT_BALL_LID);
                output.accept(ItemInit.ANCIENT_ULTRA_BALL_LID);
                output.accept(ItemInit.ANCIENT_FEATHER_BALL_LID);
                output.accept(ItemInit.ANCIENT_WING_BALL_LID);
                output.accept(ItemInit.ANCIENT_JET_BALL_LID);
                output.accept(ItemInit.ANCIENT_HEAVY_BALL_LID);
                output.accept(ItemInit.ANCIENT_LEADEN_BALL_LID);
                output.accept(ItemInit.ANCIENT_GIGATON_BALL_LID);
                output.accept(ItemInit.ANCIENT_ORIGIN_BALL_LID);
            }).build());

    public static <T extends CreativeModeTab> T register(String name, T creativeModeTab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(CobblemonPartsRefabricated.MOD_ID, name), creativeModeTab);
    }

    public static void load() {}
}
