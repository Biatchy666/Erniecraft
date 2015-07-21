package com.Talir.EC.item;

import com.Talir.EC.creativetab.CreativeTabEC;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.naming.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
/**
 * Created by Karsten on 21.07.2015.
 */
public class ItemEC extends Item
{
    public ItemEC()
    {
        super();
        this.maxStackSize =1;

        this.setCreativeTab(CreativeTabEC.EC_TAB);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", com.Talir.EC.reference.Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", com.Talir.EC.reference.Reference.MOD_ID.toLowerCase()+ ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
