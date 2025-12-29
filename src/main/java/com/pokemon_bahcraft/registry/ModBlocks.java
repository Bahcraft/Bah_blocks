package com.pokemon_bahcraft.registry;

import com.pokemon_bahcraft.BahPokemon;
import com.pokemon_bahcraft.cores.PokemonBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    // 1. Cria o Registrador de Blocos
    // Note que precisamos pegar o MOD_ID da classe principal
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BahPokemon.MOD_ID);

    // 2. Seus Blocos (Adicione seus blocos aqui)
    public static final RegistryObject<Block> BULBASAUR_BLOCK = BLOCKS.register("bulbasaur_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CHARIZARD_BLOCK = BLOCKS.register("charizard_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> EEVEE_BLOCK = BLOCKS.register("eevee_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GENGAR_BLOCK = BLOCKS.register("gengar_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GEODUDE_BLOCK = BLOCKS.register("geodude_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> JIGGLYPUFF_BLOCK = BLOCKS.register("jigglypuff_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MEWTWO_BLOCK = BLOCKS.register("mewtwo_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PIKACHU_BLOCK = BLOCKS.register("pikachu_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SNORLAX_BLOCK = BLOCKS.register("snorlax_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SQUIRTLE_BLOCK = BLOCKS.register("squirtle_block",
            () -> new PokemonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    // 3. Método para registrar no EventBus (Chamaremos isso na Main)
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}