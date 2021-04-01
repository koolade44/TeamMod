package whfo.whfo.spartanweaponryintegration;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import whfo.whfo.FrozenEffect;

import java.util.Timer;
import java.util.TimerTask;

public class FrozenNetheriteLongSword extends SwordItem {
    public FrozenNetheriteLongSword() {
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

        }, 0, -3, new Item.Properties().group(new SWIItemGroup()));
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        Timer timer = new Timer();
        FrozenEffect.idList.add(target.getUniqueID());
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                target.setMotion(0, 0, 0);
                target.setHeadRotation(target.getRotationYawHead(), 0);
            }
        }, 0 , 0);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                FrozenEffect.idList.remove(target.getUniqueID());
                timer.cancel();
            }
        }, 1000 * 3);
        return true;
    }
}
