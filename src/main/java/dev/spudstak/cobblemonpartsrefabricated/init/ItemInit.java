package dev.spudstak.cobblemonpartsrefabricated.init;

import dev.spudstak.cobblemonpartsrefabricated.CobblemonPartsRefabricated;
import dev.spudstak.cobblemonpartsrefabricated.HammerItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ItemInit {
    public static final Item IRON_HAMMER = register("iron_hammer", new HammerItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 0, -3f))));
    public static final Item DIAMOND_HAMMER = register("diamond_hammer", new HammerItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 1, -3f))));
    public static final Item NETHERITE_HAMMER = register("netherite_hammer", new HammerItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, -3f))));

    public static final Item AMBIGUOUS_SHARD = register("ambiguous_shard", new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final Item MASTER_WORKED_METAL = register("master_worked_metal", new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final Item MASTERWORK_BLUEPRINT = register("masterwork_blueprint", new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final Item MYSTERIOUS_KEYCARD = register("mysterious_keycard", new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final Item DAWN_STONE_SHARD = register("dawn_stone_shard", new Item(new Item.Properties()));
    public static final Item DUSK_STONE_SHARD = register("dusk_stone_shard", new Item(new Item.Properties()));
    public static final Item FIRE_STONE_SHARD = register("fire_stone_shard", new Item(new Item.Properties()));
    public static final Item ICE_STONE_SHARD = register("ice_stone_shard", new Item(new Item.Properties()));
    public static final Item LEAF_STONE_SHARD = register("leaf_stone_shard", new Item(new Item.Properties()));
    public static final Item MOON_STONE_SHARD = register("moon_stone_shard", new Item(new Item.Properties()));
    public static final Item SHINY_STONE_SHARD = register("shiny_stone_shard", new Item(new Item.Properties()));
    public static final Item SUN_STONE_SHARD = register("sun_stone_shard", new Item(new Item.Properties()));
    public static final Item THUNDER_STONE_SHARD = register("thunder_stone_shard", new Item(new Item.Properties()));
    public static final Item WATER_STONE_SHARD = register("water_stone_shard", new Item(new Item.Properties()));

    public static final Item BALL_BASE = register("ball_base", new Item(new Item.Properties()));
    public static final Item ANCIENT_BALL_BASE = register("ancient_ball_base", new Item(new Item.Properties()));
    public static final Item PARK_BALL_BASE = register("park_ball_base", new Item(new Item.Properties()));
    public static final Item DIVE_BALL_BASE = register("dive_ball_base", new Item(new Item.Properties()));
    public static final Item TIMER_BALL_BASE = register("timer_ball_base", new Item(new Item.Properties()));
    public static final Item LUXURY_BALL_BASE = register("luxury_ball_base", new Item(new Item.Properties()));
    public static final Item DUSK_BALL_BASE = register("dusk_ball_base", new Item(new Item.Properties()));
    public static final Item HEAL_BALL_BASE = register("heal_ball_base", new Item(new Item.Properties()));
    public static final Item QUICK_BALL_BASE = register("quick_ball_base", new Item(new Item.Properties()));
    public static final Item DREAM_BALL_BASE = register("dream_ball_base", new Item(new Item.Properties()));
    public static final Item BEAST_BALL_BASE = register("beast_ball_base", new Item(new Item.Properties()));
    public static final Item CHERISH_BALL_BASE = register("cherish_ball_base", new Item(new Item.Properties()));
    public static final Item ANCIENT_HEAVY_BALL_BASE = register("ancient_heavy_ball_base", new Item(new Item.Properties()));
    public static final Item ANCIENT_ORIGIN_BALL_BASE = register("ancient_origin_ball_base", new Item(new Item.Properties()));

    public static final Item POKE_BALL_LID = register("poke_ball_lid", new Item(new Item.Properties()));
    public static final Item CITRINE_BALL_LID = register("citrine_ball_lid", new Item(new Item.Properties()));
    public static final Item VERDANT_BALL_LID = register("verdant_ball_lid", new Item(new Item.Properties()));
    public static final Item AZURE_BALL_LID = register("azure_ball_lid", new Item(new Item.Properties()));
    public static final Item ROSEATE_BALL_LID = register("roseate_ball_lid", new Item(new Item.Properties()));
    public static final Item SLATE_BALL_LID = register("slate_ball_lid", new Item(new Item.Properties()));
    public static final Item PREMIER_BALL_LID = register("premier_ball_lid", new Item(new Item.Properties()));
    public static final Item GREAT_BALL_LID = register("great_ball_lid", new Item(new Item.Properties()));
    public static final Item ULTRA_BALL_LID = register("ultra_ball_lid", new Item(new Item.Properties()));
    public static final Item SAFARI_BALL_LID = register("safari_ball_lid", new Item(new Item.Properties()));
    public static final Item FAST_BALL_LID = register("fast_ball_lid", new Item(new Item.Properties()));
    public static final Item LEVEL_BALL_LID = register("level_ball_lid", new Item(new Item.Properties()));
    public static final Item LURE_BALL_LID = register("lure_ball_lid", new Item(new Item.Properties()));
    public static final Item HEAVY_BALL_LID = register("heavy_ball_lid", new Item(new Item.Properties()));
    public static final Item LOVE_BALL_LID = register("love_ball_lid", new Item(new Item.Properties()));
    public static final Item FRIEND_BALL_LID = register("friend_ball_lid", new Item(new Item.Properties()));
    public static final Item MOON_BALL_LID = register("moon_ball_lid", new Item(new Item.Properties()));
    public static final Item SPORT_BALL_LID = register("sport_ball_lid", new Item(new Item.Properties()));
    public static final Item PARK_BALL_LID = register("park_ball_lid", new Item(new Item.Properties()));
    public static final Item NET_BALL_LID = register("net_ball_lid", new Item(new Item.Properties()));
    public static final Item DIVE_BALL_LID = register("dive_ball_lid", new Item(new Item.Properties()));
    public static final Item NEST_BALL_LID = register("nest_ball_lid", new Item(new Item.Properties()));
    public static final Item REPEAT_BALL_LID = register("repeat_ball_lid", new Item(new Item.Properties()));
    public static final Item TIMER_BALL_LID = register("timer_ball_lid", new Item(new Item.Properties()));
    public static final Item LUXURY_BALL_LID = register("luxury_ball_lid", new Item(new Item.Properties()));
    public static final Item DUSK_BALL_LID = register("dusk_ball_lid", new Item(new Item.Properties()));
    public static final Item HEAL_BALL_LID = register("heal_ball_lid", new Item(new Item.Properties()));
    public static final Item QUICK_BALL_LID = register("quick_ball_lid", new Item(new Item.Properties()));
    public static final Item DREAM_BALL_LID = register("dream_ball_lid", new Item(new Item.Properties()));
    public static final Item BEAST_BALL_LID = register("beast_ball_lid", new Item(new Item.Properties()));
    public static final Item MASTER_BALL_LID = register("master_ball_lid", new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final Item CHERISH_BALL_LID = register("cherish_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_POKE_BALL_LID = register("ancient_poke_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_CITRINE_BALL_LID = register("ancient_citrine_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_VERDANT_BALL_LID = register("ancient_verdant_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_AZURE_BALL_LID = register("ancient_azure_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_ROSEATE_BALL_LID = register("ancient_roseate_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_SLATE_BALL_LID = register("ancient_slate_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_IVORY_BALL_LID = register("ancient_ivory_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_GREAT_BALL_LID = register("ancient_great_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_ULTRA_BALL_LID = register("ancient_ultra_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_FEATHER_BALL_LID = register("ancient_feather_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_WING_BALL_LID = register("ancient_wing_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_JET_BALL_LID = register("ancient_jet_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_HEAVY_BALL_LID = register("ancient_heavy_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_LEADEN_BALL_LID = register("ancient_leaden_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_GIGATON_BALL_LID = register("ancient_gigaton_ball_lid", new Item(new Item.Properties()));
    public static final Item ANCIENT_ORIGIN_BALL_LID = register("ancient_origin_ball_lid", new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static <T extends Item> T register(String name, T item)
    {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(CobblemonPartsRefabricated.MOD_ID, name), item);
    }

    public static void load() {}
}
