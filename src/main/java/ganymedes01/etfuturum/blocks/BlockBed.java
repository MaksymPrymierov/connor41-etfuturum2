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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBed extends net.minecraft.block.BlockBed implements IConfigurable {
	public BlockBed(int meta) {
		super();
		String color = ModBlocks.colors[meta];
		setBlockTextureName("bed_" + color);
		setBlockName(Utils.getUnlocalisedName(color+"_bed"));
		setCreativeTab(EtFuturum.enableBlockBed ? EtFuturum.creativeTab : null);
	}
	
	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBlockBed;
	}
}