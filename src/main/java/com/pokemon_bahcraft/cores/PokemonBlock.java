package com.pokemon_bahcraft.cores;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class PokemonBlock extends Block {

    // 1. Criamos a nossa Propriedade de Enum (Lista de Opções)
    public static final EnumProperty<CorTipo> COLOR = EnumProperty.create("color", CorTipo.class);

    public PokemonBlock(Properties properties) {
        super(properties);
        // Define o estado padrão como BRANCO (Quartz)
        this.registerDefaultState(this.defaultBlockState().setValue(COLOR, CorTipo.WHITE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(COLOR);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack item = player.getItemInHand(hand);

        // Lista de itens que ativam a mudança de cor
        boolean isItemValido = item.getItem() == Items.EMERALD ||
                item.getItem() == Items.GOLD_INGOT ||
                item.getItem() == Items.REDSTONE ||
                item.getItem() == Items.QUARTZ;

        // 1. Se o jogador estiver segurando um dos itens válidos
        if (isItemValido) {

            // 2. Executa a lógica apenas no Servidor (para salvar no mundo)
            if (!level.isClientSide) {
                CorTipo novaCor = null;

                if (item.getItem() == Items.EMERALD) {
                    novaCor = CorTipo.GREEN;
                } else if (item.getItem() == Items.GOLD_INGOT) {
                    novaCor = CorTipo.YELLOW;
                } else if (item.getItem() == Items.REDSTONE) {
                    novaCor = CorTipo.RED;
                } else if (item.getItem() == Items.QUARTZ) {
                    novaCor = CorTipo.WHITE;
                }

                if (novaCor != null) {
                    level.setBlock(pos, state.setValue(COLOR, novaCor), 3);
                }
            }

            // 3. O PULO DO GATO: Retorna SUCCESS em ambos os lados (Cliente e Servidor)
            // Isso diz ao Minecraft: "A interação foi um sucesso, NÃO coloque o bloco/item no chão."
            return InteractionResult.SUCCESS;
        }

        // Se não for um item da lista, deixa o jogo seguir o fluxo normal
        return InteractionResult.PASS;
    }

    // --- DEFINIÇÃO DA ENUM (A LISTA DE CORES) ---
    // Isso ensina ao Minecraft quais nomes usar no arquivo JSON
    public enum CorTipo implements StringRepresentable {
        WHITE("white"),
        GREEN("green"),
        YELLOW("yellow"),
        RED("red");

        private final String name;

        CorTipo(String name) {
            this.name = name;
        }

        @Override
        public @NotNull String getSerializedName() {
            return this.name;
        }
    }
}