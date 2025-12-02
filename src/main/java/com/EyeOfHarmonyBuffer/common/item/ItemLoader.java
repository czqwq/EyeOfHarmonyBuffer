package com.EyeOfHarmonyBuffer.common.item;

import com.EyeOfHarmonyBuffer.common.GTCMItemList;
import com.EyeOfHarmonyBuffer.common.item.itemadders.ItemChengDuHeart;
import com.EyeOfHarmonyBuffer.common.item.itemadders.ItemMonkey;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import reobf.proghatches.net.ModeSwitchedMessage;

@SuppressWarnings("SameParameterValue")
public class ItemLoader {

    public static Item ChengDuHeart = new ItemChengDuHeart();
    public static Item Monkey = new ItemMonkey();

    public ItemLoader(FMLPreInitializationEvent event){
        GTCMItemList.ChengDuHeart.set(registryAndCallback(ChengDuHeart,"chengdu_heart"));
        GTCMItemList.Monkey.set(registryAndCallback(Monkey,"monkey"));
    }

    private static ItemStack registryAndCallback(Item item, String name) {
        return registryAndCallback(item, name, 0);
    }

    private static ItemStack registryAndCallback(Item item, String name, int aMeta) {
        GameRegistry.registerItem(item, name);
        return new ItemStack(item, 1, aMeta);
    }
}
