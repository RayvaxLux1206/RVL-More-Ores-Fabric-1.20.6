package rvl.more_ores.worldGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import rvl.more_ores.RayvaxLuxMod;

public class OreGen {

    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_aluminium"));
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_tin"));
    public static final ResourceKey<PlacedFeature> CHROME_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_chrome"));
    public static final ResourceKey<PlacedFeature> NIKEL_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_nikel"));
    public static final ResourceKey<PlacedFeature> PLOMB_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_plomb"));
    public static final ResourceKey<PlacedFeature> SILICON_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_silicon"));
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_silver"));
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_titanium"));
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_zinc"));
    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_salt"));
    public static final ResourceKey<PlacedFeature> ARSENIC_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_arsenic"));
    public static final ResourceKey<PlacedFeature> LITHIUM_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID,"ore_lithium"));

    public static final ResourceKey<PlacedFeature> VOLCANIITE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID, "ore_volcanite"));
    public static final ResourceKey<PlacedFeature> SOULRITE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID, "ore_soulrite"));
    public static final ResourceKey<PlacedFeature> RACKNITE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID, "ore_racknite"));
    public static final ResourceKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RayvaxLuxMod.MODID, "ore_enderite"));



    public static void oreGeneration() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ALUMINIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, CHROME_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, NIKEL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, PLOMB_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SILICON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SILVER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ZINC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SALT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ARSENIC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, LITHIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, VOLCANIITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, SOULRITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, RACKNITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Decoration.UNDERGROUND_ORES, ENDERITE_ORE_PLACED_KEY);

    }
}
