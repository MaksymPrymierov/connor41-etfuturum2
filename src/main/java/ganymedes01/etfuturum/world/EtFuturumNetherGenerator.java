package ganymedes01.etfuturum.world;

import ganymedes01.etfuturum.ModBlocks;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EtFuturumNetherGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
		
			break;
		case -1:
			this.runGenerator(this.magma, world, random, chunkX, chunkZ, 100, 0, 256);
			break;
		case 1:
			
			break;
		}	
	}
	private WorldGenerator magma;
	
	public EtFuturumNetherGenerator() {
		this.magma = new WorldGenMinable(ModBlocks.magma, 16, Blocks.netherrack);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		
			if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
	
			int heightDiff = 35;
			for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, x, y, z);
			}
		}
	}