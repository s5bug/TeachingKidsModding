package org.jointheleague.mod.item;

import org.jointheleague.mod.LeagueMod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class FunItem extends Item {
	
	public FunItem() {
		setUnlocalizedName("funItem");
	}
	
	@Override
	public void registerIcons(IIconRegister ir) {
		this.itemIcon = ir.registerIcon(LeagueMod.MODID+":funItem");
	}
	
}
