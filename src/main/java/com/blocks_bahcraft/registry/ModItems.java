package com.blocks_bahcraft.registry;

import com.blocks_bahcraft.BahBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BahBlocks.MOD_ID);

    // --- Seus Itens ---

    public static final RegistryObject<Item> BULBASAUR_ITEM = ITEMS.register("bulbasaur_block",
            () -> new BlockItem(ModBlocks.BULBASAUR_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARIZARD_ITEM = ITEMS.register("charizard_block",
            () -> new BlockItem(ModBlocks.CHARIZARD_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> EEVEE_ITEM = ITEMS.register("eevee_block",
            () -> new BlockItem(ModBlocks.EEVEE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> GENGAR_ITEM = ITEMS.register("gengar_block",
            () -> new BlockItem(ModBlocks.GENGAR_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> GEODUDE_ITEM = ITEMS.register("geodude_block",
            () -> new BlockItem(ModBlocks.GEODUDE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JIGGLYPUFF_ITEM = ITEMS.register("jigglypuff_block",
            () -> new BlockItem(ModBlocks.JIGGLYPUFF_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MEWTWO_ITEM = ITEMS.register("mewtwo_block",
            () -> new BlockItem(ModBlocks.MEWTWO_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PIKACHU_ITEM = ITEMS.register("pikachu_block",
            () -> new BlockItem(ModBlocks.PIKACHU_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SNORLAX_ITEM = ITEMS.register("snorlax_block",
            () -> new BlockItem(ModBlocks.SNORLAX_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SQUIRTLE_ITEM = ITEMS.register("squirtle_block",
            () -> new BlockItem(ModBlocks.SQUIRTLE_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}