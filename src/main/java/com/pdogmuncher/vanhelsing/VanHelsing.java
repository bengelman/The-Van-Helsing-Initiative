package com.pdogmuncher.vanhelsing;


import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = VanHelsing.MODID, version = VanHelsing.VERSION)
public class VanHelsing
{
    public static final String MODID = "vanhelsing";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = "com.pdogmuncher.vanhelsing.client.ClientProxy", serverSide = "com.pdogmuncher.vanhelsing.CommonProxy")
	public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	initItems();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		VanHelsingEventHandler handler = new VanHelsingEventHandler();
		MinecraftForge.EVENT_BUS.register(handler);
    }
    public void initItems(){
    	//Register an item here, using the proxy.initItem() method.
    	//It will automatically set the item's unlocalized name as well as register
    	//its texture. However, the lang file must be used to set the item's
    	//in-game display name.
    }
}
