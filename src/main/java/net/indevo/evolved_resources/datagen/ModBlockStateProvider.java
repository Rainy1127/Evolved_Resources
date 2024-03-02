package net.indevo.evolved_resources.datagen;

import net.indevo.evolved_resources.Evolved_Resources;
import net.indevo.evolved_resources.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Evolved_Resources.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.Aluminum_Block);
        blockWithItem(ModBlocks.Aluminum_Ore);
        blockWithItem(ModBlocks.Andesite_Alloy_Block);
        blockWithItem(ModBlocks.Apatite_Block);
        blockWithItem(ModBlocks.Apatite_Ore);
        blockWithItem(ModBlocks.Brass_Block);
        blockWithItem(ModBlocks.Bronze_Block);
        blockWithItem(ModBlocks.Cinnabar_Block);
        blockWithItem(ModBlocks.Cinnabar_Ore);
        blockWithItem(ModBlocks.Constantan_Block);
        blockWithItem(ModBlocks.Deepslate_Aluminum_Ore);
        blockWithItem(ModBlocks.Deepslate_Apatite_Ore);
        blockWithItem(ModBlocks.Deepslate_Cinnabar_Ore);
        blockWithItem(ModBlocks.Deepslate_Iridium_Ore);
        blockWithItem(ModBlocks.Deepslate_Lead_Ore);
        blockWithItem(ModBlocks.Deepslate_Nickel_Ore);
        blockWithItem(ModBlocks.Deepslate_Osmium_Ore);
        blockWithItem(ModBlocks.Deepslate_Platinum_Ore);
        blockWithItem(ModBlocks.Deepslate_Ruby_Ore);
        blockWithItem(ModBlocks.Deepslate_Sapphire_Ore);
        blockWithItem(ModBlocks.Deepslate_Silver_Ore);
        blockWithItem(ModBlocks.Deepslate_Tin_Ore);
        blockWithItem(ModBlocks.Deepslate_Uranium_Ore);
        blockWithItem(ModBlocks.Deepslate_Zinc_Ore);
        blockWithItem(ModBlocks.Electrum_Block);
        blockWithItem(ModBlocks.Enderium_Block);
        blockWithItem(ModBlocks.Graphite_Block);
        blockWithItem(ModBlocks.Iron_Compressed_Block);
        blockWithItem(ModBlocks.Invar_Block);
        blockWithItem(ModBlocks.Iridium_Block);
        blockWithItem(ModBlocks.Iridium_Ore);
        blockWithItem(ModBlocks.Lead_Block);
        blockWithItem(ModBlocks.Lead_Ore);
        blockWithItem(ModBlocks.Lumium_Block);
        blockWithItem(ModBlocks.Nickel_Block);
        blockWithItem(ModBlocks.Nickel_Ore);
        blockWithItem(ModBlocks.Osmium_Block);
        blockWithItem(ModBlocks.Osmium_Ore);
        blockWithItem(ModBlocks.Platinum_Block);
        blockWithItem(ModBlocks.Platinum_Ore);
        blockWithItem(ModBlocks.Quartz_Enriched_Iron_Block);
        blockWithItem(ModBlocks.Raw_Aluminum_Block);
        blockWithItem(ModBlocks.Raw_Iridium_Block);
        blockWithItem(ModBlocks.Raw_Lead_Block);
        blockWithItem(ModBlocks.Raw_Nickel_Block);
        blockWithItem(ModBlocks.Raw_Osmium_Block);
        blockWithItem(ModBlocks.Raw_Platinum_Block);
        blockWithItem(ModBlocks.Raw_Silver_Block);
        blockWithItem(ModBlocks.Raw_Tin_Block);
        blockWithItem(ModBlocks.Raw_Uranium_Block);
        blockWithItem(ModBlocks.Raw_Zinc_Block);
        blockWithItem(ModBlocks.Refined_Glowstone_Block);
        blockWithItem(ModBlocks.Refined_Obsidian_Block);
        blockWithItem(ModBlocks.Rose_Gold_Block);
        blockWithItem(ModBlocks.Ruby_Block);
        blockWithItem(ModBlocks.Ruby_Ore);
        blockWithItem(ModBlocks.Sapphire_Block);
        blockWithItem(ModBlocks.Sapphire_Ore);
        blockWithItem(ModBlocks.Signalum_Block);
        blockWithItem(ModBlocks.Silver_Block);
        blockWithItem(ModBlocks.Silver_Ore);
        blockWithItem(ModBlocks.Steel_Block);
        blockWithItem(ModBlocks.Tin_Block);
        blockWithItem(ModBlocks.Tin_Ore);
        blockWithItem(ModBlocks.Uranium_Block);
        blockWithItem(ModBlocks.Uranium_Ore);
        blockWithItem(ModBlocks.Zinc_Block);
        blockWithItem(ModBlocks.Zinc_Ore);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
