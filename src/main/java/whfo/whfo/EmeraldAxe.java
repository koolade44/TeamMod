package whfo.whfo;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

public class EmeraldAxe extends AxeItem {
    public EmeraldAxe() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 2400;
            }

            @Override
            public float getEfficiency() {
                return 6;
            }

            @Override
            public float getAttackDamage() {
                return 9;
            }

            @Override
            public int getHarvestLevel() {
                return 4;
            }

            @Override
            public int getEnchantability() {
                return 5;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, 0, -3, new Item.Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity player, int slot, boolean isSelected) {
        if (EnchantmentHelper.getEnchantments(stack).get(Enchantments.SILK_TOUCH) == null) {
            stack.addEnchantment(Enchantments.SILK_TOUCH, 5);
        }
        super.inventoryTick(stack, world, player, slot, isSelected);
    }
}
