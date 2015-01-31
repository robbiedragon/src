package com.hayes.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingClass {
	public static ItemStack diamondsStack = new ItemStack(Items.diamond);
	public static ItemStack obsidianStack = new ItemStack(Blocks.obsidian);
	public static ItemStack bookStack = new ItemStack(Items.book);
	public static ItemStack stickStack = new ItemStack(Items.stick);
	public static ItemStack bedrockStack = new ItemStack(Blocks.bedrock);
	public static ItemStack ironingotStack = new ItemStack(Items.iron_ingot);
	public static ItemStack ironblockStack = new ItemStack(Blocks.iron_block);
	public static ItemStack redstoneStack = new ItemStack(Items.redstone);
	public static ItemStack redstoneblockStack = new ItemStack(Blocks.redstone_block);
	public static ItemStack cobbleStack = new ItemStack(Blocks.cobblestone);
	public static ItemStack woodStack = new ItemStack(Blocks.planks);
	public static ItemStack gunpowderStack = new ItemStack(Items.gunpowder);
	public static ItemStack woolStack = new ItemStack(Blocks.wool);
	public static ItemStack leatherStack = new ItemStack(Items.leather);
	public static ItemStack stringStack = new ItemStack(Items.string);
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}

	public static void addCraftingRec() {
	}

	public static void addSmeltingRec() {
		// TODO Auto-generated method stub
	}

}
