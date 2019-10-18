package ganymedes01.etfuturum.blocks;

import java.util.Random;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockConcretePowder extends BlockFalling implements IConfigurable {

	public static final String[] colors = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray",
			"pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};
	private int color_id = 0;
	private String color = "black";

	public BlockConcretePowder(int meta) {
		super(Material.sand);
		String color = colors[meta];
		if (meta < colors.length) {
			color_id = meta;
		}
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setBlockTextureName("concrete_powder_" + color);
		setStepSound(soundTypeSand);
		setBlockName(Utils.getUnlocalisedName(color+"_block_concrete_powder"));
		setCreativeTab(EtFuturum.enableBlockConcretePowder ? EtFuturum.creativeTab : null);
	}
	
	public boolean nearWater(World world, int x, int y, int z) {
		boolean water = false;
		
		if (world.getBlock(x + 1, y, z).getMaterial() == Material.water || world.getBlock(x - 1, y, z).getMaterial() == Material.water ||
				world.getBlock(x, y + 1, z).getMaterial() == Material.water || world.getBlock(x, y - 1, z).getMaterial() == Material.water ||
				world.getBlock(x, y, z + 1).getMaterial() == Material.water || world.getBlock(x, y, z - 1).getMaterial() == Material.water) {
				water = true;
		}
		
		if (water) {
			world.setBlock(x, y, z, ModBlocks.block_concrete[color_id]);
		}
		
		return water;
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		if (!nearWater(world, x, y, z)) {
			super.onNeighborBlockChange(world, x, y, z, block);
		}
    }
	
	public void onBlockAdded(World world, int x, int y, int z) {
		if (!nearWater(world, x, y, z)) {
			super.onBlockAdded(world, x, y, z);
		}
	}
	
	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBlockConcretePowder;
	}
}