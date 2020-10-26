package com.conzilla.arcane_era.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Orchalcum_Ore extends Block {
    public Orchalcum_Ore() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0F,10.0F)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
