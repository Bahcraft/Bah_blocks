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

    // 2. Registar a Aba
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

    // 3. Método para registar no EventBus
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}