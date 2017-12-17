package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockConcretePowder extends BlockGeneric implements IConfigurable {

	public static final int WHITE_CONCRETE_POWDER = 1;
	public static final int ORANGE_CONCRETE_POWDER = 2;
	public static final int MAGETA_CONCRETE_POWDER = 3;
	public static final int LIGHT_BLUE_CONCRETE_POWDER = 4;
	public static final int YELLOW_CONCRETE_POWDER = 5;
	public static final int LIME_CONCRETE_POWDER = 6;
	public static final int PINK_CONCRETE_POWDER = 7;
	public static final int GRAY_CONCRETE_POWDER = 8;
	public static final int SILVER_CONCRETE_POWDER = 9;
	public static final int CYAN_CONCRETE_POWDER = 10;
	public static final int PURPLE_CONCRETE_POWDER = 11;
	public static final int BLUE_CONCRETE_POWDER = 12;
	public static final int BROWN_CONCRETE_POWDER = 13;
	public static final int GREEN_CONCRETE_POWDER = 14;
	public static final int RED_CONCRETE_POWDER = 15;
	public static final int BLACK_CONCRETE_POWDER = 16;

	public BlockConcretePowder() {
		super(Material.sand, "", "white", "orange", "magenta", 
			"light_blue", "yellow", "lime", "pink",
			"gray", "silver", "cyan", "purple", 
			"blue", "brown", "green", "red", 
			"black");
		startMeta = 1;
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setBlockTextureName("concrete_powder");
		setStepSound(soundTypeSand);
		setBlockName(Utils.getUnlocalisedName("block_concrete_powder"));
		setCreativeTab(EtFuturum.enableBlockConcretePowder ? EtFuturum.creativeTab : null);
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableBlockConcretePowder;
	}

}