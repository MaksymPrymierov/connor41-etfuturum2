package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockConcrete extends Block implements IConfigurable {

	public static final String[] colors = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray",
			"pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};

	public BlockConcrete(int meta) {
		super(Material.sand);
		String color = colors[meta];
		setHardness(1.8F);
		setResistance(9.0F);
		setHarvestLevel("pickaxe", 0);
		setBlockTextureName("concrete_" + color);
		setStepSound(soundTypePiston);
		setBlockName(Utils.getUnlocalisedName(color+"_block_concrete"));
		setCreativeTab(EtFuturum.enableBlockConcrete ? EtFuturum.creativeTab : null);
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBlockConcrete;
	}
}