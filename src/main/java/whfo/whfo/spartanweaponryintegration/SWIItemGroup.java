package whfo.whfo.spartanweaponryintegration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class SWIItemGroup extends ItemGroup {
    public static final Supplier<ItemStack> iconSupplier = () -> SWIRegistryHandler.FROZEN_NETHERITE_LONG_SWORD.get().getDefaultInstance();

    public SWIItemGroup() {
        super("whfo_spartan_weapons");
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
