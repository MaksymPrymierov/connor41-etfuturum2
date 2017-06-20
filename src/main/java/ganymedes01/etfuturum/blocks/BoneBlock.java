package ganymedes01.etfuturum.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.core.utils.Utils;

public class BoneBlock extends Block implements IConfigurable {
	
	@SideOnly(Side.CLIENT)
	private IIcon sideIcon;
	private IIcon topIcon;
	
	public BoneBlock() {
		super(Material.rock);
		setBlockName(Utils.getUnlocalisedName("bone_block"));
		setHardness(2);
		setResistance(10);
		setHarvestLevel("pickaxe", 0);
	    setBlockTextureName("bone_block");
		setLightOpacity(0);
		setStepSound(soundTypeStone);
		setCreativeTab(EtFuturum.enableBoneBlock? EtFuturum.creativeTab : null);
	}
	
	@Override
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
		return side == ForgeDirection.DOWN;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return side == 0 ? blockIcon : side == 1 ? blockIcon : sideIcon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		blockIcon = reg.registerIcon(getTextureName() + "_top");
		sideIcon = reg.registerIcon(getTextureName() + "_side");
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBoneBlock;
	}

}
