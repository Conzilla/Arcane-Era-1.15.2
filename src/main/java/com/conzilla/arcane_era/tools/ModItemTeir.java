package com.conzilla.arcane_era.tools;

import com.conzilla.arcane_era.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTeir implements IItemTier {
    ADMANTIUM(4, 1600, 9.0F, 3.0F, 15,() ->{
        return Ingredient.fromItems(RegistryHandler.ADMANTITE_INGOT.get());
    }),

    ORICHALCUM(4, 2000, 11.0F, 4.0F, 15,() ->{
        return Ingredient.fromItems(RegistryHandler.ORICHALCUM_INGOT.get());
    }),

    MYTHRIL(1, 500, 4.0F, 1.0F, 5,() ->{
        return Ingredient.fromItems(RegistryHandler.MYTHRIL_GEM.get());
    });



    private final int harvestLevel;
    private final int maxUses;
    private final float effeciency;
    private final float attackDamage;
    private final int enchantibility;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTeir(int harvestLevel,int maxUses, float effeciency, float attackDamage,int enchantibility,Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.effeciency = effeciency;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return effeciency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }

}
