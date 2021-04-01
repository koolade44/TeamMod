package whfo.whfo;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

import java.util.Timer;
import java.util.TimerTask;

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
                return 10;
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
        Timer timer = new Timer();
        FrozenEffect.idList.add(target.getUniqueID());
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                target.setMotion(0, 0, 0);
                target.setHeadRotation(target.getRotationYawHead(), 0);
            }
        }, 0 , 1);
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
