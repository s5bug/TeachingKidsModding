package org.jointheleague.mod;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = LeagueMod.MODID, name = "TheLeagueMod", version = "1.0")
public class LeagueMod {
	
	public static final String MODID = "LeagueMod";
	public static FunBlock funBlock;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		funBlock = new FunBlock();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerBlock(funBlock, "funBlock");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		GameRegistry.addShapedRecipe(new ItemStack(funBlock), new Object[]{
			/*
			 * This is the 3x3 crafting grid.
			 * You can shorten it by removing one of the rows or
			 * decreasing the amount of letters in each row.
			 */
			"XXX",
			"XXX",
			"XXX",
			'X', Blocks.dirt // Dirt is the item you need to put in everywhere there is
							 // an X in the grid.
		});
	}

}
