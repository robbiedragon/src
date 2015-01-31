package com.hayes.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import com.hayes.mod.ModClass;
import com.hayes.mod.blocks.TraptaniumBlock;
public class BlockClass {
	
	
	public static Block trapOre;

	
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
		
	};

	public static void initializeBlock() {
		trapOre = new TraptaniumBlock();

		
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(trapOre, "TrapOre");

		
	}

}
