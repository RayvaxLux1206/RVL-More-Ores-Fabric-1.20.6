package rvl.more_ores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import rvl.more_ores.RayvaxLuxMod;
import rvl.more_ores.block.ModBlocks;

public class ModItemGroups {

    public static CreativeModeTab OVERWORLD_ORES;
    public static CreativeModeTab OTHERWORLD_ORES;
    public static CreativeModeTab MORE_ORES_EQUIPEMENT;

    public static String key1 = "overworld_ores";
    public static String key2 = "otherworld_ores";
    public static String key3 = "more-ores_equipement";

    private static String ig = "itemgroup.";


    private static CreativeModeTab register(String key, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(key), tab);
    }


    public static void registerItemGroups() {
        OVERWORLD_ORES = register(key1, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 2).title(Component.translatable(ig + key1)).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT))
                .displayItems((itemDisplayParameters, output) -> {

                    //Aluminium
                    output.accept(ModItems.ALUMINIUM_INGOT);
                    output.accept(ModItems.ALUMINIUM_RAW);

                    output.accept(ModBlocks.ALUMINIUM_BLOCK);
                    output.accept(ModBlocks.ALUMINIUM_ORE);
                    output.accept(ModBlocks.ALUMINIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

                    //Tin
                    output.accept(ModItems.TIN_INGOT);
                    output.accept(ModItems.TIN_RAW);

                    output.accept(ModBlocks.TIN_BLOCK);
                    output.accept(ModBlocks.TIN_ORE);
                    output.accept(ModBlocks.TIN_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_TIN_ORE);

                    //BRONZE
                    output.accept(ModItems.BRONZE_INGOT);
                    output.accept(ModItems.BRONZE_ALLOY);

                    output.accept(ModBlocks.BRONZE_BLOCK);
                    output.accept(ModBlocks.ALLOY_BRONZE_BLOCK);

                    //STEEL
                    output.accept(ModItems.STEEL_INGOT);
                    output.accept(ModItems.STEEL_ALLOY);

                    output.accept(ModBlocks.STEEL_BLOCK);
                    output.accept(ModBlocks.ALLOY_STEEL_BLOCK);

                    //CHROME
                    output.accept(ModItems.CHROME_INGOT);
                    output.accept(ModItems.CHROME_RAW);

                    output.accept(ModBlocks.CHROME_BLOCK);
                    output.accept(ModBlocks.CHROME_ORE);
                    output.accept(ModBlocks.CHROME_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_CHROME_ORE);

                    //NIKEL
                    output.accept(ModItems.NIKEL_INGOT);
                    output.accept(ModItems.NIKEL_RAW);

                    output.accept(ModBlocks.NIKEL_BLOCK);
                    output.accept(ModBlocks.NIKEL_ORE);
                    output.accept(ModBlocks.NIKEL_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_NIKEL_ORE);

                    //PLOMB
                    output.accept(ModItems.PLOMB_INGOT);
                    output.accept(ModItems.PLOMB_RAW);

                    output.accept(ModBlocks.PLOMB_BLOCK);
                    output.accept(ModBlocks.PLOMB_ORE);
                    output.accept(ModBlocks.PLOMB_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_PLOMB_ORE);

                    //SILICON
                    output.accept(ModItems.SILICON_INGOT);
                    output.accept(ModItems.SILICON_RAW);

                    output.accept(ModBlocks.SILICON_BLOCK);
                    output.accept(ModBlocks.SILICON_ORE);
                    output.accept(ModBlocks.SILICON_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SILICON_ORE);

                    //SILVER
                    output.accept(ModItems.SILVER_INGOT);
                    output.accept(ModItems.SILVER_RAW);

                    output.accept(ModBlocks.SILVER_BLOCK);
                    output.accept(ModBlocks.SILVER_ORE);
                    output.accept(ModBlocks.SILVER_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SILVER_ORE);

                    //TITANIUM
                    output.accept(ModItems.TITANIUM_INGOT);
                    output.accept(ModItems.TITANIUM_RAW);

                    output.accept(ModBlocks.TITANIUM_BLOCK);
                    output.accept(ModBlocks.TITANIUM_ORE);
                    output.accept(ModBlocks.TITANIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE);

                    //ZINC
                    output.accept(ModItems.ZINC_INGOT);
                    output.accept(ModItems.ZINC_RAW);

                    output.accept(ModBlocks.ZINC_BLOCK);
                    output.accept(ModBlocks.ZINC_ORE);
                    output.accept(ModBlocks.ZINC_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_ZINC_ORE);

                    //SALT
                    output.accept(ModItems.SODIUM_INGOT);
                    output.accept(ModItems.SALT);

                    output.accept(ModBlocks.SODIUM_BLOCK);
                    output.accept(ModBlocks.SALT_ORE);
                    output.accept(ModBlocks.SALT_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SALT_ORE);

                    //LITHIUM
                    output.accept(ModItems.LITHIUM_INGOT);
                    output.accept(ModItems.LITHIUM_RAW);

                    output.accept(ModBlocks.LITHIUM_BLOCK);
                    output.accept(ModBlocks.LITHIUM_ORE);
                    output.accept(ModBlocks.LITHIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_LITHIUM_ORE);

                    //ARSENIC
                    output.accept(ModItems.ARSENIC);
                    output.accept(ModBlocks.ARSENIC_BLOCK);
                    output.accept(ModBlocks.ARSENIC_ORE);
                    output.accept(ModBlocks.DEEPSLATE_ARSENIC_ORE);
                }).build());

        MORE_ORES_EQUIPEMENT = register(key3, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable(ig + key3)).icon(() -> new ItemStack(ModItems.BRONZE_SWORD))
                .displayItems((itemDisplayParameters, output) -> {
                    //ALUMINIUM
                    output.accept(ModItems.ALUMINIUM_HELMET);
                    output.accept(ModItems.ALUMINIUM_CHESTPLATE);
                    output.accept(ModItems.ALUMINIUM_LEGGINGS);
                    output.accept(ModItems.ALUMINIUM_BOOTS);

                    output.accept(ModItems.ALUMINIUM_PICKAXE);
                    output.accept(ModItems.ALUMINIUM_SHOVEL);
                    output.accept(ModItems.ALUMINIUM_AXE);
                    output.accept(ModItems.ALUMINIUM_HOE);
                    output.accept(ModItems.ALUMINIUM_SWORD);

                    //Tin
                    output.accept(ModItems.TIN_HELMET);
                    output.accept(ModItems.TIN_CHESTPLATE);
                    output.accept(ModItems.TIN_LEGGINGS);
                    output.accept(ModItems.TIN_BOOTS);

                    output.accept(ModItems.TIN_PICKAXE);
                    output.accept(ModItems.TIN_SHOVEL);
                    output.accept(ModItems.TIN_AXE);
                    output.accept(ModItems.TIN_HOE);
                    output.accept(ModItems.TIN_SWORD);


                    //BRONZE
                    output.accept(ModItems.BRONZE_HELMET);
                    output.accept(ModItems.BRONZE_CHESTPLATE);
                    output.accept(ModItems.BRONZE_LEGGINGS);
                    output.accept(ModItems.BRONZE_BOOTS);

                    output.accept(ModItems.BRONZE_PICKAXE);
                    output.accept(ModItems.BRONZE_SHOVEL);
                    output.accept(ModItems.BRONZE_AXE);
                    output.accept(ModItems.BRONZE_HOE);
                    output.accept(ModItems.BRONZE_SWORD);


                    //STEEL
                    output.accept(ModItems.STEEL_HELMET);
                    output.accept(ModItems.STEEL_CHESTPLATE);
                    output.accept(ModItems.STEEL_LEGGINGS);
                    output.accept(ModItems.STEEL_BOOTS);

                    output.accept(ModItems.STEEL_PICKAXE);
                    output.accept(ModItems.STEEL_SHOVEL);
                    output.accept(ModItems.STEEL_AXE);
                    output.accept(ModItems.STEEL_HOE);
                    output.accept(ModItems.STEEL_SWORD);


                    //CHROME
                    output.accept(ModItems.CHROME_HELMET);
                    output.accept(ModItems.CHROME_CHESTPLATE);
                    output.accept(ModItems.CHROME_LEGGINGS);
                    output.accept(ModItems.CHROME_BOOTS);

                    output.accept(ModItems.CHROME_PICKAXE);
                    output.accept(ModItems.CHROME_SHOVEL);
                    output.accept(ModItems.CHROME_AXE);
                    output.accept(ModItems.CHROME_HOE);
                    output.accept(ModItems.CHROME_SWORD);


                    //NIKEL
                    output.accept(ModItems.NIKEL_HELMET);
                    output.accept(ModItems.NIKEL_CHESTPLATE);
                    output.accept(ModItems.NIKEL_LEGGINGS);
                    output.accept(ModItems.NIKEL_BOOTS);

                    output.accept(ModItems.NIKEL_PICKAXE);
                    output.accept(ModItems.NIKEL_SHOVEL);
                    output.accept(ModItems.NIKEL_AXE);
                    output.accept(ModItems.NIKEL_HOE);
                    output.accept(ModItems.NIKEL_SWORD);


                    //PLOMB
                    output.accept(ModItems.PLOMB_HELMET);
                    output.accept(ModItems.PLOMB_CHESTPLATE);
                    output.accept(ModItems.PLOMB_LEGGINGS);
                    output.accept(ModItems.PLOMB_BOOTS);

                    output.accept(ModItems.PLOMB_PICKAXE);
                    output.accept(ModItems.PLOMB_SHOVEL);
                    output.accept(ModItems.PLOMB_AXE);
                    output.accept(ModItems.PLOMB_HOE);
                    output.accept(ModItems.PLOMB_SWORD);


                    //SILVER
                    output.accept(ModItems.SILVER_HELMET);
                    output.accept(ModItems.SILVER_CHESTPLATE);
                    output.accept(ModItems.SILVER_LEGGINGS);
                    output.accept(ModItems.SILVER_BOOTS);

                    output.accept(ModItems.SILVER_PICKAXE);
                    output.accept(ModItems.SILVER_SHOVEL);
                    output.accept(ModItems.SILVER_AXE);
                    output.accept(ModItems.SILVER_HOE);
                    output.accept(ModItems.SILVER_SWORD);


                    //TITANIUM
                    output.accept(ModItems.TITANIUM_HELMET);
                    output.accept(ModItems.TITANIUM_CHESTPLATE);
                    output.accept(ModItems.TITANIUM_LEGGINGS);
                    output.accept(ModItems.TITANIUM_BOOTS);

                    output.accept(ModItems.TITANIUM_PICKAXE);
                    output.accept(ModItems.TITANIUM_SHOVEL);
                    output.accept(ModItems.TITANIUM_AXE);
                    output.accept(ModItems.TITANIUM_HOE);
                    output.accept(ModItems.TITANIUM_SWORD);


                    //ZINC
                    output.accept(ModItems.ZINC_HELMET);
                    output.accept(ModItems.ZINC_CHESTPLATE);
                    output.accept(ModItems.ZINC_LEGGINGS);
                    output.accept(ModItems.ZINC_BOOTS);

                    output.accept(ModItems.ZINC_PICKAXE);
                    output.accept(ModItems.ZINC_SHOVEL);
                    output.accept(ModItems.ZINC_AXE);
                    output.accept(ModItems.ZINC_HOE);
                    output.accept(ModItems.ZINC_SWORD);

                    //Volcanite
                    output.accept(ModItems.VOLCANITE_HELMET);
                    output.accept(ModItems.VOLCANITE_CHESTPLATE);
                    output.accept(ModItems.VOLCANITE_LEGGINGS);
                    output.accept(ModItems.VOLCANITE_BOOTS);

                    output.accept(ModItems.VOLCANITE_PICKAXE);
                    output.accept(ModItems.VOLCANITE_SHOVEL);
                    output.accept(ModItems.VOLCANITE_AXE);
                    output.accept(ModItems.VOLCANITE_HOE);
                    output.accept(ModItems.VOLCANITE_SWORD);

                    //Soulrite
                    output.accept(ModItems.SOULRITE_HELMET);
                    output.accept(ModItems.SOULRITE_CHESTPLATE);
                    output.accept(ModItems.SOULRITE_LEGGINGS);
                    output.accept(ModItems.SOULRITE_BOOTS);

                    output.accept(ModItems.SOULRITE_PICKAXE);
                    output.accept(ModItems.SOULRITE_SHOVEL);
                    output.accept(ModItems.SOULRITE_AXE);
                    output.accept(ModItems.SOULRITE_HOE);
                    output.accept(ModItems.SOULRITE_SWORD);

                    //Racknite
                    output.accept(ModItems.RACKNITE_HELMET);
                    output.accept(ModItems.RACKNITE_CHESTPLATE);
                    output.accept(ModItems.RACKNITE_LEGGINGS);
                    output.accept(ModItems.RACKNITE_BOOTS);

                    output.accept(ModItems.RACKNITE_PICKAXE);
                    output.accept(ModItems.RACKNITE_SHOVEL);
                    output.accept(ModItems.RACKNITE_AXE);
                    output.accept(ModItems.RACKNITE_HOE);
                    output.accept(ModItems.RACKNITE_SWORD);

                    //Enderite
                    output.accept(ModItems.ENDERITE_HELMET);
                    output.accept(ModItems.ENDERITE_CHESTPLATE);
                    output.accept(ModItems.ENDERITE_LEGGINGS);
                    output.accept(ModItems.ENDERITE_BOOTS);

                    output.accept(ModItems.ENDERITE_PICKAXE);
                    output.accept(ModItems.ENDERITE_SHOVEL);
                    output.accept(ModItems.ENDERITE_AXE);
                    output.accept(ModItems.ENDERITE_HOE);
                    output.accept(ModItems.ENDERITE_SWORD);
                }).build());

        OTHERWORLD_ORES = register(key2, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1).title(Component.translatable(ig + key2)).icon(() -> new ItemStack(Blocks.NETHERRACK))
                .displayItems((itemDisplayParameters, output) -> {
                    //Volcanite
                    output.accept(ModItems.VOLCANITE_INGOT);
                    output.accept(ModItems.VOLCANITE_RAW);

                    output.accept(ModBlocks.BASALT_VOLCANITE_ORE);
                    output.accept(ModBlocks.BLACKSTONE_VOLCANITE_ORE);
                    output.accept(ModBlocks.VOLCANITE_BLOCK);
                    output.accept(ModBlocks.VOLCANITE_ORE_BLOCK);

                    //Soulrite
                    output.accept(ModItems.SOULRITE_INGOT);
                    output.accept(ModItems.SOULRITE_RAW);

                    output.accept(ModBlocks.SOUL_SAND_SOULRITE_ORE);
                    output.accept(ModBlocks.SOUL_SOIL_SOULRITE_ORE);
                    output.accept(ModBlocks.SOULRITE_BLOCK);
                    output.accept(ModBlocks.SOULRITE_ORE_BLOCK);

                    //Racknite
                    output.accept(ModItems.RACKNITE_INGOT);
                    output.accept(ModItems.RACKNITE_RAW);

                    output.accept(ModBlocks.RACKNITE_ORE);
                    output.accept(ModBlocks.RACKNITE_BLOCK);
                    output.accept(ModBlocks.RACKNITE_ORE_BLOCK);

                    //Enderite
                    output.accept(ModItems.ENDERITE_INGOT);
                    output.accept(ModItems.ENDERITE_RAW);

                    output.accept(ModBlocks.ENDERITE_ORE);
                    output.accept(ModBlocks.ENDERITE_BLOCK);
                    output.accept(ModBlocks.ENDERITE_ORE_BLOCK);
                }).build());

    }
}
    
    

