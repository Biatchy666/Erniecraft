package com.Talir.EC.block;

import com.Talir.EC.creativetab.CreativeTabEC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import net.minecraft.client.renderer.texture.IIconRegister;
/**
 * Created by Karsten on 21.07.2015.
 */
public class BlockEC extends Block {
    public BlockEC(Material material){
        super(material);
        this.setCreativeTab(CreativeTabEC.EC_TAB);
    }
    public BlockEC(){
        this(Material.wood);
        this.setCreativeTab(CreativeTabEC.EC_TAB);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", com.Talir.EC.reference.Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
