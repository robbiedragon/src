package com.hayes.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import com.hayes.mod.client.CommonProxy;
import com.hayes.mod.blocks.TraptaniumBlock;

@Mod(modid = "hayesmod", name = "HayesMod", version = "0.1.1ALPHA")
public class ModClass {
	public static final String MODID = "alexmodid";
	public static final String VERSION = "0.2.1ALPHA";
	public static Entity entityTwin;
	public static CreativeTabs tabMod = new CreativeTabs(
			"HayesMod") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BlockClass.trapOre;
		}
	};

	@Mod.Instance("hayesmod")
	public static ModClass instance;

	@SidedProxy(clientSide = "com.hayes.mod.client.ClientProxy", serverSide = "tutorial.alex.CommonProxy")
	public static CommonProxy proxy;

	public boolean isAIEnabled() {
		return true;
	}

	public static void registerEntity(Class entityClass, String name) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = rand.nextInt() * 16777215;
		int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, instance,
				64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID),
				new EntityList.EntityEggInfo(entityID, primaryColor,
						secondaryColor));
	}

	@Mod.EventHandler
	public void load(FMLPreInitializationEvent event) {
		BlockClass.mainRegistry();
		ItemClass.mainRegistry();
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
