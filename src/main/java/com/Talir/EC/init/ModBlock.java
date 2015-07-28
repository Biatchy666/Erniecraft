package com.Talir.EC.init;

import com.Talir.EC.block.BlockEC;
import com.Talir.EC.block.BlockLeaf;
import com.Talir.EC.block.Blocktest;
import cpw.mods.fml.common.registry.GameRegistry;
import jdk.nashorn.internal.ir.Block;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Karsten on 21.07.2015.
 */
public class ModBlock {
    public static final BlockEC BlockLeaf = new BlockLeaf();
    public static final Blocktest Blocktest = new Blocktest();



    public static void init(){
        GameRegistry.registerBlock(BlockLeaf, "BlockLeaf");
        GameRegistry.registerBlock(Blocktest, "Blocktest");
    }
}
