package ganymedes01.etfuturum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;

public class RedNetherBricks extends Block implements IConfigurable {

	public RedNetherBricks() {
		super(Material.rock);
		setBlockName(Utils.getUnlocalisedName("red_nether_bricks"));
		setHardness(2F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
		setBlockTextureName("red_nether_brick");
		setLightOpacity(0);
		setCreativeTab(EtFuturum.enableRedNetherBricks? EtFuturum.creativeTab : null);
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableRedNetherBricks;
	}

}
