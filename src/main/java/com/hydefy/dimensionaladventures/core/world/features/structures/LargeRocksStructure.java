//package com.hydefy.dimensionaladventures.core.world.features.structures;
//
//import com.google.common.collect.ImmutableList;
//import com.hydefy.dimensionaladventures.DimensionalAdventures;
//import com.mojang.serialization.Codec;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Registry;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraft.world.level.NoiseColumn;
//import net.minecraft.world.level.biome.MobSpawnSettings;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.levelgen.GenerationStep;
//import net.minecraft.world.level.levelgen.Heightmap;
//import net.minecraft.world.level.levelgen.feature.StructureFeature;
//import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
//import net.minecraft.world.level.levelgen.feature.structures.JigsawPlacement;
//import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
//import net.minecraft.world.level.levelgen.structure.PostPlacementProcessor;
//import net.minecraft.world.level.levelgen.structure.pieces.PieceGenerator;
//import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;
//import net.minecraftforge.common.util.Lazy;
//import net.minecraftforge.event.world.StructureSpawnListGatherEvent;
//import org.apache.logging.log4j.Level;
//
//import java.util.List;
//import java.util.Optional;
//
//public class LargeRocksStructure extends StructureFeature<JigsawConfiguration> {
//    public LargeRocksStructure(Codec<JigsawConfiguration> codec) {
//        // Create the pieces layout of the structure and give it to the game
//        super(codec, LargeRocksStructure::createPiecesGenerator, PostPlacementProcessor.NONE);
//    }
//
//    @Override
//    public GenerationStep.Decoration step() {
//        return GenerationStep.Decoration.SURFACE_STRUCTURES;
//    }
//
//    private static final Lazy<List<MobSpawnSettings.SpawnerData>> STRUCTURE_MONSTERS = Lazy.of(() -> ImmutableList.of(
//            new MobSpawnSettings.SpawnerData(EntityType.ILLUSIONER, 100, 4, 9),
//            new MobSpawnSettings.SpawnerData(EntityType.VINDICATOR, 100, 4, 9)
//    ));
//    private static final Lazy<List<MobSpawnSettings.SpawnerData>> STRUCTURE_CREATURES = Lazy.of(() -> ImmutableList.of(
//            new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 30, 10, 15),
//            new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 100, 1, 2)
//    ));
//
//    // Hooked up in StructureTutorialMain. You can move this elsewhere or change it up.
//    public static void setupStructureSpawns(final StructureSpawnListGatherEvent event) {
//        if (event.getStructure() == ModStructures.LARGE_ROCKS.get()) {
//            event.addEntitySpawns(MobCategory.MONSTER, STRUCTURE_MONSTERS.get());
//            event.addEntitySpawns(MobCategory.CREATURE, STRUCTURE_CREATURES.get());
//        }
//    }
//
//    /*
//     * This is where extra checks can be done to determine if the structure can spawn here.
//     * This only needs to be overridden if you're adding additional spawn conditions.
//     *
//     * Fun fact, if you set your structure separation/spacing to be 0/1, you can use
//     * isFeatureChunk to return true only if certain chunk coordinates are passed in
//     * which allows you to spawn structures only at certain coordinates in the world.
//     *
//     * Basically, this method is used for determining if the land is at a suitable height,
//     * if certain other structures are too close or not, or some other restrictive condition.
//     *
//     * For example, Pillager Outposts added a check to make sure it cannot spawn within 10 chunk of a Village.
//     * (Bedrock Edition seems to not have the same check)
//     *
//     * If you are doing Nether structures, you'll probably want to spawn your structure on top of ledges.
//     * Best way to do that is to use getBaseColumn to grab a column of blocks at the structure's x/z position.
//     * Then loop through it and look for land with air above it and set blockpos's Y value to it.
//     * Make sure to set the final boolean in JigsawPlacement.addPieces to false so
//     * that the structure spawns at blockpos's y value instead of placing the structure on the Bedrock roof!
//     *
//     * Also, please for the love of god, do not do dimension checking here. If you do and
//     * another mod's dimension is trying to spawn your structure, the locate
//     * command will make minecraft hang forever and break the game.
//     *
//     * Instead, use the addDimensionalSpacing method in StructureTutorialMain class.
//     * If you check for the dimension there and do not add your structure's
//     * spacing into the chunk generator, the structure will not spawn in that dimension!
//     */
//    private static boolean isFeatureChunk(PieceGeneratorSupplier.Context<JigsawConfiguration> context) {
//        return true;
//
////        BlockPos blockPos = context.chunkPos().getWorldPosition();
////
////        // Grab height of land. Will stop at first non-air block.
////        int landHeight = context.chunkGenerator().getFirstOccupiedHeight(blockPos.getX(), blockPos.getZ(), Heightmap.Types.WORLD_SURFACE_WG, context.heightAccessor());
////
////        // Grabs column of blocks at given position. In overworld, this column will be made of stone, water, and air.
////        // In nether, it will be netherrack, lava, and air. End will only be endstone and air. It depends on what block
////        // the chunk generator will place for that dimension.
////        NoiseColumn columnOfBlocks = context.chunkGenerator().getBaseColumn(blockPos.getX(), blockPos.getZ(), context.heightAccessor());
////
////        // Combine the column of blocks with land height and you get the top block itself which you can test.
////        BlockState topBlock = columnOfBlocks.getBlock(landHeight);
////
////        // Now we test to make sure our structure is not spawning on water or other fluids.
////        // You can do height check instead too to make it spawn at high elevations.
////        return topBlock.getFluidState().isEmpty(); //landHeight > 100;
//    }
//
//    public static Optional<PieceGenerator<JigsawConfiguration>> createPiecesGenerator(PieceGeneratorSupplier.Context<JigsawConfiguration> context) {
//
//        // Check if the spot is valid for our structure. This is just as another method for cleanness.
//        // Returning an empty optional tells the game to skip this spot as it will not generate the structure.
//        if (!LargeRocksStructure.isFeatureChunk(context)) {
//            return Optional.empty();
//        }
//
//        /*
//         * The only reason we are using JigsawConfiguration here is that further down, we are using
//         * JigsawPlacement.addPieces which requires JigsawConfiguration. However, if you create your own
//         * JigsawPlacement.addPieces, you could reduce the amount of workarounds like above that you need
//         * and give yourself more opportunities and control over your structures.
//         *
//         * An example of a custom JigsawPlacement.addPieces in action can be found here:
//         * https://github.com/TelepathicGrunt/RepurposedStructures/blob/1.18/src/main/java/com/telepathicgrunt/repurposedstructures/world/structures/pieces/PieceLimitedJigsawManager.java
//         */
//        JigsawConfiguration newConfig = new JigsawConfiguration(
//                () -> context.registryAccess().ownedRegistryOrThrow(Registry.TEMPLATE_POOL_REGISTRY)
//                        .get(new ResourceLocation(DimensionalAdventures.MODID, "seramania/rocks/large_rocks")),
//                10
//        );
//
//        PieceGeneratorSupplier.Context<JigsawConfiguration> newContext = new PieceGeneratorSupplier.Context<>(
//                context.chunkGenerator(),
//                context.biomeSource(),
//                context.seed(),
//                context.chunkPos(),
//                newConfig,
//                context.heightAccessor(),
//                context.validBiome(),
//                context.structureManager(),
//                context.registryAccess()
//        );
//
//        BlockPos blockpos = context.chunkPos().getMiddleBlockPosition(0);
//
//        Optional<PieceGenerator<JigsawConfiguration>> structurePiecesGenerator =
//                JigsawPlacement.addPieces(
//                        newContext, // Used for JigsawPlacement to get all the proper behaviors done.
//                        PoolElementStructurePiece::new, // Needed in order to create a list of jigsaw pieces when making the structure's layout.
//                        blockpos, // Position of the structure. Y value is ignored if last parameter is set to true.
//                        false,  // Special boundary adjustments for villages. It's... hard to explain. Keep this false and make your pieces not be partially intersecting.
//                        // Either not intersecting or fully contained will make children pieces spawn just fine. It's easier that way.
//                        true // Place at heightmap (top land). Set this to false for structure to be place at the passed in blockpos's Y value instead.
//                        // Definitely keep this false when placing structures in the nether as otherwise, heightmap placing will put the structure on the Bedrock roof.
//                );
////
////        //TODO implement logger
//////        if(structurePiecesGenerator.isPresent()) {
//////            DimensionalAdventures.LOGGER.log(Level.DEBUG, "Rundown House at " + blockpos);
//////        }
////
//        // Return the pieces generator that is now set up so that the game runs it when it needs to create the layout of structure pieces.
//        return structurePiecesGenerator;
//    }
//}