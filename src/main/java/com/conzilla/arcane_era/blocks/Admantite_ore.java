package com.conzilla.arcane_era.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Admantite_ore extends Block
{

    public Admantite_ore() {
        super(Block.Properties.create(Material.ROCK)
        .hardnessAndResistance(3.0F,15.0F)
        .harvestLevel(3)
        .harvestTool(ToolType.PICKAXE)

        );

    }
}
