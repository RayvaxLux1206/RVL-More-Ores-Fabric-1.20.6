/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.more_ores.item;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FixHoeItem
extends FixToolItem {
    protected static final Map<Block, Pair<Predicate<UseOnContext>, Consumer<UseOnContext>>> TILLABLES;

    public FixHoeItem(Tier tier, Item.Properties properties) {
        super(tier, BlockTags.MINEABLE_WITH_HOE, properties);
    }

    public InteractionResult useOn(UseOnContext useOnContext) {
        Level level = useOnContext.getLevel();
        BlockPos blockPos = useOnContext.getClickedPos();
        Pair<Predicate<UseOnContext>, Consumer<UseOnContext>> pair = (Pair)TILLABLES.get(level.getBlockState(blockPos).getBlock());
        if (pair == null) {
            return InteractionResult.PASS;
        } else {
            Predicate<UseOnContext> predicate = (Predicate)pair.getFirst();
            Consumer<UseOnContext> consumer = (Consumer)pair.getSecond();
            if (predicate.test(useOnContext)) {
                Player player = useOnContext.getPlayer();
                level.playSound(player, blockPos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!level.isClientSide) {
                    consumer.accept(useOnContext);
                    if (player != null) {
                        useOnContext.getItemInHand().hurtAndBreak(1, player, LivingEntity.getSlotForHand(useOnContext.getHand()));
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    public static Consumer<UseOnContext> changeIntoState(BlockState blockState) {
        return (useOnContext) -> {
            useOnContext.getLevel().setBlock(useOnContext.getClickedPos(), blockState, 11);
            useOnContext.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, useOnContext.getClickedPos(), GameEvent.Context.of(useOnContext.getPlayer(), blockState));
        };
    }

    public static Consumer<UseOnContext> changeIntoStateAndDropItem(BlockState blockState, ItemLike itemLike) {
        return (useOnContext) -> {
            useOnContext.getLevel().setBlock(useOnContext.getClickedPos(), blockState, 11);
            useOnContext.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, useOnContext.getClickedPos(), GameEvent.Context.of(useOnContext.getPlayer(), blockState));
            Block.popResourceFromFace(useOnContext.getLevel(), useOnContext.getClickedPos(), useOnContext.getClickedFace(), new ItemStack(itemLike));
        };
    }

    public static boolean onlyIfAirAbove(UseOnContext useOnContext) {
        return useOnContext.getClickedFace() != Direction.DOWN && useOnContext.getLevel().getBlockState(useOnContext.getClickedPos().above()).isAir();
    }

    static {
        TILLABLES = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT_PATH, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.COARSE_DIRT, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.DIRT.defaultBlockState())), Blocks.ROOTED_DIRT, Pair.of((useOnContext) -> {
            return true;
        }, changeIntoStateAndDropItem(Blocks.DIRT.defaultBlockState(), Items.HANGING_ROOTS))));
    }
}

