package com.conzilla.arcane_era.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mythril_Ore extends Block {
    public Mythril_Ore() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F,21.0F)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)


        );
    }
}
