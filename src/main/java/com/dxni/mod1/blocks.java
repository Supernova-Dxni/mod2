package com.dxni.mod1;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = mod1.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class blocks {

    @SubscribeEvent
    public static void registerBlock (RegistryEvent.Register<Block> event){

    }

    @SubscribeEvent
    public static void registerItem (RegistryEvent.Register<Item> event){

    }
}
