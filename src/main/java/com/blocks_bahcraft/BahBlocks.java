package com.blocks_bahcraft;


import com.blocks_bahcraft.registry.ModBlocks;
import com.blocks_bahcraft.registry.ModCreativeModeTabs;
import com.blocks_bahcraft.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BahBlocks.MOD_ID)
public class BahBlocks {

    public static final String MOD_ID = "bahblocks";

    public BahBlocks() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}