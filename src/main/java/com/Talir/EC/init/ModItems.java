package com.Talir.EC.init;

import com.Talir.EC.item.ItemEC;
import com.Talir.EC.item.ItemLeaf;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Karsten on 21.07.2015.
 */
public class ModItems {
    public static final ItemEC Leaf = new ItemLeaf();

    public static void init(){
        GameRegistry.registerItem(Leaf, "Leaf");
        OreDictionary.registerOre("gemDiamond", Leaf);
    }
}
