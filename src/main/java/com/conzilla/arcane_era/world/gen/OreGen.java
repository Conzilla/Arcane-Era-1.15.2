package com.conzilla.arcane_era.world.gen;

import com.conzilla.arcane_era.arcane_era;
import com.conzilla.arcane_era.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = arcane_era.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen {
    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE","end_stone", new BlockMatcher(Blocks.END_STONE));
    public static OreFeatureConfig.FillerBlockType SANDSTONE = OreFeatureConfig.FillerBlockType.create("SANDSTONE","sandstone", new BlockMatcher(Blocks.SANDSTONE));
    public static OreFeatureConfig.FillerBlockType SAND = OreFeatureConfig.FillerBlockType.create("SANDE","sand", new BlockMatcher(Blocks.SAND));
    public static OreFeatureConfig.FillerBlockType GRAVEL = OreFeatureConfig.FillerBlockType.create("GRAVEL","gravel", new BlockMatcher(Blocks.GRAVEL));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome: ForgeRegistries.BIOMES) {
            if (biome.getCategory() == Biome.Category.NETHER){
                //genOre(biome, 20, 5, 5, 80,OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.SULFUR_ORE_BLOCK.get().getDefaultState(),16);
                //genOre(biome, 1, 8, 2, 16,OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.FRANIUM_ORE.get().getDefaultState(),3);
            } else if (biome.getCategory() == Biome.Category.THEEND){
                //genOre(biome, 4, 3, 3, 60,END_STONE, RegistryHandler.URANIUM_ORE_BLOCK.get().getDefaultState(),10);
            } else {
                if (biome == Biomes.DEEP_OCEAN){
                    //genOre(biome, 9, 30, 5, 60,GRAVEL, RegistryHandler.BLUE_AZURITE_ORE_BLOCK.get().getDefaultState(),9);
                }
                genOre(biome, 1, 8, 2, 16,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ADMANTITE_ORE.get().getDefaultState(),7);
                genOre(biome, 1, 8, 2, 16,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.MYTHRIL_ORE.get().getDefaultState(),7);
                genOre(biome, 1, 3, 2, 10,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORICHALCUM_ORE.get().getDefaultState(),13);
                //genOre(biome, 1, 8, 2, 16,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PALLADIUM_ORE_BLOCK.get().getDefaultState(),7);
                //genOre(biome, 15, 20, 4, 50,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.BURRITO_ORE_BLOCK.get().getDefaultState(),16);
                //genOre(biome, 7, 10, 6, 30,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE_BLOCK.get().getDefaultState(),12);
            }
        }
    }

    public static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count,bottomOffset,topOffset,max);
        OreFeatureConfig feature = new OreFeatureConfig(filler,defaultBlockState,size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}