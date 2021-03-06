package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockConcrete extends Block implements IConfigurable {

	public BlockConcrete(int meta) {
		super(Material.sand);
		String color = ModBlocks.colors[meta];
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