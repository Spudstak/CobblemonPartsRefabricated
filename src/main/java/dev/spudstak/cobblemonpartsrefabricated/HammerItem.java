package dev.spudstak.cobblemonpartsrefabricated;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class HammerItem extends SwordItem {

    public HammerItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {

        int newDamage = stack.getDamageValue() + 1;
        stack = stack.copy();
        stack.setDamageValue(newDamage);

        if(stack.getDamageValue() >= stack.getMaxDamage()){
            stack = ItemStack.EMPTY;
        }

        return stack;
    }
}
