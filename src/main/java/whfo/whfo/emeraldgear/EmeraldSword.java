package whfo.whfo.emeraldgear;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

import java.util.Map;

public class EmeraldSword extends SwordItem {
    public EmeraldSword() {
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
        }, 3, 0, new Item.Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
        if (EnchantmentHelper.getEnchantments(stack).get(Enchantments.LOOTING) == null) {
            stack.addEnchantment(Enchantments.LOOTING, 5);
        }
        super.inventoryTick(stack, world, entity, slot, isSelected);
    }
}
