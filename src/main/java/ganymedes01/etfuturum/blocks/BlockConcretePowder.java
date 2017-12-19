package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockConcretePowder extends BlockFalling implements IConfigurable {

	public static final String[] colors = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray",
			"pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};

	public BlockConcretePowder(int meta) {
		super(Material.sand);
		String color = colors[meta];
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setBlockTextureName("concrete_powder_" + color);
		setStepSound(soundTypeSand);
		setBlockName(Utils.getUnlocalisedName(color+"_block_concrete_powder"));
		setCreativeTab(EtFuturum.enableBlockConcretePowder ? EtFuturum.creativeTab : null);
	}

	/*public void replaceOnConcrete(World world, int x, int y, int z){
		if(world.getBlockMaterial(x+1, y, z) == Material.water){

			world.setBlock(x, y, z, ModBlocks.BlockConcretePowder);
		}
	}*/


	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBlockConcretePowder;
	}

}