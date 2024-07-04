package rvl.more_ores.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> ALUMINIUM;
    public static final Holder<ArmorMaterial> TIN;
    public static final Holder<ArmorMaterial> BRONZE;
    public static final Holder<ArmorMaterial> STEEL;
    public static final Holder<ArmorMaterial> CHROME;
    public static final Holder<ArmorMaterial> NIKEL;
    public static final Holder<ArmorMaterial> PLOMB;
    public static final Holder<ArmorMaterial> SILVER;
    public static final Holder<ArmorMaterial> TITANIUM;
    public static final Holder<ArmorMaterial> ZINC;
    public static final Holder<ArmorMaterial> VOLCANITE;
    public static final Holder<ArmorMaterial> SOULRITE;
    public static final Holder<ArmorMaterial> RACKNITE;
    public static final Holder<ArmorMaterial> ENDERITE;

    public ModArmorMaterials() {
    }


    private static Holder<ArmorMaterial> register(String string, EnumMap<ArmorItem.Type, Integer> enumMap, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(new ResourceLocation(string)));
        return register(string, enumMap, i, holder, f, g, supplier, list);
    }

    private static Holder<ArmorMaterial> register(String string, EnumMap<ArmorItem.Type, Integer> enumMap, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier, List<ArmorMaterial.Layer> list) {
        EnumMap<ArmorItem.Type, Integer> enumMap2 = new EnumMap(ArmorItem.Type.class);
        ArmorItem.Type[] var9 = ArmorItem.Type.values();
        int var10 = var9.length;

        for (int var11 = 0; var11 < var10; ++var11) {
            ArmorItem.Type type = var9[var11];
            enumMap2.put(type, (Integer) enumMap.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, new ResourceLocation(string), new ArmorMaterial(enumMap2, i, holder, supplier, list, f, g));
    }

    static {
        ALUMINIUM = register("aluminium", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 5);
        }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
            return Ingredient.of(new ItemLike[]{ModItems.ALUMINIUM_INGOT});
        });

        TIN = register("tin", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 1);
            enumMap.put(ArmorItem.Type.LEGGINGS, 3);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 3);
        }), 6, SoundEvents.ARMOR_EQUIP_GOLD, 0F, 0F, () -> {
            return Ingredient.of(new ItemLike[]{ModItems.TIN_INGOT});
        });
        BRONZE = register("bronze", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 4);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 4);
        }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.BRONZE_INGOT});
        });
        STEEL = register("steel", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 6);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
            enumMap.put(ArmorItem.Type.HELMET, 5);
            enumMap.put(ArmorItem.Type.BODY, 5);
        }), 12, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.STEEL_INGOT});
        });
        CHROME = register("chrome", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 3);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 4);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 2);
        }), 10, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.CHROME_INGOT});
        });
        NIKEL = register("nikel", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 5);
        }), 9, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.NIKEL_INGOT});
        });
        PLOMB = register("plomb", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 1);
            enumMap.put(ArmorItem.Type.LEGGINGS, 3);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 4);
        }), 10, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.PLOMB_INGOT});
        });
        SILVER = register("silver", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 1);
            enumMap.put(ArmorItem.Type.LEGGINGS, 3);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 4);
        }), 12, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.SILVER_INGOT});
        });
        TITANIUM = register("titanium", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
            enumMap.put(ArmorItem.Type.HELMET, 3);
            enumMap.put(ArmorItem.Type.BODY, 5);
        }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.TITANIUM_INGOT});
        });
        ZINC = register("zinc", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 3);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 3);
        }), 10, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.ZINC_INGOT});
        });
        VOLCANITE = register("volcanite", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 3);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
            enumMap.put(ArmorItem.Type.HELMET, 3);
            enumMap.put(ArmorItem.Type.BODY, 6);
        }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.VOLCANITE_INGOT});
        });
        SOULRITE = register("soulrite", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 3);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
            enumMap.put(ArmorItem.Type.HELMET, 3);
            enumMap.put(ArmorItem.Type.BODY, 6);
        }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.SOULRITE_INGOT});
        });
        RACKNITE = register("racknite", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 2);
            enumMap.put(ArmorItem.Type.LEGGINGS, 5);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
            enumMap.put(ArmorItem.Type.HELMET, 2);
            enumMap.put(ArmorItem.Type.BODY, 5);
        }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.RACKNITE_INGOT});
        });
        ENDERITE = register("enderite", (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
            enumMap.put(ArmorItem.Type.BOOTS, 3);
            enumMap.put(ArmorItem.Type.LEGGINGS, 6);
            enumMap.put(ArmorItem.Type.CHESTPLATE, 8);
            enumMap.put(ArmorItem.Type.HELMET, 4);
            enumMap.put(ArmorItem.Type.BODY, 6);
        }), 15, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.of(new ItemLike[]{
                    ModItems.ENDERITE_INGOT});
        });
    }
}



