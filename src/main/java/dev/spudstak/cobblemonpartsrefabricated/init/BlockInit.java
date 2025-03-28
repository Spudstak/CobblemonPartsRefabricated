package dev.spudstak.cobblemonpartsrefabricated.init;

import dev.spudstak.cobblemonpartsrefabricated.CobblemonPartsRefabricated;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class BlockInit {
    public static final Block AMBIGUITY_ORE = registerWithItem("ambiguity_ore", new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    public static final Block ENCASED_PURPUR_BLOCK = registerWithItem("encased_purpur_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(100.0F, 12.0F)));

    public static <T extends Block> T register(String name, T block)
    {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(CobblemonPartsRefabricated.MOD_ID, name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Properties properties) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, properties));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Properties());
    }

    public static void load() {}
}
