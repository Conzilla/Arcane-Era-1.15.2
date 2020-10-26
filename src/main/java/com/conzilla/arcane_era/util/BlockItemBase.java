package com.conzilla.arcane_era.util;

import com.conzilla.arcane_era.arcane_era;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem
{

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(arcane_era.TAB));

    }
}
