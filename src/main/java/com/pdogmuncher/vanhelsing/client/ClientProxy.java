package com.pdogmuncher.vanhelsing.client;

import com.pdogmuncher.vanhelsing.CommonProxy;
import com.pdogmuncher.vanhelsing.VanHelsing;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	public void initItem(Item item, String name, CreativeTabs tab) {
		super.initItem(item, name, tab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(VanHelsing.MODID + ":" + name, "inventory"));
			//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				//new ModelResourceLocation(Main.MODID + ":" + name, "inventory"));
		
	}
}
