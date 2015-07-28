package com.Talir.EC;

import com.Talir.EC.init.ModBlock;
import com.Talir.EC.init.ModItems;
import com.Talir.EC.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Karsten on 20.07.2015.
 */
@Mod(modid = "Erniecraft", name= "ErnieCraft", version="1.7.10-1.0")
public class Erniecraft {
    @Mod.Instance("Erniecraft")
    public static Erniecraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlock.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
