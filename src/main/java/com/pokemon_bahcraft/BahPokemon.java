package com.pokemon_bahcraft;


import com.pokemon_bahcraft.registry.ModBlocks;
import com.pokemon_bahcraft.registry.ModCreativeModeTabs;
import com.pokemon_bahcraft.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BahPokemon.MOD_ID)
public class BahPokemon {

    public static final String MOD_ID = "bahpokemon";

    public BahPokemon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registo de Itens, Blocos e Abas
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus); // <-- Nova linha aqui


        MinecraftForge.EVENT_BUS.register(this);
    }
}