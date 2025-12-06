package com.EyeOfHarmonyBuffer.common.item.itemadders;

import com.EyeOfHarmonyBuffer.EyeOfHarmonyBuffer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

import static com.EyeOfHarmonyBuffer.client.EOHBCreativeTabs.tabMetaItem01;
import static com.EyeOfHarmonyBuffer.utils.TextLocalization.EOHB_Shit_Tooltip_00;

public class ItemShit extends ItemFood {

    public ItemShit() {
        super(1, 0.1F, false);

        this.setUnlocalizedName("Shit");
        this.setTextureName(EyeOfHarmonyBuffer.MODID + ":Shit");
        this.setCreativeTab(tabMetaItem01);
        this.setMaxStackSize(64);
        this.setAlwaysEdible();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(EOHB_Shit_Tooltip_00);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);

        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 0));
            player.addPotionEffect(new PotionEffect(Potion.hunger.id, 400, 1));
        }
    }

    @Override
    public boolean hasEffect(ItemStack stack, int pass) {
        return false;
    }
}
