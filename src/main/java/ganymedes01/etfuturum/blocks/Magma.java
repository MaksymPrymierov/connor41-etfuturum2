package ganymedes01.etfuturum.blocks;

import ibxm.Player;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import akka.actor.FSM.Event;

import cpw.mods.fml.common.eventhandler.Event.Result;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.core.utils.Utils;
import ganymedes01.etfuturum.entities.ai.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEventData;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;

	public class Magma extends Block implements IConfigurable{
		
		public Magma() {
			super(Material.rock);
			setBlockName(Utils.getUnlocalisedName("magma"));
			setStepSound(soundTypeStone);
			setHardness(0.5F);
			setResistance(2.5F);
			setHarvestLevel("pickaxe", 0);
			setBlockTextureName("magma");
			setLightLevel(0.2F);
			setTickRandomly(true);
			setLightOpacity(0);	
			setCreativeTab(EtFuturum.enableMagma? EtFuturum.creativeTab : null);
		}
		
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
	    float a = 0;
		float f = 0.03125F;
	    return AxisAlignedBB.getBoundingBox((double)((float)x + a),
	    		(double)y, (double)((float)z + a),
	    		(double)((float)(x + 1) - a),
	    		(double)((float)(y + 1) - f),
	    		(double)((float)(z + 1) - a));
	}
		
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		if (!entity.isSneaking()) {
			entity.attackEntityFrom(DamageSource.inFire, 1F);
		}
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableMagma;
	}
}
