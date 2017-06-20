package ganymedes01.etfuturum.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;

public class NetherWartBlock extends Block implements IConfigurable {
	
	public NetherWartBlock() {
		super(Material.wood);
		setBlockName(Utils.getUnlocalisedName("nether_wart_block"));
		setHardness(1F);
		setResistance(1.5F);
		setBlockTextureName("nether_wart_block");
		setStepSound(soundTypeWood);
		setLightOpacity(0);
		setCreativeTab(EtFuturum.enableNetherWartBlock? EtFuturum.creativeTab : null);
	}
	
	@Override
	public boolean isEnabled() {
		return EtFuturum.enableNetherWartBlock;
	}

}
