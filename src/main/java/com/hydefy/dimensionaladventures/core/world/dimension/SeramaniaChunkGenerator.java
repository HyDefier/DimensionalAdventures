package com.hydefy.dimensionaladventures.core.world.dimension;

import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.world.biome.SeramaniaBiomes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.RegistryLookupCodec;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.*;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.blending.Blender;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

//TODO consider using NoiseBasedChunkGenerator
public class SeramaniaChunkGenerator extends ChunkGenerator {

    private int yOffset = 57;
    private int genSlope = 0;

    final private int MIN_Y_OFFSET = 44;
    final private int MAX_Y_OFFSET = 64;
    final private int MAX_SLOPE = 2;

    private static final Codec<Settings> SETTINGS_CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.INT.fieldOf("base").forGetter(Settings::baseHeight),
                    Codec.FLOAT.fieldOf("verticalvariance").forGetter(Settings::verticalVariance),
                    Codec.FLOAT.fieldOf("horizontalvariance").forGetter(Settings::horizontalVariance)
            ).apply(instance, Settings::new));

    public static final Codec<SeramaniaChunkGenerator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    RegistryLookupCodec.create(Registry.BIOME_REGISTRY).forGetter(SeramaniaChunkGenerator::getBiomeRegistry),
                    SETTINGS_CODEC.fieldOf("settings").forGetter(SeramaniaChunkGenerator::getTutorialSettings)
            ).apply(instance, SeramaniaChunkGenerator::new));

    private final Settings settings;

    public SeramaniaChunkGenerator(Registry<Biome> registry, Settings settings) {
        super(new SeramaniaBiomeProvider(registry), new StructureSettings(false));
        this.settings = settings;
        //TODO implement logger
        //DimensionalAdventures.LOGGER.info("Chunk generator settings: " + settings.baseHeight() + ", " + settings.horizontalVariance() + ", " + settings.verticalVariance());
    }

    public Settings getTutorialSettings() {
        return settings;
    }

    public Registry<Biome> getBiomeRegistry() {
        return ((SeramaniaBiomeProvider)biomeSource).getBiomeRegistry();
    }

    @Override
    public void buildSurface(WorldGenRegion region, StructureFeatureManager featureManager, ChunkAccess chunk) {
        BlockState crust = Blocks.BEDROCK.defaultBlockState();
        //TODO floating islands above y=196
        //TODO get structures, trees, and other vegetation generating
        //TODO make an "undercrust area accessible only with special tool"
        //TODO make custom bedrock called Nokin BLock
        //TODO check for biome to determine resource type
        //TODO Create Chunk elevation map from a seed
        BlockState underground = Blocks.STONE.defaultBlockState();
        BlockState belowTopsoil = Blocks.DIRT.defaultBlockState();
        BlockState underwaterSurface = Blocks.GRAVEL.defaultBlockState();
        BlockState topsoil = Blocks.GRASS_BLOCK.defaultBlockState();
        BlockState ocean = Blocks.WATER.defaultBlockState();
        BlockState beachSurface = Blocks.SAND.defaultBlockState();
        BlockState scatteredOre = BlockInit.STEEL_SCRAP_BLOCK.get().defaultBlockState();
        BlockState feathers = BlockInit.FEATHER_BLOCK.get().defaultBlockState();
        BlockState floatingFeature = Blocks.CANDLE.defaultBlockState();
        ChunkPos chunkpos = chunk.getPos();

        final int BELOW_TOPSOIL_THICKNESS = 3;
        final int UNDERWATER_SURFACE_THICKNESS = 1;

        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        int x;
        int z;

        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                chunk.setBlockState(pos.set(x, getMinY(), z), crust, false);
            }
        }

        int height = 0;

        int[] chunkHeightsPreviousRow = {57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57};

        int baseHeight = settings.baseHeight();
        float verticalVariance = settings.verticalVariance();
        float horizontalVariance = settings.horizontalVariance();
        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                int realx = chunkpos.x * 16 + x;
                int realz = chunkpos.z * 16 + z;
                height = genHeightAt(baseHeight, verticalVariance, horizontalVariance, realx, realz, chunk, chunkHeightsPreviousRow[z]);
                chunkHeightsPreviousRow[z] = height;
                for (int y = getMinY() + 1 ; y < height ; y++) {
                    if (Math.random() > 0.95) chunk.setBlockState(pos.set(x, y, z), scatteredOre, false);
                    else if (region.getBiome(pos) == SeramaniaBiomes.FEATHER_FIELDS.get()){
                        chunk.setBlockState(pos.set(x, y, z), feathers, false); //TODO FIXME
                    } else chunk.setBlockState(pos.set(x, y, z), underground, false);
                }
                if (height < (getSeaLevel() - UNDERWATER_SURFACE_THICKNESS)) {
                    for (int y = height - UNDERWATER_SURFACE_THICKNESS - 2; y < height + 1; y++) {
                        chunk.setBlockState(pos.set(x, height, z), underwaterSurface, false);
                    }
                    for (int y = height + 1; y < getSeaLevel(); y++)
                    {
                        chunk.setBlockState(pos.set(x, y, z), ocean, false);
                    }
                } else if (height < getSeaLevel()) {
                    for (int y = height; y < height + UNDERWATER_SURFACE_THICKNESS; y++)
                    chunk.setBlockState(pos.set(x, y, z), beachSurface, false);
                } else {
                    for (int y = height; y < height + BELOW_TOPSOIL_THICKNESS; y++) {
                        if (!(y == height && Math.random() > 0.85)) {
                            chunk.setBlockState(pos.set(x, y - BELOW_TOPSOIL_THICKNESS, z), belowTopsoil, false);
                        }
                    }
                    chunk.setBlockState(pos.set(x, height, z), topsoil, false);
                }
                if (Math.random() > 0.9899) {
                    for (int y = height - 1; y < height + getGenDepth(); y++)
                        chunk.setBlockState(pos.set(x, y, z), underground, false);
                }
                if (Math.random() > 0.9899) chunk.setBlockState(pos.set(x, 198, z), underground, false);
                if (Math.random() > 0.9899) chunk.setBlockState(pos.set(x, 298, z), underground, false);
//                for (int y = height + 55; y < getGenDepth() ; y++) {
//                    if (Math.random() > 0.99) {
//                        chunk.setBlockState(pos.set(x, y, z), floatingFeature, false);
//                    }
//                }
            }
        }
    }

    private int getHeightAt(int x, int z, ChunkAccess chunk) {
        //ChunkPos chunkpos = chunk.getPos();

        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        int y = getMinY();
        while (true) {
            if (chunk.getBlockState(pos.set(x, y, z)) == Blocks.AIR.defaultBlockState())
                return y;
            if (y == getGenDepth())
                return y;
        }
    }

    private int genHeightAt(int baseHeight, float verticalVariance, float horizontalVariance, int realX, int realZ, ChunkAccess chunk, int lastZ) {
        if ((Math.random()) * 10.0 > 9.8) genSlope += (int)((Math.random()) * 5) - 3;
        if (genSlope > MAX_SLOPE) genSlope = -1;
        if (genSlope < (MAX_SLOPE * -1)) genSlope = 1;

        int toReturn = (int)((yOffset + lastZ) / 2.0);

        if ((Math.random()) * 10 > 2.0) toReturn += genSlope;
        if (yOffset > MAX_Y_OFFSET) {
            yOffset = MAX_Y_OFFSET;
            genSlope -= 1;
        }
        if (yOffset < MIN_Y_OFFSET) {
            yOffset = MIN_Y_OFFSET;
            genSlope += 1;
        }

        yOffset = toReturn;
        return toReturn;
    }

    @Override
    protected Codec<? extends ChunkGenerator> codec() {
        return CODEC;
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return new SeramaniaChunkGenerator(getBiomeRegistry(), settings);
    }

    @Override
    public CompletableFuture<ChunkAccess> fillFromNoise(Executor executor, Blender blender, StructureFeatureManager featureManager, ChunkAccess chunkAccess) {
        return CompletableFuture.completedFuture(chunkAccess);
    }

    // Make sure this is correctly implemented so that structures and features can use this
    @Override
    public int getBaseHeight(int x, int z, Heightmap.Types types, LevelHeightAccessor levelHeightAccessor) {
        int baseHeight = settings.baseHeight();
        float verticalVariance = settings.verticalVariance();
        float horizontalVariance = settings.horizontalVariance();
        return 57; //TODO FIXME
    }

    // Make sure this is correctly implemented so that structures and features can use this
    @Override
    public NoiseColumn getBaseColumn(int x, int z, LevelHeightAccessor levelHeightAccessor) {
        int y = getBaseHeight(x, z, Heightmap.Types.WORLD_SURFACE_WG, levelHeightAccessor);
        BlockState stone = Blocks.STONE.defaultBlockState();
        BlockState[] states = new BlockState[y];
        states[0] = Blocks.BEDROCK.defaultBlockState();
        for (int i = 1 ; i < y ; i++) {
            states[i] = stone;
        }
        return new NoiseColumn(levelHeightAccessor.getMinBuildHeight(), states);
    }

    // Carvers only work correctly in combination with NoiseBasedChunkGenerator, so we keep this empty here
    @Override
    public void applyCarvers(WorldGenRegion level, long seed, BiomeManager biomeManager,
        StructureFeatureManager featureManager, ChunkAccess chunkAccess, GenerationStep.Carving carving) {

    }

    @Override
    public Climate.Sampler climateSampler() {
        return (x, y, z) -> Climate.target(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    }

    // This makes sure passive mob spawning works for generated chunks. i.e. mobs that spawn during the creation of chunks themselves
    @Override
    public void spawnOriginalMobs(WorldGenRegion level) {
        ChunkPos chunkpos = level.getCenter();
        Biome biome = level.getBiome(chunkpos.getWorldPosition().atY(level.getMaxBuildHeight() - 1));
        WorldgenRandom worldgenrandom = new WorldgenRandom(new LegacyRandomSource(RandomSupport.seedUniquifier()));
        worldgenrandom.setDecorationSeed(level.getSeed(), chunkpos.getMinBlockX(), chunkpos.getMinBlockZ());
        NaturalSpawner.spawnMobsForChunkGeneration(level, biome, chunkpos, worldgenrandom);
    }

    @Override
    public int getMinY() {
        return 0;
    }

    @Override
    public int getGenDepth() {
        return 256;
    }

    @Override
    public int getSeaLevel() {
        return 63;
    }

    private record Settings(int baseHeight, float verticalVariance, float horizontalVariance) { }
}