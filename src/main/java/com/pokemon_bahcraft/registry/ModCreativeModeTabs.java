package com.pokemon_bahcraft.registry;

import com.pokemon_bahcraft.BahPokemon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    // 1. Criar o Registo Diferido (DeferredRegister) para Abas Criativas
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BahPokemon.MOD_ID);

    // --- ABA 1: POKE ---
    public static final RegistryObject<CreativeModeTab> BAH_TAB = CREATIVE_MODE_TABS.register("bah_tab",
            () -> CreativeModeTab.builder()
                    // Define o ícone da aba (usando o item que criamos no ModItems)
                    .icon(() -> new ItemStack(ModItems.BULBASAUR_ITEM.get()))

                    // Define o Título (a chave de tradução que irá no ficheiro en_us.json)
                    .title(Component.translatable("creativetab.bah_tab"))

                    // Define o que aparece dentro da aba
                    .displayItems((itemDisplayParameters, output) -> {

                        // Adicione aqui TODOS os itens que quer nesta aba
                        output.accept(ModItems.BULBASAUR_ITEM.get());
                        output.accept(ModItems.CHARIZARD_ITEM.get());
                        output.accept(ModItems.EEVEE_ITEM.get());
                        output.accept(ModItems.GENGAR_ITEM.get());
                        output.accept(ModItems.GEODUDE_ITEM.get());
                        output.accept(ModItems.JIGGLYPUFF_ITEM.get());
                        output.accept(ModItems.MEWTWO_ITEM.get());
                        output.accept(ModItems.PIKACHU_ITEM.get());
                        output.accept(ModItems.SNORLAX_ITEM.get());
                        output.accept(ModItems.SQUIRTLE_ITEM.get());



                    })
                    .build());


    // --- ABA 2: FUTEBOL BRA ---
    public static final RegistryObject<CreativeModeTab> BAH_TAB_TIMES = CREATIVE_MODE_TABS.register("bah_tab_times",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.FLAMENGO_BLOCK.get()))
                    .title(Component.translatable("creativetab.bah_tab_times"))
                    .displayItems((parameters, output) -> {


                        output.accept(ModBlocks.PALMEIRAS_BLOCK.get());
                        output.accept(ModBlocks.FLAMENGO_BLOCK.get());
                        output.accept(ModBlocks.BOTAFOGO_BLOCK.get());
                        output.accept(ModBlocks.ATLETICO_MINEIRO_BLOCK.get());
                        output.accept(ModBlocks.SAO_PAULO_BLOCK.get());
                        output.accept(ModBlocks.GREMIO_BLOCK.get());
                        output.accept(ModBlocks.INTERNACIONAL_BLOCK.get());
                        output.accept(ModBlocks.CRUZEIRO_BLOCK.get());
                        output.accept(ModBlocks.CORINTHIANS_BLOCK.get());
                        output.accept(ModBlocks.VASCO_BLOCK.get());
                        output.accept(ModBlocks.FLUMINENSE_BLOCK.get());
                        output.accept(ModBlocks.BRAGANTINO_BLOCK.get());
                        output.accept(ModBlocks.ATHLETICO_PR_BLOCK.get());
                        output.accept(ModBlocks.SANTOS_BLOCK.get());
                        output.accept(ModBlocks.CORITIBA_BLOCK.get());
                        output.accept(ModBlocks.BAHIA_BLOCK.get());
                        output.accept(ModBlocks.CHAPECOENSE_BLOCK.get());
                        output.accept(ModBlocks.VITORIA_BLOCK.get());
                        output.accept(ModBlocks.MIRASSOL_BLOCK.get());
                        output.accept(ModBlocks.REMO_BLOCK.get());

                    })
                    .build());



    // --- ABA 3: FUTEBOL INTERNACIONAL ---
    public static final RegistryObject<CreativeModeTab> BAH_TAB_INTERNATIONAL = CREATIVE_MODE_TABS.register("bah_tab_international",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.REAL_MADRID_BLOCK.get()))
                    .title(Component.translatable("creativetab.bah_tab_international"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.REAL_MADRID_BLOCK.get());
                        output.accept(ModBlocks.BARCELONA_BLOCK.get());
                        output.accept(ModBlocks.MAN_CITY_BLOCK.get());
                        output.accept(ModBlocks.MAN_UNITED_BLOCK.get());
                        output.accept(ModBlocks.LIVERPOOL_BLOCK.get());
                        output.accept(ModBlocks.ARSENAL_BLOCK.get());
                        output.accept(ModBlocks.CHELSEA_BLOCK.get());
                        output.accept(ModBlocks.PSG_BLOCK.get());
                        output.accept(ModBlocks.BAYERN_BLOCK.get());
                        output.accept(ModBlocks.DORTMUND_BLOCK.get());
                        output.accept(ModBlocks.JUVENTUS_BLOCK.get());
                        output.accept(ModBlocks.MILAN_BLOCK.get());
                        output.accept(ModBlocks.INTER_BLOCK.get());
                        output.accept(ModBlocks.BENFICA_BLOCK.get());
                        output.accept(ModBlocks.BOCA_JUNIORS_BLOCK.get());
                        output.accept(ModBlocks.RIVER_PLATE_BLOCK.get());
                        output.accept(ModBlocks.PENAROL_BLOCK.get());
                        output.accept(ModBlocks.NACIONAL_URU_BLOCK.get());
                        output.accept(ModBlocks.OLIMPIA_BLOCK.get());
                        output.accept(ModBlocks.COLO_COLO_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}