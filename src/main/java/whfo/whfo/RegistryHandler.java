package whfo.whfo;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import whfo.whfo.emeraldgear.EmeraldAxe;
import whfo.whfo.emeraldgear.EmeraldHoe;
import whfo.whfo.emeraldgear.EmeraldPickaxe;
import whfo.whfo.emeraldgear.EmeraldSword;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Whfo.MODID);
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, Whfo.MODID);

    public static void init() {
        ITEM.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SOZANAS_SWORD = ITEM.register("sozanas_sword", ()->
            new SozanasSword());
    public static final RegistryObject<Item> HIEMS_SWORD = ITEM.register("hiems_sword", ()->
            new HiemsSword());
    public static final RegistryObject<Item> EMERALD_SWORD = ITEM.register("emerald_sword", ()->
            new EmeraldSword());
    public static final RegistryObject<Item> EMERALD_AXE = ITEM.register("emerald_axe", ()->
            new EmeraldAxe());
    public static final RegistryObject<Block> ICE_STONE_ORE = BLOCK.register("ice_stone_ore", ()->
            new Block(
                    AbstractBlock.Properties
                        .create(Material.IRON)
                        .hardnessAndResistance(5.0f, 4.0f)
                        .sound(SoundType.STONE)
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(4)
            ));
    public static final RegistryObject<Item> ICE_STONE_ORE_ITEM = ITEM.register("ice_stone_ore", ()->
            new BlockItem(
                    ICE_STONE_ORE.get(),
                    new Item.Properties().group(ItemGroup.MATERIALS)
            ));
    public static final RegistryObject<Item> ICE_STONE = ITEM.register("ice_stone", ()->
            new IceStone());
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEM.register("emerald_pickaxe", ()->
            new EmeraldPickaxe());
    public static final  RegistryObject<Item> EMERALD_HOE = ITEM.register("emerald_hoe", ()->
            new EmeraldHoe());
}
