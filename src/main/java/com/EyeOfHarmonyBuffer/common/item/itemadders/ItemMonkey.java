package com.EyeOfHarmonyBuffer.common.item.itemadders;

import com.EyeOfHarmonyBuffer.EyeOfHarmonyBuffer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

import static com.EyeOfHarmonyBuffer.client.EOHBCreativeTabs.tabMetaItem01;
import static com.EyeOfHarmonyBuffer.utils.TextLocalization.*;

public class ItemMonkey extends Item {

    public ItemMonkey() {
        super();

        this.setUnlocalizedName("Monkey");
        this.setTextureName(EyeOfHarmonyBuffer.MODID + ":Monkey");
        this.setCreativeTab(tabMetaItem01);
        this.setMaxStackSize(64);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(EOHB_Monkey_Tooltip_00);
        list.add(EOHB_Monkey_Tooltip_01);
    }
}
