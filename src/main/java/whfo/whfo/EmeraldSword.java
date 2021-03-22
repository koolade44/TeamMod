package whfo.whfo;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

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
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        stack.addEnchantment(Enchantments.LOOTING, 5);
        return true;
    }
}
