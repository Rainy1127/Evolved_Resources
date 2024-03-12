package net.indevo.evolved_resources.datagen.loot;

import net.indevo.evolved_resources.block.ModBlocks;
import net.indevo.evolved_resources.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.Aluminum_Block.get());
        this.dropSelf(ModBlocks.Andesite_Alloy_Block.get());
        this.dropSelf(ModBlocks.Apatite_Block.get());
        this.dropSelf(ModBlocks.Brass_Block.get());
        this.dropSelf(ModBlocks.Bronze_Block.get());
        this.dropSelf(ModBlocks.Cinnabar_Block.get());
        this.dropSelf(ModBlocks.Constantan_Block.get());
        this.dropSelf(ModBlocks.Electrum_Block.get());
        this.dropSelf(ModBlocks.Enderium_Block.get());
        this.dropSelf(ModBlocks.Graphite_Block.get());
        this.dropSelf(ModBlocks.Iron_Compressed_Block.get());
        this.dropSelf(ModBlocks.Invar_Block.get());
        this.dropSelf(ModBlocks.Iridium_Block.get());
        this.dropSelf(ModBlocks.Lead_Block.get());
        this.dropSelf(ModBlocks.Lumium_Block.get());
        this.dropSelf(ModBlocks.Nickel_Block.get());
        this.dropSelf(ModBlocks.Osmium_Block.get());
        this.dropSelf(ModBlocks.Platinum_Block.get());
        this.dropSelf(ModBlocks.Quartz_Enriched_Iron_Block.get());
        this.dropSelf(ModBlocks.Raw_Aluminum_Block.get());
        this.dropSelf(ModBlocks.Raw_Iridium_Block.get());
        this.dropSelf(ModBlocks.Raw_Lead_Block.get());
        this.dropSelf(ModBlocks.Raw_Nickel_Block.get());
        this.dropSelf(ModBlocks.Raw_Osmium_Block.get());
        this.dropSelf(ModBlocks.Raw_Platinum_Block.get());
        this.dropSelf(ModBlocks.Raw_Silver_Block.get());
        this.dropSelf(ModBlocks.Raw_Tin_Block.get());
        this.dropSelf(ModBlocks.Raw_Uranium_Block.get());
        this.dropSelf(ModBlocks.Raw_Zinc_Block.get());
        this.dropSelf(ModBlocks.Refined_Obsidian_Block.get());
        this.dropSelf(ModBlocks.Refined_Glowstone_Block.get());
        this.dropSelf(ModBlocks.Rose_Gold_Block.get());
        this.dropSelf(ModBlocks.Ruby_Block.get());
        this.dropSelf(ModBlocks.Sapphire_Block.get());
        this.dropSelf(ModBlocks.Signalum_Block.get());
        this.dropSelf(ModBlocks.Silver_Block.get());
        this.dropSelf(ModBlocks.Steel_Block.get());
        this.dropSelf(ModBlocks.Tin_Block.get());
        this.dropSelf(ModBlocks.Uranium_Block.get());
        this.dropSelf(ModBlocks.Zinc_Block.get());

        this.add(ModBlocks.Aluminum_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Aluminum_Ore.get(), ModItems.Raw_Aluminum.get()));

        this.add(ModBlocks.Deepslate_Aluminum_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Aluminum_Ore.get(), ModItems.Raw_Aluminum.get()));

        this.add(ModBlocks.Apatite_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Apatite_Ore.get(), ModItems.Apatite.get()));

        this.add(ModBlocks.Cinnabar_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Cinnabar_Ore.get(), ModItems.Cinnabar.get()));

        this.add(ModBlocks.Deepslate_Apatite_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Deepslate_Apatite_Ore.get(), ModItems.Apatite.get()));

        this.add(ModBlocks.Deepslate_Cinnabar_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Deepslate_Cinnabar_Ore.get(), ModItems.Cinnabar.get()));

        this.add(ModBlocks.Deepslate_Iridium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Iridium_Ore.get(), ModItems.Raw_Iridium.get()));

        this.add(ModBlocks.Deepslate_Lead_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Lead_Ore.get(), ModItems.Raw_Lead.get()));

        this.add(ModBlocks.Deepslate_Nickel_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Nickel_Ore.get(), ModItems.Raw_Nickel.get()));

        this.add(ModBlocks.Deepslate_Osmium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Osmium_Ore.get(), ModItems.Raw_Osmium.get()));

        this.add(ModBlocks.Deepslate_Platinum_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Platinum_Ore.get(), ModItems.Raw_Platinum.get()));

        this.add(ModBlocks.Deepslate_Ruby_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Deepslate_Ruby_Ore.get(), ModItems.Ruby.get()));

        this.add(ModBlocks.Deepslate_Sapphire_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Deepslate_Sapphire_Ore.get(), ModItems.Sapphire.get()));

        this.add(ModBlocks.Deepslate_Silver_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Silver_Ore.get(), ModItems.Raw_Silver.get()));

        this.add(ModBlocks.Deepslate_Tin_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Tin_Ore.get(), ModItems.Raw_Tin.get()));

        this.add(ModBlocks.Deepslate_Uranium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Uranium_Ore.get(), ModItems.Raw_Uranium.get()));

        this.add(ModBlocks.Deepslate_Zinc_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Deepslate_Zinc_Ore.get(), ModItems.Raw_Zinc.get()));

        this.add(ModBlocks.Iridium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Iridium_Ore.get(), ModItems.Raw_Iridium.get()));

        this.add(ModBlocks.Lead_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Lead_Ore.get(), ModItems.Raw_Lead.get()));

        this.add(ModBlocks.Nickel_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Nickel_Ore.get(), ModItems.Raw_Nickel.get()));

        this.add(ModBlocks.Osmium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Osmium_Ore.get(), ModItems.Raw_Osmium.get()));

        this.add(ModBlocks.Platinum_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Platinum_Ore.get(), ModItems.Raw_Platinum.get()));

        this.add(ModBlocks.Ruby_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Ruby_Ore.get(), ModItems.Ruby.get()));

        this.add(ModBlocks.Sapphire_Ore.get(),
                block -> createGemLikeOreDrops(ModBlocks.Sapphire_Ore.get(), ModItems.Sapphire.get()));

        this.add(ModBlocks.Silver_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Silver_Ore.get(), ModItems.Raw_Silver.get()));

        this.add(ModBlocks.Tin_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Tin_Ore.get(), ModItems.Raw_Tin.get()));

        this.add(ModBlocks.Uranium_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Uranium_Ore.get(), ModItems.Raw_Uranium.get()));

        this.add(ModBlocks.Zinc_Ore.get(),
                block -> createCopperLikeOreDrops(ModBlocks.Zinc_Ore.get(), ModItems.Raw_Zinc.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createGemLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
