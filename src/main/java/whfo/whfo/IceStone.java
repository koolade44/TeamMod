package whfo.whfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class IceStone extends Item {
    public IceStone() {
        super(new Item.Properties()
            .group(ItemGroup.MATERIALS)
        );
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity holder, int slot, boolean isSelected) {
        if (holder instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) holder;
            entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 1, 3));
        }
        super.inventoryTick(stack, world, holder, slot, isSelected);
    }
}
