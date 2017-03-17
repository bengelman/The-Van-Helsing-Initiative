package com.pdogmuncher.vanhelsing;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void initItem(Item item, String name, CreativeTabs tab) {
		item.setUnlocalizedName(VanHelsing.MODID + ":" + name);
		item.setRegistryName(name);
		GameRegistry.register(item, item.getRegistryName());

		//LanguageRegistry.addName(item, display);
		item.setCreativeTab(tab);
	}
}
