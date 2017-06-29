package com.wchb.jemain.init;

import com.wchb.jemain.Reference;
import com.wchb.jemain.wchbMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class wchbItems {
	
	public static Item test_item;
	
	public static void init()
	{
		test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(wchbMod.tabWchb);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_item);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+ ":" + 
				item.getUnlocalizedName().substring(5), "inventory"));
	}

}