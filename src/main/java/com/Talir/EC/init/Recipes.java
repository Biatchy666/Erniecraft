package com.Talir.EC.init;

import com.jcraft.jorbis.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Karsten on 21.07.2015.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModBlock.block), " s ", " s ", " s ", 's', new ItemStack(Items.wheat_seeds));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Leaf), new ItemStack((ModBlock.block)), new ItemStack(ModBlock.block));
    }
}
