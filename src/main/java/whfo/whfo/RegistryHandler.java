package whfo.whfo;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Whfo.MODID);

    public static void init() {
        ITEM.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SOZANAS_SWORD = ITEM.register("sozanas_sword", ()->
            new SozanasSword());
    public static final RegistryObject<Item> HIEMS_SWORD = ITEM.register("hiems_sword", ()->
            new HiemsSword());
    public static final RegistryObject<Item> EMERALD_SWORD = ITEM.register("emerald_sword", ()->
            new EmeraldSword());
}
