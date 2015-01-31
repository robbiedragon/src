package com.hayes.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import com.hayes.mod.ModClass;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ItemClass {
	public static Item Barbahole;
	
	public static final Item.ToolMaterial ALCHEMIZED = EnumHelper.addToolMaterial("ALCHEMIZED", 2, 413, 7.0F, 1.5F, 7);
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
			}

	public static void initializeItem() {
		barbaHole = new Barbahole();
		
	}

	public static void registerItem() {
		GameRegistry.registerItem(barbaHole, "barbaHole");
		
	}
}
