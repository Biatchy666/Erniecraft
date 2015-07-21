package com.Talir.EC.creativetab;

import com.Talir.EC.init.ModBlock;
import com.Talir.EC.init.ModItems;
import com.Talir.EC.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Karsten on 21.07.2015.
 */
public class CreativeTabEC {
    public static final CreativeTabs EC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModItems.Leaf;
        }
    };
}
