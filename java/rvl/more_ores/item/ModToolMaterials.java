package rvl.more_ores.item;


import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {


    ALUMINIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 300,  13, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    TIN(BlockTags.INCORRECT_FOR_STONE_TOOL, 140,  6, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    BRONZE(BlockTags.INCORRECT_FOR_STONE_TOOL, 200, 12, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 750,15, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    CHROME(BlockTags.INCORRECT_FOR_STONE_TOOL, 145, 5, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    NIKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    PLOMB(BlockTags.INCORRECT_FOR_GOLD_TOOL, 150, 4, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    SILVER(BlockTags.INCORRECT_FOR_GOLD_TOOL, 60, 8, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    TITANIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 6, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    ZINC(BlockTags.INCORRECT_FOR_STONE_TOOL, 110, 5, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    VOLCANITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1250, 7, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    SOULRITE(BlockTags.INCORRECT_FOR_GOLD_TOOL, 1000, 10, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT)),

    RACKNITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 5, () -> Ingredient.of(ModItems.RACKNITE_INGOT)),

    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1800, 10, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey<Block> tagKey, final int j, final int k , final Supplier<Ingredient> supplier) {
        this.incorrectBlocksForDrops = tagKey;
        this.uses = j;
        this.enchantmentValue = k;
        this.repairIngredient = Suppliers.memoize(supplier::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return 0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0f;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}

