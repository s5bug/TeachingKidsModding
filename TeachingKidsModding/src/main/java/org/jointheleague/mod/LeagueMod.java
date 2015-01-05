package org.jointheleague.mod;

import org.jointheleague.mod.block.FunBlock;
import org.jointheleague.mod.item.FunItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
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
	public static FunItem funItem;
	public static CreativeTabs funTab;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		funBlock = new FunBlock();
		funItem = new FunItem();
		funTab = new CreativeTabs("funTab") {
			
			@Override
			public Item getTabIconItem() {
				return funItem;
			}
		};
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerBlock(funBlock, "funBlock");
		GameRegistry.registerItem(funItem, "funItem");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		GameRegistry.addShapedRecipe(new ItemStack(funBlock), new Object[]{
			/*
			 * This is the 3x3 crafting grid.
			 * You can shorten it by removing one of the rows or
			 * decreasing the amount of letters in each row.
			 */
			"X.X",
			".X.",
			"X.X",
			'X', new ItemStack(Items.dye, 1, 15), // White Dye is the item you need to put in everywhere there is
							                      // an X in the grid.
			'.', new ItemStack(Items.dye, 1, 14)  // Orange Dye for the .
		});
		// The first is the input (top) next the output (right) then the xp.
		GameRegistry.addSmelting(funBlock, new ItemStack(funItem), 7.0F);
	}

}
