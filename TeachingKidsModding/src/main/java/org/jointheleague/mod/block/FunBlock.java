package org.jointheleague.mod.block;

import org.jointheleague.mod.LeagueMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class FunBlock extends Block {

	public FunBlock() {
		super(Material.coral);
		setBlockName("funBlock");
		setCreativeTab(LeagueMod.funTab);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister ir) {
		this.blockIcon = ir.registerIcon(LeagueMod.MODID+":funBlock");
	}

}
