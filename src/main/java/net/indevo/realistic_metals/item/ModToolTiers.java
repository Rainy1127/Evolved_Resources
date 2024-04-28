package net.indevo.realistic_metals.item;

import net.indevo.realistic_metals.Realistic_Metals;
import net.indevo.realistic_metals.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier IRON = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                    ModTags.Blocks.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(Realistic_Metals.MOD_ID, "iron_ingot"), List.of(Tiers.IRON), List.of());

    public static final Tier BRASS = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                    ModTags.Blocks.NEEDS_BRASS_TOOL, () -> Ingredient.of(ModItems.Brass_Ingot.get())),
            new ResourceLocation(Realistic_Metals.MOD_ID, "brass_ingot"), List.of(Tiers.IRON), List.of());

    public static final Tier ENDERIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    ModTags.Blocks.NEEDS_ENDERIUM_TOOL, () -> Ingredient.of(ModItems.Enderium_Ingot.get())),
            new ResourceLocation(Realistic_Metals.MOD_ID, "enderium_ingot"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier OSMIUM = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2031, 9.0F, 4.0F, 15,
                    ModTags.Blocks.NEEDS_OSMIUM_TOOL, () -> Ingredient.of(ModItems.Osmium_Ingot.get())),
            new ResourceLocation(Realistic_Metals.MOD_ID, "osmium_ingot"), List.of(Tiers.NETHERITE), List.of());

}
