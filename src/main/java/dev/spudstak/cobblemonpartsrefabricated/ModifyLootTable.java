package dev.spudstak.cobblemonpartsrefabricated;

import dev.spudstak.cobblemonpartsrefabricated.init.ItemInit;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModifyLootTable {

    public static void modifyLootTable() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(source.isBuiltin() && BuiltInLootTables.END_CITY_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1,1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f))
                        .add(LootItem.lootTableItem(ItemInit.MYSTERIOUS_KEYCARD))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }

}
