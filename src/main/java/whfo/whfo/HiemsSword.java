package whfo.whfo;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;

public class HiemsSword extends SwordItem {
    public HiemsSword() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 5000;
            }

            @Override
            public float getEfficiency() {
                return 5;
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
        }, 2, 0, new Item.Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10, 7));
        return true;
    }
}
