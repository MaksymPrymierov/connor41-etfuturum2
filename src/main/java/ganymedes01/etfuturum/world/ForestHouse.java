package ganymedes01.etfuturum.world;

import java.util.Random;

import ganymedes01.etfuturum.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ForestHouse extends WorldGenerator {

	public ForestHouse() { }
	public boolean generate(World world, Random rand, int x, int y, int z) {
		//y 1
		//line 0
		//line 1
		for(int i = 2; i < 78; i++) {
			world.setBlock(x + 1, y + 0, z = i, Blocks.cobblestone, 0, 3);
		}
		//line 2
		for(int i = 2; i < 10; i++) {
			world.setBlock(x + 2, y + 0, z = i, Blocks.cobblestone, 0, 3);
		}
		for(int i = 9; i < 13; i++ ) {
			world.setBlock(x + 2, y + 0, z = i, Blocks.planks, 2, 3);
		}
		for(int i = 12; i < 18; i++) {
			world.setBlock(x + 2, y + 0, z = i, Blocks.cobblestone, 0, 3);
		}
		for(int i = 17; i < 21; i++) {
			world.setBlock(x = 2, y + 0, z = i, Blocks.planks, 2, 3);
		}
		for(int i = 20; i < 25; i++) {
			world.setBlock(x + 2, y + 0, z = i, Blocks.cobblestone, 0, 3);
		}
		for(int i = 24; i < 27; i++) {
			world.setBlock(x = 2, y + 0, z = i, Blocks.planks, 2, 3);
		}
		for(int i = 26; i < 31; i++) {
			world.setBlock(x + 2, y + 0, z = i, Blocks.cobblestone, 0, 3);
		}
		for(int i = 30; i < 35; i++) {
			world.setBlock(x = 2, y + 0, z = i, Blocks.planks, 2, 3);
		}
		return true;
	}

}