package net.indevo.evolved_resources.datagen;

import net.indevo.evolved_resources.Evolved_Resources;
import net.indevo.evolved_resources.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Evolved_Resources.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Aluminum_Coin);
        simpleItem(ModItems.Aluminum_Dust);
        simpleItem(ModItems.Aluminum_Gear);
        simpleItem(ModItems.Aluminum_Ingot);
        simpleItem(ModItems.Aluminum_Nugget);
        simpleItem(ModItems.Aluminum_Plate);
        simpleItem(ModItems.Aluminum_Rod);
        simpleItem(ModItems.Amethyst_Dust);
        simpleItem(ModItems.Andesite_Alloy_Coin);
        simpleItem(ModItems.Andesite_Alloy_Dust);
        simpleItem(ModItems.Andesite_Alloy_Gear);
        simpleItem(ModItems.Andesite_Alloy_Ingot);
        simpleItem(ModItems.Andesite_Alloy_Nugget);
        simpleItem(ModItems.Andesite_Alloy_Plate);
        simpleItem(ModItems.Andesite_Alloy_Rod);
        simpleItem(ModItems.Apatite);
        simpleItem(ModItems.Apatite_Coin);
        simpleItem(ModItems.Apatite_Dust);
        simpleItem(ModItems.Apatite_Plate);
        simpleItem(ModItems.Apatite_Rod);
        simpleItem(ModItems.Brass_Coin);
        simpleItem(ModItems.Brass_Dust);
        simpleItem(ModItems.Brass_Gear);
        simpleItem(ModItems.Brass_Ingot);
        simpleItem(ModItems.Brass_Nugget);
        simpleItem(ModItems.Brass_Plate);
        simpleItem(ModItems.Brass_Rod);
        simpleItem(ModItems.Bronze_Coin);
        simpleItem(ModItems.Bronze_Dust);
        simpleItem(ModItems.Bronze_Gear);
        simpleItem(ModItems.Bronze_Ingot);
        simpleItem(ModItems.Bronze_Nugget);
        simpleItem(ModItems.Bronze_Plate);
        simpleItem(ModItems.Bronze_Rod);
        simpleItem(ModItems.Calcite_Dust);
        simpleItem(ModItems.Charcoal_Dust);
        simpleItem(ModItems.Cinnabar);
        simpleItem(ModItems.Cinnabar_Coin);
        simpleItem(ModItems.Cinnabar_Dust);
        simpleItem(ModItems.Cinnabar_Plate);
        simpleItem(ModItems.Cinnabar_Rod);
        simpleItem(ModItems.Coal_Dust);
        simpleItem(ModItems.Constantan_Coin);
        simpleItem(ModItems.Constantan_Dust);
        simpleItem(ModItems.Constantan_Gear);
        simpleItem(ModItems.Constantan_Ingot);
        simpleItem(ModItems.Constantan_Nugget);
        simpleItem(ModItems.Constantan_Plate);
        simpleItem(ModItems.Constantan_Rod);
        simpleItem(ModItems.Copper_Coin);
        simpleItem(ModItems.Copper_Dust);
        simpleItem(ModItems.Copper_Gear);
        simpleItem(ModItems.Copper_Nugget);
        simpleItem(ModItems.Copper_Plate);
        simpleItem(ModItems.Copper_Rod);
        simpleItem(ModItems.Diamond_Coin);
        simpleItem(ModItems.Diamond_Dust);
        simpleItem(ModItems.Diamond_Gear);
        simpleItem(ModItems.Diamond_Plate);
        simpleItem(ModItems.Electrum_Coin);
        simpleItem(ModItems.Electrum_Dust);
        simpleItem(ModItems.Electrum_Gear);
        simpleItem(ModItems.Electrum_Ingot);
        simpleItem(ModItems.Electrum_Nugget);
        simpleItem(ModItems.Electrum_Plate);
        simpleItem(ModItems.Electrum_Rod);
        simpleItem(ModItems.Emerald_Coin);
        simpleItem(ModItems.Emerald_Dust);
        simpleItem(ModItems.Emerald_Gear);
        simpleItem(ModItems.Emerald_Plate);
        simpleItem(ModItems.Ender_Pearl_Dust);
        simpleItem(ModItems.End_Stone_Dust);
        simpleItem(ModItems.Enderium_Coin);
        simpleItem(ModItems.Enderium_Dust);
        simpleItem(ModItems.Enderium_Gear);
        simpleItem(ModItems.Enderium_Ingot);
        simpleItem(ModItems.Enderium_Nugget);
        simpleItem(ModItems.Enderium_Plate);
        simpleItem(ModItems.Enderium_Rod);
        simpleItem(ModItems.Enriched_Uranium);
        simpleItem(ModItems.Enriched_Uranium_Dust);
        simpleItem(ModItems.Gold_Coin);
        simpleItem(ModItems.Gold_Dust);
        simpleItem(ModItems.Gold_Gear);
        simpleItem(ModItems.Gold_Plate);
        simpleItem(ModItems.Gold_Rod);
        simpleItem(ModItems.Graphite_Dust);
        simpleItem(ModItems.Graphite_Ingot);
        simpleItem(ModItems.Graphite_Plate);
        simpleItem(ModItems.Graphite_Rod);
        simpleItem(ModItems.Invar_Coin);
        simpleItem(ModItems.Invar_Dust);
        simpleItem(ModItems.Invar_Gear);
        simpleItem(ModItems.Invar_Ingot);
        simpleItem(ModItems.Invar_Nugget);
        simpleItem(ModItems.Invar_Plate);
        simpleItem(ModItems.Invar_Rod);
        simpleItem(ModItems.Iridium_Coin);
        simpleItem(ModItems.Iridium_Dust);
        simpleItem(ModItems.Iridium_Gear);
        simpleItem(ModItems.Iridium_Ingot);
        simpleItem(ModItems.Iridium_Nugget);
        simpleItem(ModItems.Iridium_Plate);
        simpleItem(ModItems.Iridium_Rod);
        simpleItem(ModItems.Iron_Compressed_Coin);
        simpleItem(ModItems.Iron_Compressed_Dust);
        simpleItem(ModItems.Iron_Compressed_Gear);
        simpleItem(ModItems.Iron_Compressed_Ingot);
        simpleItem(ModItems.Iron_Compressed_Nugget);
        simpleItem(ModItems.Iron_Compressed_Plate);
        simpleItem(ModItems.Iron_Compressed_Rod);
        simpleItem(ModItems.Iron_Coin);
        simpleItem(ModItems.Iron_Dust);
        simpleItem(ModItems.Iron_Gear);
        simpleItem(ModItems.Iron_Plate);
        simpleItem(ModItems.Iron_Rod);
        simpleItem(ModItems.Platinum_Ingot);
        simpleItem(ModItems.Lapis_Lazuli_Coin);
        simpleItem(ModItems.Lapis_Lazuli_Dust);
        simpleItem(ModItems.Lapis_Lazuli_Gear);
        simpleItem(ModItems.Lapis_Lazuli_Plate);
        simpleItem(ModItems.Lead_Coin);
        simpleItem(ModItems.Lead_Dust);
        simpleItem(ModItems.Lead_Gear);
        simpleItem(ModItems.Lead_Ingot);
        simpleItem(ModItems.Lead_Nugget);
        simpleItem(ModItems.Lead_Plate);
        simpleItem(ModItems.Lead_Rod);
        simpleItem(ModItems.Lumium_Coin);
        simpleItem(ModItems.Lumium_Dust);
        simpleItem(ModItems.Lumium_Gear);
        simpleItem(ModItems.Lumium_Ingot);
        simpleItem(ModItems.Lumium_Nugget);
        simpleItem(ModItems.Lumium_Plate);
        simpleItem(ModItems.Lumium_Rod);
        simpleItem(ModItems.Netherrack_Dust);
        simpleItem(ModItems.Netherite_Coin);
        simpleItem(ModItems.Netherite_Dust);
        simpleItem(ModItems.Netherite_Gear);
        simpleItem(ModItems.Netherite_Nugget);
        simpleItem(ModItems.Netherite_Plate);
        simpleItem(ModItems.Netherite_Rod);
        simpleItem(ModItems.Nickel_Coin);
        simpleItem(ModItems.Nickel_Dust);
        simpleItem(ModItems.Nickel_Gear);
        simpleItem(ModItems.Nickel_Ingot);
        simpleItem(ModItems.Nickel_Nugget);
        simpleItem(ModItems.Nickel_Plate);
        simpleItem(ModItems.Nickel_Rod);
        simpleItem(ModItems.Obsidian_Dust);
        simpleItem(ModItems.Osmium_Coin);
        simpleItem(ModItems.Osmium_Dust);
        simpleItem(ModItems.Osmium_Gear);
        simpleItem(ModItems.Osmium_Ingot);
        simpleItem(ModItems.Osmium_Nugget);
        simpleItem(ModItems.Osmium_Plate);
        simpleItem(ModItems.Osmium_Rod);
        simpleItem(ModItems.Plastic_Plate);
        simpleItem(ModItems.Plastic_Rod);
        simpleItem(ModItems.Platinum_Coin);
        simpleItem(ModItems.Platinum_Dust);
        simpleItem(ModItems.Platinum_Gear);
        simpleItem(ModItems.Platinum_Ingot);
        simpleItem(ModItems.Platinum_Nugget);
        simpleItem(ModItems.Platinum_Plate);
        simpleItem(ModItems.Platinum_Rod);
        simpleItem(ModItems.Polished_Apatite);
        simpleItem(ModItems.Polished_Cinnabar);
        simpleItem(ModItems.Polished_Diamond);
        simpleItem(ModItems.Polished_Emerald);
        simpleItem(ModItems.Polished_Quartz);
        simpleItem(ModItems.Polished_Lapis_Lazuli);
        simpleItem(ModItems.Polished_Ruby);
        simpleItem(ModItems.Polished_Sapphire);
        simpleItem(ModItems.Crying_Obsidian_Dust);
        simpleItem(ModItems.Prismarine_Dust);
        simpleItem(ModItems.Quartz_Coin);
        simpleItem(ModItems.Quartz_Dust);
        simpleItem(ModItems.Quartz_Enriched_Iron_Coin);
        simpleItem(ModItems.Quartz_Enriched_Iron_Dust);
        simpleItem(ModItems.Quartz_Enriched_Iron_Gear);
        simpleItem(ModItems.Quartz_Enriched_Iron_Ingot);
        simpleItem(ModItems.Quartz_Enriched_Iron_Nugget);
        simpleItem(ModItems.Quartz_Enriched_Iron_Plate);
        simpleItem(ModItems.Quartz_Enriched_Iron_Rod);
        simpleItem(ModItems.Quartz_Gear);
        simpleItem(ModItems.Quartz_Plate);
        simpleItem(ModItems.Quartz_Coin);
        simpleItem(ModItems.Quartz_Dust);
        simpleItem(ModItems.Raw_Aluminum);
        simpleItem(ModItems.Raw_Iridium);
        simpleItem(ModItems.Raw_Lead);
        simpleItem(ModItems.Raw_Nickel);
        simpleItem(ModItems.Raw_Osmium);
        simpleItem(ModItems.Raw_Platinum);
        simpleItem(ModItems.Raw_Silver);
        simpleItem(ModItems.Raw_Tin);
        simpleItem(ModItems.Raw_Uranium);
        simpleItem(ModItems.Raw_Zinc);
        simpleItem(ModItems.Refined_Glowstone_Coin);
        simpleItem(ModItems.Refined_Glowstone_Dust);
        simpleItem(ModItems.Refined_Glowstone_Gear);
        simpleItem(ModItems.Refined_Glowstone_Ingot);
        simpleItem(ModItems.Refined_Glowstone_Nugget);
        simpleItem(ModItems.Refined_Glowstone_Plate);
        simpleItem(ModItems.Refined_Glowstone_Rod);
        simpleItem(ModItems.Refined_Obsidian_Coin);
        simpleItem(ModItems.Refined_Obsidian_Dust);
        simpleItem(ModItems.Refined_Obsidian_Gear);
        simpleItem(ModItems.Refined_Obsidian_Ingot);
        simpleItem(ModItems.Refined_Obsidian_Nugget);
        simpleItem(ModItems.Refined_Obsidian_Plate);
        simpleItem(ModItems.Refined_Obsidian_Rod);
        simpleItem(ModItems.Rose_Gold_Coin);
        simpleItem(ModItems.Rose_Gold_Dust);
        simpleItem(ModItems.Rose_Gold_Gear);
        simpleItem(ModItems.Rose_Gold_Ingot);
        simpleItem(ModItems.Rose_Gold_Nugget);
        simpleItem(ModItems.Rose_Gold_Plate);
        simpleItem(ModItems.Rose_Gold_Rod);
        simpleItem(ModItems.Ruby);
        simpleItem(ModItems.Ruby_Coin);
        simpleItem(ModItems.Ruby_Dust);
        simpleItem(ModItems.Ruby_Gear);
        simpleItem(ModItems.Ruby_Plate);
        simpleItem(ModItems.Ruby_Rod);
        simpleItem(ModItems.Sapphire);
        simpleItem(ModItems.Sapphire_Coin);
        simpleItem(ModItems.Sapphire_Dust);
        simpleItem(ModItems.Sapphire_Gear);
        simpleItem(ModItems.Sapphire_Plate);
        simpleItem(ModItems.Sapphire_Rod);
        simpleItem(ModItems.Signalum_Coin);
        simpleItem(ModItems.Signalum_Dust);
        simpleItem(ModItems.Signalum_Gear);
        simpleItem(ModItems.Signalum_Ingot);
        simpleItem(ModItems.Signalum_Nugget);
        simpleItem(ModItems.Signalum_Plate);
        simpleItem(ModItems.Signalum_Rod);
        simpleItem(ModItems.Silver_Coin);
        simpleItem(ModItems.Silver_Dust);
        simpleItem(ModItems.Silver_Gear);
        simpleItem(ModItems.Silver_Ingot);
        simpleItem(ModItems.Silver_Nugget);
        simpleItem(ModItems.Silver_Plate);
        simpleItem(ModItems.Silver_Rod);
        simpleItem(ModItems.Steel_Coin);
        simpleItem(ModItems.Steel_Dust);
        simpleItem(ModItems.Steel_Gear);
        simpleItem(ModItems.Steel_Ingot);
        simpleItem(ModItems.Steel_Nugget);
        simpleItem(ModItems.Steel_Plate);
        simpleItem(ModItems.Steel_Rod);
        simpleItem(ModItems.Tin_Coin);
        simpleItem(ModItems.Tin_Dust);
        simpleItem(ModItems.Tin_Gear);
        simpleItem(ModItems.Tin_Ingot);
        simpleItem(ModItems.Tin_Nugget);
        simpleItem(ModItems.Tin_Plate);
        simpleItem(ModItems.Tin_Rod);
        simpleItem(ModItems.Uranium_Coin);
        simpleItem(ModItems.Uranium_Dust);
        simpleItem(ModItems.Uranium_Gear);
        simpleItem(ModItems.Uranium_Ingot);
        simpleItem(ModItems.Uranium_Nugget);
        simpleItem(ModItems.Uranium_Plate);
        simpleItem(ModItems.Uranium_Rod);
        simpleItem(ModItems.Zinc_Dust);
        simpleItem(ModItems.Zinc_Coin);
        simpleItem(ModItems.Zinc_Gear);
        simpleItem(ModItems.Zinc_Ingot);
        simpleItem(ModItems.Zinc_Plate);
        simpleItem(ModItems.Zinc_Nugget);
        simpleItem(ModItems.Zinc_Rod);
        handheldItem(ModItems.Iron_Hammer);
        handheldItem(ModItems.Brass_Hammer);
        handheldItem(ModItems.Enderium_Hammer);
        handheldItem(ModItems.Osmium_Hammer);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Evolved_Resources.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Evolved_Resources.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Evolved_Resources.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Evolved_Resources.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Evolved_Resources.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
