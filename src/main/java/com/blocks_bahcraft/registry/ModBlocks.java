package com.blocks_bahcraft.registry;

import com.blocks_bahcraft.BahBlocks;
import com.blocks_bahcraft.cores.BahColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BahBlocks.MOD_ID);

    // 1. --- ABA 1: POKE ---
    public static final RegistryObject<Block> BULBASAUR_BLOCK = BLOCKS.register("bulbasaur_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CHARIZARD_BLOCK = BLOCKS.register("charizard_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> EEVEE_BLOCK = BLOCKS.register("eevee_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GENGAR_BLOCK = BLOCKS.register("gengar_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GEODUDE_BLOCK = BLOCKS.register("geodude_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> JIGGLYPUFF_BLOCK = BLOCKS.register("jigglypuff_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MEWTWO_BLOCK = BLOCKS.register("mewtwo_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PIKACHU_BLOCK = BLOCKS.register("pikachu_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SNORLAX_BLOCK = BLOCKS.register("snorlax_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> SQUIRTLE_BLOCK = BLOCKS.register("squirtle_block",
            () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    // 2. --- ABA 2: BRASILEIRAO ---
    public static final RegistryObject<Block> PALMEIRAS_BLOCK = createBlock("palmeiras_block");
    public static final RegistryObject<Block> FLAMENGO_BLOCK = createBlock("flamengo_block");
    public static final RegistryObject<Block> BOTAFOGO_BLOCK = createBlock("botafogo_block");
    public static final RegistryObject<Block> ATLETICO_MINEIRO_BLOCK = createBlock("atletico_mineiro_block");
    public static final RegistryObject<Block> SAO_PAULO_BLOCK = createBlock("sao_paulo_block");
    public static final RegistryObject<Block> GREMIO_BLOCK = createBlock("gremio_block");
    public static final RegistryObject<Block> INTERNACIONAL_BLOCK = createBlock("internacional_block");
    public static final RegistryObject<Block> CRUZEIRO_BLOCK = createBlock("cruzeiro_block");
    public static final RegistryObject<Block> CORINTHIANS_BLOCK = createBlock("corinthians_block");
    public static final RegistryObject<Block> VASCO_BLOCK = createBlock("vasco_block");
    public static final RegistryObject<Block> FLUMINENSE_BLOCK = createBlock("fluminense_block");
    public static final RegistryObject<Block> BRAGANTINO_BLOCK = createBlock("bragantino_block");
    public static final RegistryObject<Block> ATHLETICO_PR_BLOCK = createBlock("athletico_pr_block");
    public static final RegistryObject<Block> SANTOS_BLOCK = createBlock("santos_block");
    public static final RegistryObject<Block> CORITIBA_BLOCK = createBlock("coritiba_block");
    public static final RegistryObject<Block> BAHIA_BLOCK = createBlock("bahia_block");
    public static final RegistryObject<Block> CHAPECOENSE_BLOCK = createBlock("chapecoense_block");
    public static final RegistryObject<Block> VITORIA_BLOCK = createBlock("vitoria_block");
    public static final RegistryObject<Block> MIRASSOL_BLOCK = createBlock("mirassol_block");
    public static final RegistryObject<Block> REMO_BLOCK = createBlock("remo_block");

    // 3. --- ABA 3: INTER ---

    public static final RegistryObject<Block> REAL_MADRID_BLOCK = createBlock("real_madrid_block");
    public static final RegistryObject<Block> BARCELONA_BLOCK = createBlock("barcelona_block");
    public static final RegistryObject<Block> MAN_CITY_BLOCK = createBlock("man_city_block");
    public static final RegistryObject<Block> MAN_UNITED_BLOCK = createBlock("man_united_block");
    public static final RegistryObject<Block> LIVERPOOL_BLOCK = createBlock("liverpool_block");
    public static final RegistryObject<Block> ARSENAL_BLOCK = createBlock("arsenal_block");
    public static final RegistryObject<Block> CHELSEA_BLOCK = createBlock("chelsea_block");
    public static final RegistryObject<Block> PSG_BLOCK = createBlock("psg_block");
    public static final RegistryObject<Block> BAYERN_BLOCK = createBlock("bayern_block");
    public static final RegistryObject<Block> DORTMUND_BLOCK = createBlock("dortmund_block");
    public static final RegistryObject<Block> JUVENTUS_BLOCK = createBlock("juventus_block");
    public static final RegistryObject<Block> MILAN_BLOCK = createBlock("milan_block");
    public static final RegistryObject<Block> INTER_BLOCK = createBlock("inter_block");
    public static final RegistryObject<Block> BENFICA_BLOCK = createBlock("benfica_block");
    public static final RegistryObject<Block> BOCA_JUNIORS_BLOCK = createBlock("boca_juniors_block");
    public static final RegistryObject<Block> RIVER_PLATE_BLOCK = createBlock("river_plate_block");
    public static final RegistryObject<Block> PENAROL_BLOCK = createBlock("penarol_block");
    public static final RegistryObject<Block> NACIONAL_URU_BLOCK = createBlock("nacional_uru_block");
    public static final RegistryObject<Block> OLIMPIA_BLOCK = createBlock("olimpia_block");
    public static final RegistryObject<Block> COLO_COLO_BLOCK = createBlock("colo_colo_block");

    private static RegistryObject<Block> createBlock(String name) {
        return registerBlock(name, () -> new BahColors(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}