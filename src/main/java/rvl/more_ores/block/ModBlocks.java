package rvl.more_ores.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import rvl.more_ores.RayvaxLuxMod;

public class ModBlocks {
    public static Block ALUMINIUM_BLOCK;
    public static Block ALUMINIUM_ORE;
    public static Block ALUMINIUM_ORE_BLOCK;
    public static Block DEEPSLATE_ALUMINIUM_ORE;

    public static Block TIN_BLOCK;
    public static Block TIN_ORE;
    public static Block TIN_ORE_BLOCK;
    public static Block DEEPSLATE_TIN_ORE;

    public static Block BRONZE_BLOCK;
    public static Block ALLOY_BRONZE_BLOCK;
    public static Block STEEL_BLOCK;
    public static Block ALLOY_STEEL_BLOCK;

    public static Block CHROME_BLOCK;
    public static Block CHROME_ORE;
    public static Block CHROME_ORE_BLOCK;
    public static Block DEEPSLATE_CHROME_ORE;

    public static Block NIKEL_BLOCK;
    public static Block NIKEL_ORE;
    public static Block NIKEL_ORE_BLOCK;
    public static Block DEEPSLATE_NIKEL_ORE;

    public static Block PLOMB_BLOCK;
    public static Block PLOMB_ORE;
    public static Block PLOMB_ORE_BLOCK;
    public static Block DEEPSLATE_PLOMB_ORE;


    public static Block SILICON_BLOCK;
    public static Block SILICON_ORE;
    public static Block SILICON_ORE_BLOCK;
    public static Block DEEPSLATE_SILICON_ORE;

    public static Block SILVER_BLOCK;
    public static Block SILVER_ORE;
    public static Block SILVER_ORE_BLOCK;
    public static Block DEEPSLATE_SILVER_ORE;

    public static Block TITANIUM_BLOCK;
    public static Block TITANIUM_ORE;
    public static Block TITANIUM_ORE_BLOCK;
    public static Block DEEPSLATE_TITANIUM_ORE;

    public static Block ZINC_BLOCK;
    public static Block ZINC_ORE;
    public static Block ZINC_ORE_BLOCK;
    public static Block DEEPSLATE_ZINC_ORE;

    public static Block SODIUM_BLOCK;
    public static Block SALT_ORE;
    public static Block SALT_BLOCK;
    public static Block DEEPSLATE_SALT_ORE;

    public static Block LITHIUM_BLOCK;
    public static Block LITHIUM_ORE;
    public static Block LITHIUM_ORE_BLOCK;
    public static Block DEEPSLATE_LITHIUM_ORE;

    public static Block ARSENIC_BLOCK;
    public static Block ARSENIC_ORE;
    public static Block DEEPSLATE_ARSENIC_ORE;

    public static Block BASALT_VOLCANITE_ORE;
    public static Block BLACKSTONE_VOLCANITE_ORE;
    public static Block VOLCANITE_ORE_BLOCK;
    public static Block VOLCANITE_BLOCK;

    public static Block SOUL_SAND_SOULRITE_ORE;
    public static Block SOUL_SOIL_SOULRITE_ORE;
    public static Block SOULRITE_ORE_BLOCK;
    public static Block SOULRITE_BLOCK;

    public static Block RACKNITE_ORE;
    public static Block RACKNITE_ORE_BLOCK;
    public static Block RACKNITE_BLOCK;

    public static Block ENDERITE_ORE;
    public static Block ENDERITE_ORE_BLOCK;
    public static Block ENDERITE_BLOCK;
    





     public static void registerModBlocks() {
         DEEPSLATE_ALUMINIUM_ORE = registerBlocks("deepslate_aluminium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3F).sound(SoundType.DEEPSLATE)));
         ALUMINIUM_ORE = registerBlocks("aluminium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3F, 3F).sound(SoundType.STONE)));
         ALUMINIUM_BLOCK = registerBlocks("aluminium_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         ALUMINIUM_ORE_BLOCK = registerBlocks("aluminium_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Tin Blocks
         DEEPSLATE_TIN_ORE = registerBlocks("deepslate_tin_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         TIN_ORE = registerBlocks("tin_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         TIN_BLOCK = registerBlocks("tin_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         TIN_ORE_BLOCK = registerBlocks("tin_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Alloy Blocks -Bronze -Copper
         BRONZE_BLOCK = registerBlocks("bronze_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         ALLOY_BRONZE_BLOCK = registerBlocks("alloy_bronze_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         STEEL_BLOCK = registerBlocks("steel_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         ALLOY_STEEL_BLOCK = registerBlocks("alloy_steel_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Chrome Blocks
         DEEPSLATE_CHROME_ORE = registerBlocks("deepslate_chrome_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         CHROME_ORE = registerBlocks("chrome_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         CHROME_BLOCK = registerBlocks("chrome_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         CHROME_ORE_BLOCK = registerBlocks("chrome_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Nikel Blocks
         DEEPSLATE_NIKEL_ORE = registerBlocks("deepslate_nikel_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         NIKEL_ORE = registerBlocks("nikel_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         NIKEL_BLOCK = registerBlocks("nikel_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         NIKEL_ORE_BLOCK = registerBlocks("nikel_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Plomb Blocks
         DEEPSLATE_PLOMB_ORE = registerBlocks("deepslate_plomb_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         PLOMB_ORE = registerBlocks("plomb_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         PLOMB_BLOCK = registerBlocks("plomb_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         PLOMB_ORE_BLOCK = registerBlocks("plomb_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Silicon Blocks
         DEEPSLATE_SILICON_ORE = registerBlocks("deepslate_silicon_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         SILICON_ORE = registerBlocks("silicon_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         SILICON_BLOCK = registerBlocks("silicon_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         SILICON_ORE_BLOCK = registerBlocks("silicon_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Silver Blocks
         DEEPSLATE_SILVER_ORE = registerBlocks("deepslate_silver_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         SILVER_ORE = registerBlocks("silver_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         SILVER_BLOCK = registerBlocks("silver_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         SILVER_ORE_BLOCK = registerBlocks("silver_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Titanium Blocks
         DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         TITANIUM_ORE = registerBlocks("titanium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         TITANIUM_BLOCK = registerBlocks("titanium_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         TITANIUM_ORE_BLOCK = registerBlocks("titanium_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Zinc Blocks
         DEEPSLATE_ZINC_ORE = registerBlocks("deepslate_zinc_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         ZINC_ORE = registerBlocks("zinc_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         ZINC_BLOCK = registerBlocks("zinc_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         ZINC_ORE_BLOCK = registerBlocks("zinc_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

        //Other Ores
         DEEPSLATE_SALT_ORE = registerBlocks("deepslate_salt_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         SALT_ORE = registerBlocks("salt_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         SALT_BLOCK = registerBlocks("salt_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         SODIUM_BLOCK = registerBlocks("sodium_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));


         DEEPSLATE_ARSENIC_ORE = registerBlocks("deepslate_arsenic_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         ARSENIC_ORE = registerBlocks("arsenic_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         ARSENIC_BLOCK = registerBlocks("arsenic_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));


         DEEPSLATE_LITHIUM_ORE = registerBlocks("deepslate_lithium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.DEEPSLATE)));
         LITHIUM_ORE = registerBlocks("lithium_ore",
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.5F, 3.0F).sound(SoundType.STONE)));
         LITHIUM_ORE_BLOCK = registerBlocks("lithium_ore_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         LITHIUM_BLOCK = registerBlocks("lithium_block",
                new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         //Volcanite
         BLACKSTONE_VOLCANITE_ORE = registerBlocks("blackstone_volcanite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F)));
         BASALT_VOLCANITE_ORE = registerBlocks("basalt_volcanite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.BASALT)));
         VOLCANITE_ORE_BLOCK = registerBlocks("volcanite_ore_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         VOLCANITE_BLOCK = registerBlocks("volcanite_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         //Soulrite
         SOUL_SAND_SOULRITE_ORE = registerBlocks("soul_sand_soulrite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.COW_BELL).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.SOUL_SAND)));
         SOUL_SOIL_SOULRITE_ORE = registerBlocks("soul_soil_soulrite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.COW_BELL).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.SOUL_SOIL)));
         SOULRITE_ORE_BLOCK = registerBlocks("soulrite_ore_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         SOULRITE_BLOCK = registerBlocks("soulrite_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         //Racknite
         RACKNITE_ORE = registerBlocks("racknite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F).sound(SoundType.NETHERRACK)));
         RACKNITE_ORE_BLOCK = registerBlocks("racknite_ore_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         RACKNITE_BLOCK = registerBlocks("racknite_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

         //Enderite
         ENDERITE_ORE = registerBlocks("enderite_ore",
                 new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4F, 3.0F)));
         ENDERITE_ORE_BLOCK = registerBlocks("enderite_ore_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
         ENDERITE_BLOCK = registerBlocks("enderite_block",
                 new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    }
    private static Block registerBlocks(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(RayvaxLuxMod.MODID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(RayvaxLuxMod.MODID, name),
                new BlockItem(block, new Item.Properties()));
        return item;
    }
}
