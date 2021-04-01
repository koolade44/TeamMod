package whfo.whfo.emeraldgear;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

public class EmeraldHoe extends HoeItem {
    public EmeraldHoe() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 2500;
            }

            @Override
            public float getEfficiency() {
                return 10;
            }

            @Override
            public float getAttackDamage() {
                return 5;
            }

            @Override
            public int getHarvestLevel() {
                return 5;
            }

            @Override
            public int getEnchantability() {
                return 5;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, 0, 1, new Item.Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
        if (EnchantmentHelper.getEnchantments(stack).get(Enchantments.LOOTING) == null) {
            stack.addEnchantment(Enchantments.LOOTING, 5);
        }
        super.inventoryTick(stack, world, entity, slot, isSelected);
    }
}
