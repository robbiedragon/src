package com.hayes.mod.blocks;

import java.util.Random;

import com.hayes.mod.BlockClass;
import com.hayes.mod.ModClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import com.hayes.mod.ModClass;

public class TraptaniumBlock extends Block {
	public TraptaniumBlock() 
	{

			super(Material.rock);
			setHardness(3.5F);
			setStepSound(Block.soundTypeStone);
			setBlockName("trapOre");
			setCreativeTab(ModClass.tabMod);
			setHarvestLevel("pickaxe", 2);
			setBlockTextureName("alexmodid:trapore");
	   }
	
	   public Item getItemDropped(int metadata, Random random, int fortune)
	   {
	    return Item.getItemFromBlock(BlockClass.trapOre);
	 }



	}


