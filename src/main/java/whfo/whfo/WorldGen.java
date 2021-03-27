package whfo.whfo;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WorldGen {

    public static final ConfiguredFeature<?, ?> iceStoneOre = Feature.ORE.withConfiguration(
            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.ICE_STONE_ORE.get().getDefaultState(), 4))
            .range(12).square()
            .count(3);

    public static void generateOre(final BiomeLoadingEvent event) {
        Whfo.getLOGGER().info("Biome loading event initialized");
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if (event.getCategory().equals(Biome.Category.ICY)) {
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, iceStoneOre);
            Whfo.getLOGGER().info("generating ores in ICY biomes");
        }
    }
}
