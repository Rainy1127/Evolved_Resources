package net.indevo.evolved_resources.datagen;

import net.indevo.evolved_resources.Evolved_Resources;
import net.indevo.evolved_resources.block.ModBlocks;
import net.indevo.evolved_resources.item.ModItems;
import net.indevo.evolved_resources.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Evolved_Resources.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.HAMMERS)
                .add(
                        ModItems.Iron_Hammer.get(),
                        ModItems.Brass_Hammer.get(),
                        ModItems.Osmium_Hammer.get(),
                        ModItems.Enderium_Hammer.get());

        this.tag(ModTags.Items.COINS)
                .add(
                        ModItems.Aluminum_Coin.get(),
                        ModItems.Platinum_Coin.get(),
                        ModItems.Silver_Coin.get(),
                        ModItems.Nickel_Coin.get(),
                        ModItems.Uranium_Coin.get(),
                        ModItems.Lead_Coin.get(),
                        ModItems.Osmium_Coin.get(),
                        ModItems.Tin_Coin.get(),
                        ModItems.Zinc_Coin.get(),
                        ModItems.Iridium_Coin.get(),
                        ModItems.Iron_Coin.get(),
                        ModItems.Copper_Coin.get(),
                        ModItems.Gold_Coin.get(),
                        ModItems.Netherite_Coin.get(),
                        ModItems.Ruby_Coin.get(),
                        ModItems.Sapphire_Coin.get(),
                        ModItems.Apatite_Coin.get(),
                        ModItems.Cinnabar_Coin.get(),
                        ModItems.Diamond_Coin.get(),
                        ModItems.Emerald_Coin.get(),
                        ModItems.Lapis_Lazuli_Coin.get(),
                        ModItems.Quartz_Coin.get(),
                        ModItems.Bronze_Coin.get(),
                        ModItems.Constantan_Coin.get(),
                        ModItems.Invar_Coin.get(),
                        ModItems.Signalum_Coin.get(),
                        ModItems.Refined_Obsidian_Coin.get(),
                        ModItems.Refined_Glowstone_Coin.get(),
                        ModItems.Brass_Coin.get(),
                        ModItems.Electrum_Coin.get(),
                        ModItems.Enderium_Coin.get(),
                        ModItems.Steel_Coin.get(),
                        ModItems.Andesite_Alloy_Coin.get(),
                        ModItems.Lumium_Coin.get(),
                        ModItems.Rose_Gold_Coin.get(),
                        ModItems.Quartz_Enriched_Iron_Coin.get(),
                        ModItems.Iron_Compressed_Coin.get());

        this.tag(ModTags.Items.DUSTS)
                .add(
                        ModItems.Andesite_Alloy_Dust.get(),
                        ModItems.Amethyst_Dust.get(),
                        ModItems.Aluminum_Dust.get(),
                        ModItems.Apatite_Dust.get(),
                        ModItems.Brass_Dust.get(),
                        ModItems.Bronze_Dust.get(),
                        ModItems.Calcite_Dust.get(),
                        ModItems.Charcoal_Dust.get(),
                        ModItems.Osmium_Hammer.get(),
                        ModItems.Cinnabar_Dust.get(),
                        ModItems.Coal_Dust.get(),
                        ModItems.Constantan_Dust.get(),
                        ModItems.Copper_Dust.get(),
                        ModItems.Diamond_Dust.get(),
                        ModItems.Electrum_Dust.get(),
                        ModItems.Emerald_Dust.get(),
                        ModItems.Ender_Pearl_Dust.get(),
                        ModItems.Enderium_Dust.get(),
                        ModItems.Gold_Dust.get(),
                        ModItems.Graphite_Dust.get(),
                        ModItems.Invar_Dust.get(),
                        ModItems.Iridium_Dust.get(),
                        ModItems.Iron_Dust.get(),
                        ModItems.Lapis_Lazuli_Dust.get(),
                        ModItems.Lead_Dust.get(),
                        ModItems.Lumium_Dust.get(),
                        ModItems.Netherrack_Dust.get(),
                        ModItems.Netherite_Dust.get(),
                        ModItems.Nickel_Dust.get(),
                        ModItems.Obsidian_Dust.get(),
                        ModItems.Signalum_Dust.get(),
                        ModItems.Osmium_Dust.get(),
                        ModItems.Platinum_Dust.get(),
                        ModItems.Prismarine_Dust.get(),
                        ModItems.Quartz_Dust.get(),
                        ModItems.Quartz_Enriched_Iron_Dust.get(),
                        ModItems.Refined_Glowstone_Dust.get(),
                        ModItems.Refined_Obsidian_Dust.get(),
                        ModItems.Rose_Gold_Dust.get(),
                        ModItems.Ruby_Dust.get(),
                        ModItems.Sapphire_Dust.get(),
                        ModItems.Silver_Dust.get(),
                        ModItems.Steel_Dust.get(),
                        ModItems.Tin_Dust.get(),
                        ModItems.Uranium_Dust.get(),
                        ModItems.Zinc_Dust.get());

        this.tag(ModTags.Items.ENRICHED_DUSTS)
                .add(
                        ModItems.Enriched_Uranium_Dust.get());

        this.tag(ModTags.Items.ENRICHED_MATERIALS)
                .add(
                        ModItems.Enriched_Uranium.get());

        this.tag(ModTags.Items.POLISHED_GEMS)
                .add(
                        ModItems.Polished_Ruby.get(),
                        ModItems.Polished_Sapphire.get(),
                        ModItems.Polished_Apatite.get(),
                        ModItems.Polished_Cinnabar.get(),
                        ModItems.Polished_Diamond.get(),
                        ModItems.Polished_Emerald.get(),
                        ModItems.Polished_Lapis_Lazuli.get(),
                        ModItems.Polished_Quartz.get());

        this.tag(ModTags.Items.RODS)
                .add(
                        ModItems.Andesite_Alloy_Rod.get(),
                        ModItems.Aluminum_Rod.get(),
                        ModItems.Brass_Rod.get(),
                        ModItems.Bronze_Rod.get(),
                        ModItems.Cinnabar_Rod.get(),
                        ModItems.Constantan_Rod.get(),
                        ModItems.Copper_Rod.get(),
                        ModItems.Electrum_Rod.get(),
                        ModItems.Enderium_Rod.get(),
                        ModItems.Gold_Rod.get(),
                        ModItems.Graphite_Rod.get(),
                        ModItems.Invar_Rod.get(),
                        ModItems.Iridium_Rod.get(),
                        ModItems.Iron_Rod.get(),
                        ModItems.Lead_Rod.get(),
                        ModItems.Lumium_Rod.get(),
                        ModItems.Netherite_Rod.get(),
                        ModItems.Nickel_Rod.get(),
                        ModItems.Signalum_Rod.get(),
                        ModItems.Osmium_Rod.get(),
                        ModItems.Plastic_Rod.get(),
                        ModItems.Platinum_Rod.get(),
                        ModItems.Quartz_Enriched_Iron_Rod.get(),
                        ModItems.Refined_Glowstone_Rod.get(),
                        ModItems.Refined_Obsidian_Rod.get(),
                        ModItems.Rose_Gold_Rod.get(),
                        ModItems.Ruby_Rod.get(),
                        ModItems.Sapphire_Rod.get(),
                        ModItems.Silver_Rod.get(),
                        ModItems.Steel_Rod.get(),
                        ModItems.Tin_Rod.get(),
                        ModItems.Uranium_Rod.get(),
                        ModItems.Zinc_Rod.get());

        this.tag(ModTags.Items.PLATES)
                .add(
                        ModItems.Andesite_Alloy_Plate.get(),
                        ModItems.Apatite_Plate.get(),
                        ModItems.Brass_Plate.get(),
                        ModItems.Bronze_Plate.get(),
                        ModItems.Cinnabar_Plate.get(),
                        ModItems.Constantan_Plate.get(),
                        ModItems.Copper_Plate.get(),
                        ModItems.Diamond_Plate.get(),
                        ModItems.Electrum_Plate.get(),
                        ModItems.Emerald_Plate.get(),
                        ModItems.Enderium_Plate.get(),
                        ModItems.Gold_Plate.get(),
                        ModItems.Graphite_Plate.get(),
                        ModItems.Invar_Plate.get(),
                        ModItems.Iridium_Plate.get(),
                        ModItems.Iron_Plate.get(),
                        ModItems.Lapis_Lazuli_Plate.get(),
                        ModItems.Lead_Plate.get(),
                        ModItems.Lumium_Plate.get(),
                        ModItems.Netherite_Plate.get(),
                        ModItems.Nickel_Plate.get(),
                        ModItems.Signalum_Plate.get(),
                        ModItems.Osmium_Plate.get(),
                        ModItems.Plastic_Plate.get(),
                        ModItems.Platinum_Plate.get(),
                        ModItems.Quartz_Plate.get(),
                        ModItems.Quartz_Enriched_Iron_Plate.get(),
                        ModItems.Refined_Glowstone_Plate.get(),
                        ModItems.Refined_Obsidian_Plate.get(),
                        ModItems.Rose_Gold_Plate.get(),
                        ModItems.Ruby_Plate.get(),
                        ModItems.Sapphire_Plate.get(),
                        ModItems.Silver_Plate.get(),
                        ModItems.Steel_Plate.get(),
                        ModItems.Tin_Plate.get(),
                        ModItems.Uranium_Plate.get(),
                        ModItems.Zinc_Plate.get());

        this.tag(ModTags.Items.GEARS)
                .add(
                        ModItems.Andesite_Alloy_Gear.get(),
                        ModItems.Aluminum_Gear.get(),
                        ModItems.Brass_Gear.get(),
                        ModItems.Bronze_Gear.get(),
                        ModItems.Constantan_Gear.get(),
                        ModItems.Copper_Gear.get(),
                        ModItems.Diamond_Gear.get(),
                        ModItems.Electrum_Gear.get(),
                        ModItems.Emerald_Gear.get(),
                        ModItems.Enderium_Gear.get(),
                        ModItems.Gold_Gear.get(),
                        ModItems.Invar_Gear.get(),
                        ModItems.Iridium_Gear.get(),
                        ModItems.Iron_Gear.get(),
                        ModItems.Lapis_Lazuli_Gear.get(),
                        ModItems.Lead_Gear.get(),
                        ModItems.Lumium_Gear.get(),
                        ModItems.Netherite_Gear.get(),
                        ModItems.Nickel_Gear.get(),
                        ModItems.Signalum_Gear.get(),
                        ModItems.Osmium_Gear.get(),
                        ModItems.Platinum_Gear.get(),
                        ModItems.Quartz_Gear.get(),
                        ModItems.Quartz_Enriched_Iron_Gear.get(),
                        ModItems.Refined_Obsidian_Gear.get(),
                        ModItems.Refined_Glowstone_Gear.get(),
                        ModItems.Rose_Gold_Gear.get(),
                        ModItems.Ruby_Gear.get(),
                        ModItems.Sapphire_Gear.get(),
                        ModItems.Silver_Gear.get(),
                        ModItems.Steel_Gear.get(),
                        ModItems.Tin_Gear.get(),
                        ModItems.Uranium_Gear.get(),
                        ModItems.Zinc_Gear.get());

        this.tag(ModTags.Items.GEMS)
                .add(
                        ModItems.Apatite.get(),
                        ModItems.Cinnabar.get(),
                        ModItems.Ruby.get(),
                        ModItems.Sapphire.get());

        this.tag(ModTags.Items.NUGGETS)
                .add(
                        ModItems.Andesite_Alloy_Nugget.get(),
                        ModItems.Aluminum_Nugget.get(),
                        ModItems.Brass_Nugget.get(),
                        ModItems.Bronze_Nugget.get(),
                        ModItems.Constantan_Nugget.get(),
                        ModItems.Electrum_Nugget.get(),
                        ModItems.Enderium_Nugget.get(),
                        ModItems.Invar_Nugget.get(),
                        ModItems.Iridium_Nugget.get(),
                        ModItems.Lead_Nugget.get(),
                        ModItems.Lumium_Nugget.get(),
                        ModItems.Nickel_Nugget.get(),
                        ModItems.Signalum_Nugget.get(),
                        ModItems.Osmium_Nugget.get(),
                        ModItems.Platinum_Nugget.get(),
                        ModItems.Quartz_Enriched_Iron_Nugget.get(),
                        ModItems.Refined_Glowstone_Ingot.get(),
                        ModItems.Refined_Obsidian_Nugget.get(),
                        ModItems.Rose_Gold_Nugget.get(),
                        ModItems.Silver_Nugget.get(),
                        ModItems.Steel_Nugget.get(),
                        ModItems.Tin_Nugget.get(),
                        ModItems.Uranium_Nugget.get(),
                        ModItems.Zinc_Nugget.get());

        this.tag(ModTags.Items.INGOTS)
                .add(
                        ModItems.Aluminum_Ingot.get(),
                        ModItems.Andesite_Alloy_Ingot.get(),
                        ModItems.Brass_Ingot.get(),
                        ModItems.Bronze_Ingot.get(),
                        ModItems.Constantan_Ingot.get(),
                        ModItems.Electrum_Ingot.get(),
                        ModItems.Enderium_Ingot.get(),
                        ModItems.Graphite_Ingot.get(),
                        ModItems.Invar_Ingot.get(),
                        ModItems.Iridium_Ingot.get(),
                        ModItems.Iron_Compressed_Ingot.get(),
                        ModItems.Lead_Ingot.get(),
                        ModItems.Lumium_Ingot.get(),
                        ModItems.Nickel_Ingot.get(),
                        ModItems.Osmium_Ingot.get(),
                        ModItems.Platinum_Ingot.get(),
                        ModItems.Refined_Glowstone_Ingot.get(),
                        ModItems.Refined_Obsidian_Ingot.get(),
                        ModItems.Rose_Gold_Ingot.get(),
                        ModItems.Signalum_Ingot.get(),
                        ModItems.Silver_Ingot.get(),
                        ModItems.Steel_Ingot.get(),
                        ModItems.Tin_Ingot.get(),
                        ModItems.Zinc_Ingot.get());

        this.tag(ModTags.Items.RAW_MATERIALS)
                .add(
                        ModItems.Raw_Aluminum.get(),
                        ModItems.Raw_Iridium.get(),
                        ModItems.Raw_Lead.get(),
                        ModItems.Raw_Nickel.get(),
                        ModItems.Raw_Osmium.get(),
                        ModItems.Raw_Platinum.get(),
                        ModItems.Raw_Silver.get(),
                        ModItems.Raw_Tin.get(),
                        ModItems.Raw_Uranium.get(),
                        ModItems.Raw_Zinc.get());
    }
}
