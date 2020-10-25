package com.conzilla.arcane_era.util;

import com.conzilla.arcane_era.arcane_era;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{

    public ItemBase() {
        super(new Item.Properties().group(arcane_era.TAB));
    }
}
