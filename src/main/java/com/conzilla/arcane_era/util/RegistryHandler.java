package com.conzilla.arcane_era.util;

import com.conzilla.arcane_era.arcane_era;
import com.conzilla.arcane_era.blocks.Admantite_ore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler
{
    public static DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, arcane_era.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, arcane_era.MOD_ID);


    public static void Registeritems() {ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());}
    public static void Registerblocks(){BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());}
    //Items
    public static final RegistryObject<Item> ADMANTITE_INGOT = ITEMS.register("admantite_ingot",ItemBase::new);
    public static final RegistryObject<Item> MYTHRIL_GEM = ITEMS.register("mythril_gem",ItemBase::new);
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> ADMANTITE_ORE= BLOCKS.register("admantite_ore", Admantite_ore::new);


    //BlockItems
    public static final RegistryObject<Item> ADMANTITE_ORE_ITEM= ITEMS.register("admantite_ore", () -> new BlockItemBase(ADMANTITE_ORE.get()));


}
