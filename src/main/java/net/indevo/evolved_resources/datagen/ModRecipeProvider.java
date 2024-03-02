package net.indevo.evolved_resources.datagen;

import net.indevo.evolved_resources.Evolved_Resources;
import net.indevo.evolved_resources.block.ModBlocks;
import net.indevo.evolved_resources.item.ModItems;
import net.indevo.evolved_resources.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    //SMELTABLES

    private static final List<ItemLike> ALUMINUM_SMELTABLES = List.of(ModItems.Raw_Aluminum.get(), ModBlocks.Aluminum_Ore.get(), ModBlocks.Deepslate_Aluminum_Ore.get());
    private static final List<ItemLike> APATITE_SMELTABLES = List.of(ModBlocks.Apatite_Ore.get(), ModBlocks.Deepslate_Apatite_Ore.get());
    private static final List<ItemLike> CINNABAR_SMELTABLES = List.of(ModBlocks.Cinnabar_Ore.get(), ModBlocks.Deepslate_Cinnabar_Ore.get());
    private static final List<ItemLike> IRIDIUM_SMELTABLES = List.of(ModItems.Raw_Iridium.get() ,ModBlocks.Iridium_Ore.get(), ModBlocks.Deepslate_Iridium_Ore.get());
    private static final List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.Raw_Lead.get() ,ModBlocks.Lead_Ore.get(), ModBlocks.Deepslate_Lead_Ore.get());
    private static final List<ItemLike> NICKEL_SMELTABLES = List.of(ModItems.Raw_Nickel.get() ,ModBlocks.Nickel_Ore.get(), ModBlocks.Deepslate_Nickel_Ore.get());
    private static final List<ItemLike> OSMIUM_SMELTABLES = List.of(ModItems.Raw_Osmium.get() ,ModBlocks.Osmium_Ore.get(), ModBlocks.Deepslate_Osmium_Ore.get());
    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.Raw_Platinum.get() ,ModBlocks.Platinum_Ore.get(), ModBlocks.Deepslate_Platinum_Ore.get());
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.Ruby_Ore.get(), ModBlocks.Deepslate_Ruby_Ore.get());
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.Sapphire_Ore.get(), ModBlocks.Deepslate_Sapphire_Ore.get());
    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.Raw_Silver.get(), ModBlocks.Silver_Ore.get(), ModBlocks.Deepslate_Silver_Ore.get());
    private static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.Raw_Tin.get(), ModBlocks.Tin_Ore.get(), ModBlocks.Deepslate_Tin_Ore.get());
    private static final List<ItemLike> URANIUM_SMELTABLES = List.of(ModItems.Raw_Uranium.get(), ModBlocks.Uranium_Ore.get(), ModBlocks.Deepslate_Uranium_Ore.get());
    private static final List<ItemLike> ZINC_SMELTABLES = List.of(ModItems.Raw_Zinc.get(), ModBlocks.Zinc_Ore.get(), ModBlocks.Deepslate_Zinc_Ore.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //BLOCKS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Aluminum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Aluminum_Ingot.get())
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Andesite_Alloy_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Andesite_Alloy_Ingot.get())
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Apatite_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Apatite.get())
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Apatite.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Brass_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Brass_Ingot.get())
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Bronze_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Bronze_Ingot.get())
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Cinnabar_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Cinnabar.get())
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Cinnabar.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Constantan_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Constantan_Ingot.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Electrum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Electrum_Ingot.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Enderium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Enderium_Ingot.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Graphite_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Graphite_Ingot.get())
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Graphite_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Invar_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Invar_Ingot.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Iridium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Iridium_Ingot.get())
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Iron_Compressed_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Iron_Compressed_Ingot.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Lead_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Lead_Ingot.get())
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Lumium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Lumium_Ingot.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Nickel_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Nickel_Ingot.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Osmium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Osmium_Ingot.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Platinum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Platinum_Ingot.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Refined_Glowstone_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Refined_Glowstone_Ingot.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Refined_Obsidian_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Refined_Obsidian_Ingot.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Rose_Gold_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Rose_Gold_Ingot.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Ruby_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Ruby.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Ruby.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Sapphire_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Sapphire.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Sapphire.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Signalum_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Signalum_Ingot.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Silver_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Silver_Ingot.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Steel_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Steel_Ingot.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Tin_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Tin_Ingot.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Uranium_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Uranium_Ingot.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Zinc_Block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Zinc_Ingot.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .save(pWriter);

        //GEARS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Aluminum_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Aluminum_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Andesite_Alloy_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Andesite_Alloy_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Brass_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Brass_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Bronze_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Bronze_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Constantan_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Constantan_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Copper_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.COPPER_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Diamond_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.DIAMOND)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Electrum_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Electrum_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Emerald_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.EMERALD)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Enderium_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Enderium_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Gold_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.GOLD_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Invar_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Invar_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iridium_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Iridium_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Compressed_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Iron_Compressed_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.IRON_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lapis_Lazuli_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.LAPIS_LAZULI)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lead_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Lead_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lumium_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Lumium_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Netherite_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.NETHERITE_INGOT)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Nickel_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Nickel_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Osmium_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Osmium_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Platinum_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Platinum_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Quartz_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  Items.QUARTZ)
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_quartz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.QUARTZ).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Glowstone_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Refined_Glowstone_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Obsidian_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Refined_Obsidian_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Rose_Gold_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Rose_Gold_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Ruby_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Ruby.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Ruby.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Sapphire_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Sapphire.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Sapphire.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Signalum_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Signalum_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Silver_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Silver_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Steel_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Steel_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Tin_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Tin_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Uranium_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Uranium_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Zinc_Gear.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A',  ModItems.Zinc_Ingot.get())
                .define('B', Items.IRON_NUGGET)
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pWriter);

        //INGOTS FROM NUGGETS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Aluminum_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Aluminum_Nugget.get())
                .unlockedBy("has_aluminum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Andesite_Alloy_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Andesite_Alloy_Nugget.get())
                .unlockedBy("has_andesite_alloy_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Brass_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Brass_Nugget.get())
                .unlockedBy("has_brass_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Bronze_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Bronze_Nugget.get())
                .unlockedBy("has_bronze_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Constantan_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Constantan_Nugget.get())
                .unlockedBy("has_constantan_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Copper_Nugget.get())
                .unlockedBy("has_copper_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Copper_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Electrum_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Electrum_Nugget.get())
                .unlockedBy("has_electrum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Enderium_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Enderium_Nugget.get())
                .unlockedBy("has_enderium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Invar_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Invar_Nugget.get())
                .unlockedBy("has_invar_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iridium_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Iridium_Nugget.get())
                .unlockedBy("has_iridium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Compressed_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Iron_Compressed_Nugget.get())
                .unlockedBy("has_iron_compressed_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lead_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Lead_Nugget.get())
                .unlockedBy("has_lead_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lumium_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Lumium_Nugget.get())
                .unlockedBy("has_lumium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHERITE_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Netherite_Nugget.get())
                .unlockedBy("has_netherite_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Netherite_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Nickel_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Nickel_Nugget.get())
                .unlockedBy("has_nickel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Osmium_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Osmium_Nugget.get())
                .unlockedBy("has_osmium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Platinum_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Platinum_Nugget.get())
                .unlockedBy("has_platinum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Glowstone_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Refined_Glowstone_Nugget.get())
                .unlockedBy("has_refined_glowstone_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Obsidian_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Refined_Obsidian_Nugget.get())
                .unlockedBy("has_refined_obsidian_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Rose_Gold_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Rose_Gold_Nugget.get())
                .unlockedBy("has_rose_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Signalum_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Signalum_Nugget.get())
                .unlockedBy("has_signalum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Silver_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Silver_Nugget.get())
                .unlockedBy("has_silver_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Steel_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Steel_Nugget.get())
                .unlockedBy("has_steel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Tin_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Tin_Nugget.get())
                .unlockedBy("has_tin_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Uranium_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Uranium_Nugget.get())
                .unlockedBy("has_uranium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Zinc_Ingot.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Zinc_Nugget.get())
                .unlockedBy("has_zinc_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Nugget.get()).build()))
                .save(pWriter);

        //RODS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Aluminum_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Aluminum_Ingot.get())
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Andesite_Alloy_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Andesite_Alloy_Ingot.get())
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Apatite_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Apatite.get())
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Apatite.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Brass_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Brass_Ingot.get())
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Bronze_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Bronze_Ingot.get())
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Cinnabar_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Cinnabar.get())
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Cinnabar.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Constantan_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Constantan_Ingot.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Copper_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Electrum_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Electrum_Ingot.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Enderium_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Enderium_Ingot.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Gold_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Graphite_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Graphite_Ingot.get())
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Graphite_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Invar_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Invar_Ingot.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iridium_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Iridium_Ingot.get())
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Compressed_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Iron_Compressed_Ingot.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lead_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Lead_Ingot.get())
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lumium_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Lumium_Ingot.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Nickel_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Nickel_Ingot.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Osmium_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Osmium_Ingot.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Plastic_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Plastic_Plate.get())
                .unlockedBy("has_plastic_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Plastic_Plate.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Platinum_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Platinum_Ingot.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Glowstone_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Refined_Glowstone_Ingot.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Obsidian_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Refined_Obsidian_Ingot.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Rose_Gold_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Rose_Gold_Ingot.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Ruby_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Ruby.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Ruby.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Sapphire_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Sapphire.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Sapphire.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Signalum_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Signalum_Ingot.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Silver_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Silver_Ingot.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Steel_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Steel_Ingot.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Tin_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Tin_Ingot.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Uranium_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Uranium_Ingot.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Zinc_Rod.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', ModItems.Zinc_Ingot.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .save(pWriter);

        //COINS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Aluminum_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Aluminum_Nugget.get())
                .unlockedBy("has_aluminum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Andesite_Alloy_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Andesite_Alloy_Nugget.get())
                .unlockedBy("has_andesite_alloy_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Brass_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Brass_Nugget.get())
                .unlockedBy("has_brass_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Bronze_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Bronze_Nugget.get())
                .unlockedBy("has_bronze_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Constantan_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Constantan_Nugget.get())
                .unlockedBy("has_constantan_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Copper_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Copper_Nugget.get())
                .unlockedBy("has_copper_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Copper_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Electrum_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Electrum_Nugget.get())
                .unlockedBy("has_electrum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Enderium_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Enderium_Nugget.get())
                .unlockedBy("has_enderium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Gold_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', Items.GOLD_NUGGET)
                .unlockedBy("has_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_NUGGET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Invar_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Invar_Nugget.get())
                .unlockedBy("has_invar_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iridium_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Iridium_Nugget.get())
                .unlockedBy("has_iridium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Compressed_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Iron_Compressed_Nugget.get())
                .unlockedBy("has_iron_compressed_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lead_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Lead_Nugget.get())
                .unlockedBy("has_lead_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Lumium_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Lumium_Nugget.get())
                .unlockedBy("has_lumium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Netherite_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Netherite_Nugget.get())
                .unlockedBy("has_netherite_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Netherite_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Nickel_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Nickel_Nugget.get())
                .unlockedBy("has_nickel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Osmium_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Osmium_Nugget.get())
                .unlockedBy("has_osmium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Platinum_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Platinum_Nugget.get())
                .unlockedBy("has_platinum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Glowstone_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Refined_Glowstone_Nugget.get())
                .unlockedBy("has_refined_glowstone_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Refined_Obsidian_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Refined_Obsidian_Nugget.get())
                .unlockedBy("has_refined_obsidian_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Rose_Gold_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Rose_Gold_Nugget.get())
                .unlockedBy("has_rose_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Signalum_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Signalum_Nugget.get())
                .unlockedBy("has_signalum_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Silver_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Silver_Nugget.get())
                .unlockedBy("has_silver_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Steel_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Steel_Nugget.get())
                .unlockedBy("has_steel_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Tin_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Tin_Nugget.get())
                .unlockedBy("has_tin_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Uranium_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Uranium_Nugget.get())
                .unlockedBy("has_uranium_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Nugget.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Zinc_Coin.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.Zinc_Nugget.get())
                .unlockedBy("has_zinc_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Nugget.get()).build()))
                .save(pWriter);

        //HAMMERS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Iron_Hammer.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern(" C ")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.IRON_BLOCK)
                .define('C', Items.STICK)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .unlockedBy("has_iron_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Brass_Hammer.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern(" C ")
                .define('A', ModItems.Brass_Ingot.get())
                .define('B', ModBlocks.Brass_Block.get())
                .define('C', Items.STICK)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .unlockedBy("has_brass_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Brass_Block.get()).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Enderium_Hammer.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern(" C ")
                .define('A', ModItems.Enderium_Ingot.get())
                .define('B', ModBlocks.Enderium_Block.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .unlockedBy("has_enderium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Enderium_Block.get()).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Osmium_Hammer.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern(" C ")
                .define('A', ModItems.Osmium_Ingot.get())
                .define('B', ModBlocks.Osmium_Block.get())
                .define('C', Items.STICK)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .unlockedBy("has_osmium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Osmium_Block.get()).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Steel_Hammer.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern(" C ")
                .define('A', ModItems.Steel_Ingot.get())
                .define('B', ModBlocks.Steel_Block.get())
                .define('C', Items.STICK)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .unlockedBy("has_steel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Steel_Block.get()).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pWriter);

        //INGOTS FROM BLOCK

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Aluminum_Ingot.get(), 9)
                .requires(ModBlocks.Aluminum_Block.get())
                .unlockedBy("has_aluminum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Aluminum_Block.get()).build()))
                .save(pWriter, "evolved_resources:aluminum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Andesite_Alloy_Ingot.get(), 9)
                .requires(ModBlocks.Andesite_Alloy_Block.get())
                .unlockedBy("has_andesite_alloy_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Andesite_Alloy_Block.get()).build()))
                .save(pWriter, "evolved_resources:andesite_alloy_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Apatite.get(), 9)
                .requires(ModBlocks.Apatite_Block.get())
                .unlockedBy("has_apatite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Apatite_Block.get()).build()))
                .save(pWriter, "evolved_resources:apatite_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Brass_Ingot.get(), 9)
                .requires(ModBlocks.Brass_Block.get())
                .unlockedBy("has_brass_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Brass_Block.get()).build()))
                .save(pWriter, "evolved_resources:brass_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Bronze_Ingot.get(), 9)
                .requires(ModBlocks.Bronze_Block.get())
                .unlockedBy("has_bronze_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Bronze_Block.get()).build()))
                .save(pWriter, "evolved_resources:bronze_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Cinnabar.get(), 9)
                .requires(ModBlocks.Cinnabar_Block.get())
                .unlockedBy("has_cinnabar_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Cinnabar_Block.get()).build()))
                .save(pWriter, "evolved_resources:cinnabar_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Constantan_Ingot.get(), 9)
                .requires(ModBlocks.Constantan_Block.get())
                .unlockedBy("has_constantan_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Constantan_Block.get()).build()))
                .save(pWriter, "evolved_resources:constantan_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Electrum_Ingot.get(), 9)
                .requires(ModBlocks.Electrum_Block.get())
                .unlockedBy("has_electrum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Electrum_Block.get()).build()))
                .save(pWriter, "evolved_resources:electrum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Enderium_Ingot.get(), 9)
                .requires(ModBlocks.Enderium_Block.get())
                .unlockedBy("has_enderium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Enderium_Block.get()).build()))
                .save(pWriter, "evolved_resources:enderium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Invar_Ingot.get(), 9)
                .requires(ModBlocks.Invar_Block.get())
                .unlockedBy("has_invar_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Invar_Block.get()).build()))
                .save(pWriter, "evolved_resources:invar_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iridium_Ingot.get(), 9)
                .requires(ModBlocks.Iridium_Block.get())
                .unlockedBy("has_iridium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Iridium_Block.get()).build()))
                .save(pWriter, "evolved_resources:iridium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Compressed_Ingot.get(), 9)
                .requires(ModBlocks.Iron_Compressed_Block.get())
                .unlockedBy("has_iron_compressed_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Iron_Compressed_Block.get()).build()))
                .save(pWriter, "evolved_resources:iron_compressed_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lead_Ingot.get(), 9)
                .requires(ModBlocks.Lead_Block.get())
                .unlockedBy("has_lead_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Lead_Block.get()).build()))
                .save(pWriter, "evolved_resources:lead_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lumium_Ingot.get(), 9)
                .requires(ModBlocks.Lumium_Block.get())
                .unlockedBy("has_lumium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Lumium_Block.get()).build()))
                .save(pWriter, "evolved_resources:lumium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Nickel_Ingot.get(), 9)
                .requires(ModBlocks.Nickel_Block.get())
                .unlockedBy("has_nickel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Nickel_Block.get()).build()))
                .save(pWriter, "evolved_resources:nickel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Osmium_Ingot.get(), 9)
                .requires(ModBlocks.Osmium_Block.get())
                .unlockedBy("has_osmium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Osmium_Block.get()).build()))
                .save(pWriter, "evolved_resources:osmium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Platinum_Ingot.get(), 9)
                .requires(ModBlocks.Platinum_Block.get())
                .unlockedBy("has_platinum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Platinum_Block.get()).build()))
                .save(pWriter, "evolved_resources:platinum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Glowstone_Ingot.get(), 9)
                .requires(ModBlocks.Refined_Glowstone_Block.get())
                .unlockedBy("has_refined_glowstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Refined_Glowstone_Block.get()).build()))
                .save(pWriter, "evolved_resources:refined_glowstone_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Obsidian_Ingot.get(), 9)
                .requires(ModBlocks.Refined_Obsidian_Block.get())
                .unlockedBy("has_refined_obsidian_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Refined_Obsidian_Block.get()).build()))
                .save(pWriter, "evolved_resources:refined_obsidian_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Rose_Gold_Ingot.get(), 9)
                .requires(ModBlocks.Rose_Gold_Block.get())
                .unlockedBy("has_rose_gold_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Rose_Gold_Block.get()).build()))
                .save(pWriter, "evolved_resources:rose_gold_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Ruby.get(), 9)
                .requires(ModBlocks.Ruby_Block.get())
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Ruby_Block.get()).build()))
                .save(pWriter, "evolved_resources:ruby_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Sapphire.get(), 9)
                .requires(ModBlocks.Sapphire_Block.get())
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Sapphire_Block.get()).build()))
                .save(pWriter, "evolved_resources:sapphire_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Signalum_Ingot.get(), 9)
                .requires(ModBlocks.Signalum_Block.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Signalum_Block.get()).build()))
                .save(pWriter, "evolved_resources:signalum_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Silver_Ingot.get(), 9)
                .requires(ModBlocks.Silver_Block.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Silver_Block.get()).build()))
                .save(pWriter, "evolved_resources:silver_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Steel_Ingot.get(), 9)
                .requires(ModBlocks.Steel_Block.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Steel_Block.get()).build()))
                .save(pWriter, "evolved_resources:steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Tin_Ingot.get(), 9)
                .requires(ModBlocks.Tin_Block.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Tin_Block.get()).build()))
                .save(pWriter, "evolved_resources:tin_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Uranium_Ingot.get(), 9)
                .requires(ModBlocks.Uranium_Block.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Uranium_Block.get()).build()))
                .save(pWriter, "evolved_resources:uranium_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zinc_Ingot.get(), 9)
                .requires(ModBlocks.Zinc_Block.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.Zinc_Block.get()).build()))
                .save(pWriter, "evolved_resources:zinc_ingot_from_block");

        //NUGGETS

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Aluminum_Nugget.get(), 9)
                .requires(ModItems.Aluminum_Ingot.get())
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Andesite_Alloy_Nugget.get(), 9)
                .requires(ModItems.Andesite_Alloy_Ingot.get())
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Brass_Nugget.get(), 9)
                .requires(ModItems.Brass_Ingot.get())
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Bronze_Nugget.get(), 9)
                .requires(ModItems.Bronze_Ingot.get())
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Constantan_Nugget.get(), 9)
                .requires(ModItems.Constantan_Ingot.get())
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Copper_Nugget.get(), 9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Electrum_Nugget.get(), 9)
                .requires(ModItems.Electrum_Ingot.get())
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Enderium_Nugget.get(), 9)
                .requires(ModItems.Enderium_Ingot.get())
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Invar_Nugget.get(), 9)
                .requires(ModItems.Invar_Ingot.get())
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iridium_Nugget.get(), 9)
                .requires(ModItems.Iridium_Ingot.get())
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Compressed_Nugget.get(), 9)
                .requires(ModItems.Iron_Compressed_Ingot.get())
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lead_Nugget.get(), 9)
                .requires(ModItems.Lead_Ingot.get())
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lumium_Nugget.get(), 9)
                .requires(ModItems.Lumium_Ingot.get())
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Netherite_Nugget.get(), 9)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Nickel_Nugget.get(), 9)
                .requires(ModItems.Nickel_Ingot.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Osmium_Nugget.get(), 9)
                .requires(ModItems.Osmium_Ingot.get())
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Platinum_Nugget.get(), 9)
                .requires(ModItems.Platinum_Ingot.get())
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Glowstone_Nugget.get(), 9)
                .requires(ModItems.Refined_Glowstone_Ingot.get())
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Obsidian_Nugget.get(), 9)
                .requires(ModItems.Refined_Obsidian_Ingot.get())
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Rose_Gold_Nugget.get(), 9)
                .requires(ModItems.Rose_Gold_Ingot.get())
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Signalum_Nugget.get(), 9)
                .requires(ModItems.Signalum_Ingot.get())
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Silver_Nugget.get(), 9)
                .requires(ModItems.Silver_Ingot.get())
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Steel_Nugget.get(), 9)
                .requires(ModItems.Steel_Ingot.get())
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Tin_Nugget.get(), 9)
                .requires(ModItems.Tin_Ingot.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Uranium_Nugget.get(), 9)
                .requires(ModItems.Uranium_Ingot.get())
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zinc_Nugget.get(), 9)
                .requires(ModItems.Zinc_Ingot.get())
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .save(pWriter);

        //PLATES

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Aluminum_Plate.get(), 1)
                .requires(ModItems.Aluminum_Ingot.get(), 2)
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Andesite_Alloy_Plate.get(), 1)
                .requires(ModItems.Andesite_Alloy_Ingot.get(), 2)
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Apatite_Plate.get(), 1)
                .requires(ModItems.Apatite.get(), 2)
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Apatite.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Brass_Plate.get(), 1)
                .requires(ModItems.Brass_Ingot.get(), 2)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Bronze_Plate.get(), 1)
                .requires(ModItems.Bronze_Ingot.get(), 2)
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Constantan_Plate.get(), 1)
                .requires(ModItems.Constantan_Ingot.get(), 2)
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Copper_Plate.get(), 1)
                .requires(Items.COPPER_INGOT, 2)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Cinnabar_Plate.get(), 1)
                .requires(ModItems.Cinnabar.get(), 2)
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Cinnabar.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Diamond_Plate.get(), 1)
                .requires(Items.DIAMOND, 2)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Electrum_Plate.get(), 1)
                .requires(ModItems.Electrum_Ingot.get(), 2)
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Enderium_Plate.get(), 1)
                .requires(ModItems.Enderium_Ingot.get(), 2)
                .unlockedBy("has_enderium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Gold_Plate.get(), 1)
                .requires(Items.GOLD_INGOT, 2)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Graphite_Plate.get(), 1)
                .requires(ModItems.Graphite_Ingot.get(), 2)
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Graphite_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iridium_Plate.get(), 1)
                .requires(ModItems.Iridium_Ingot.get(), 2)
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Plate.get(), 1)
                .requires(Items.IRON_INGOT, 2)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Compressed_Plate.get(), 1)
                .requires(ModItems.Iron_Compressed_Ingot.get(), 2)
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lapis_Lazuli_Plate.get(), 1)
                .requires(Items.LAPIS_LAZULI, 2)
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lead_Plate.get(), 1)
                .requires(ModItems.Lead_Ingot.get(), 2)
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lumium_Plate.get(), 1)
                .requires(ModItems.Lumium_Ingot.get(), 2)
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Netherite_Plate.get(), 1)
                .requires(Items.NETHERITE_INGOT, 2)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Nickel_Plate.get(), 1)
                .requires(ModItems.Nickel_Ingot.get(), 2)
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Osmium_Plate.get(), 1)
                .requires(ModItems.Osmium_Ingot.get(), 2)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Platinum_Plate.get(), 1)
                .requires(ModItems.Platinum_Ingot.get(), 2)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Quartz_Plate.get(), 1)
                .requires(Items.QUARTZ, 2)
                .unlockedBy("has_quartz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.QUARTZ).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Quartz_Enriched_Iron_Plate.get(), 1)
                .requires(ModItems.Quartz_Enriched_Iron_Ingot.get(), 2)
                .unlockedBy("has_quartz_enriched_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Quartz_Enriched_Iron_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Glowstone_Plate.get(), 1)
                .requires(ModItems.Refined_Glowstone_Ingot.get(), 2)
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Obsidian_Plate.get(), 1)
                .requires(ModItems.Refined_Obsidian_Ingot.get(), 2)
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Rose_Gold_Plate.get(), 1)
                .requires(ModItems.Rose_Gold_Ingot.get(), 2)
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Ruby_Plate.get(), 1)
                .requires(ModItems.Ruby.get(), 2)
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Ruby.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Sapphire_Plate.get(), 1)
                .requires(ModItems.Sapphire.get(), 2)
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Sapphire.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Signalum_Plate.get(), 1)
                .requires(ModItems.Signalum_Ingot.get(), 2)
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Silver_Plate.get(), 1)
                .requires(ModItems.Silver_Ingot.get(), 2)
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Steel_Plate.get(), 1)
                .requires(ModItems.Steel_Ingot.get(), 2)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Tin_Plate.get(), 1)
                .requires(ModItems.Tin_Ingot.get(), 2)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Uranium_Plate.get(), 1)
                .requires(ModItems.Uranium_Ingot.get(), 2)
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zinc_Plate.get(), 1)
                .requires(ModItems.Zinc_Ingot.get(), 2)
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        //DUSTS FROM RAW MATERIAL

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Aluminum_Dust.get(), 1)
                .requires(ModItems.Raw_Aluminum.get(), 1)
                .unlockedBy("has_raw_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Aluminum.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "aluminum_dust_from_raw_aluminum");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iridium_Dust.get(), 1)
                .requires(ModItems.Raw_Iridium.get(), 1)
                .unlockedBy("has_raw_iridium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Iridium.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "iridium_dust_from_raw_iridium");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lead_Dust.get(), 1)
                .requires(ModItems.Raw_Lead.get(), 1)
                .unlockedBy("has_raw_lead", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Lead.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "lead_dust_from_raw_lead");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Nickel_Dust.get(), 1)
                .requires(ModItems.Raw_Nickel.get(), 1)
                .unlockedBy("has_raw_nickel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Nickel.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "nickel_dust_from_raw_nickel");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Osmium_Dust.get(), 1)
                .requires(ModItems.Raw_Osmium.get(), 1)
                .unlockedBy("has_raw_osmium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Osmium.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "osmium_dust_from_raw_osmium");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Platinum_Dust.get(), 1)
                .requires(ModItems.Raw_Platinum.get(), 1)
                .unlockedBy("has_raw_platinum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Platinum.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "platinum_dust_from_raw_platinum");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Silver_Dust.get(), 1)
                .requires(ModItems.Raw_Silver.get(), 1)
                .unlockedBy("has_raw_silver", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Silver.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "silver_dust_from_raw_silver");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Tin_Dust.get(), 1)
                .requires(ModItems.Raw_Tin.get(), 1)
                .unlockedBy("has_raw_tin", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Tin.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "tin_dust_from_raw_tin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Uranium_Dust.get(), 1)
                .requires(ModItems.Raw_Uranium.get(), 1)
                .unlockedBy("has_raw_uranium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Uranium.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "uranium_dust_from_raw_uranium");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zinc_Dust.get(), 1)
                .requires(ModItems.Raw_Zinc.get(), 1)
                .unlockedBy("has_raw_zinc", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Raw_Zinc.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter, "zinc_dust_from_raw_zinc");

        //DUST FROM INGOT AND MINECRAFT ITEMS

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Aluminum_Dust.get(), 1)
                .requires(ModItems.Aluminum_Ingot.get(), 1)
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Aluminum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Amethyst_Dust.get(), 1)
                .requires(Items.AMETHYST_SHARD, 1)
                .unlockedBy("has_amethyst_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.AMETHYST_SHARD).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Andesite_Alloy_Dust.get(), 1)
                .requires(ModItems.Andesite_Alloy_Ingot.get(), 1)
                .unlockedBy("has_andesite_alloy_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Andesite_Alloy_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Apatite_Dust.get(), 1)
                .requires(ModItems.Apatite.get(), 1)
                .unlockedBy("has_apatite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Apatite.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Brass_Dust.get(), 1)
                .requires(ModItems.Brass_Ingot.get(), 1)
                .unlockedBy("has_brass_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Brass_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Bronze_Dust.get(), 1)
                .requires(ModItems.Bronze_Ingot.get(), 1)
                .unlockedBy("has_bronze_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Bronze_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Calcite_Dust.get(), 1)
                .requires(Items.CALCITE, 1)
                .unlockedBy("has_calcite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CALCITE).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Charcoal_Dust.get(), 1)
                .requires(Items.CHARCOAL, 1)
                .unlockedBy("has_charcoal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHARCOAL).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Cinnabar_Dust.get(), 1)
                .requires(ModItems.Cinnabar.get(), 1)
                .unlockedBy("has_cinnabar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Cinnabar.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Coal_Dust.get(), 1)
                .requires(Items.COAL, 1)
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COAL).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Constantan_Dust.get(), 1)
                .requires(ModItems.Constantan_Ingot.get(), 1)
                .unlockedBy("has_constantan_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Constantan_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Copper_Dust.get(), 1)
                .requires(Items.COPPER_INGOT, 1)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Crying_Obsidian_Dust.get(), 1)
                .requires(Blocks.CRYING_OBSIDIAN, 1)
                .unlockedBy("has_crying_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.CRYING_OBSIDIAN).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Diamond_Dust.get(), 1)
                .requires(Items.DIAMOND, 1)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Electrum_Dust.get(), 1)
                .requires(ModItems.Electrum_Ingot.get(), 1)
                .unlockedBy("has_electrum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Electrum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Emerald_Dust.get(), 1)
                .requires(Items.EMERALD, 1)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.End_Stone_Dust.get(), 1)
                .requires(Blocks.END_STONE, 1)
                .unlockedBy("has_end_stone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.END_STONE).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Ender_Pearl_Dust.get(), 1)
                .requires(Items.ENDER_PEARL, 1)
                .unlockedBy("has_ender_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ENDER_PEARL).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Enderium_Dust.get(), 1)
                .requires(ModItems.Enderium_Ingot.get(), 1)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enderium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Enriched_Uranium_Dust.get(), 1)
                .requires(ModItems.Enriched_Uranium.get(), 1)
                .unlockedBy("has_enriched_uranium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Enriched_Uranium.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Gold_Dust.get(), 1)
                .requires(Items.GOLD_INGOT, 1)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Graphite_Dust.get(), 1)
                .requires(ModItems.Graphite_Ingot.get(), 1)
                .unlockedBy("has_graphite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Graphite_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Invar_Dust.get(), 1)
                .requires(ModItems.Invar_Ingot.get(), 1)
                .unlockedBy("has_invar_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Invar_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iridium_Dust.get(), 1)
                .requires(ModItems.Iridium_Ingot.get(), 1)
                .unlockedBy("has_iridium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iridium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Compressed_Dust.get(), 1)
                .requires(ModItems.Iron_Compressed_Ingot.get(), 1)
                .unlockedBy("has_iron_compressed_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Iron_Compressed_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Iron_Dust.get(), 1)
                .requires(Items.IRON_INGOT, 1)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lapis_Lazuli_Dust.get(), 1)
                .requires(Items.LAPIS_LAZULI, 1)
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lead_Dust.get(), 1)
                .requires(ModItems.Lead_Ingot.get(), 1)
                .unlockedBy("has_lead_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lead_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Lumium_Dust.get(), 1)
                .requires(ModItems.Lumium_Ingot.get(), 1)
                .unlockedBy("has_lumium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Lumium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Netherack_Dust.get(), 1)
                .requires(Blocks.NETHERRACK, 1)
                .unlockedBy("has_netherrack", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.NETHERRACK).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Netherite_Dust.get(), 1)
                .requires(Items.NETHERITE_INGOT, 1)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Nickel_Dust.get(), 1)
                .requires(ModItems.Nickel_Ingot.get(), 1)
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Nickel_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Obsidian_Dust.get(), 1)
                .requires(Blocks.OBSIDIAN, 1)
                .unlockedBy("has_obsidian", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.OBSIDIAN).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Osmium_Dust.get(), 1)
                .requires(ModItems.Osmium_Ingot.get(), 1)
                .unlockedBy("has_osmium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Osmium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Platinum_Dust.get(), 1)
                .requires(ModItems.Platinum_Ingot.get(), 1)
                .unlockedBy("has_platinum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Platinum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Prismarine_Dust.get(), 1)
                .requires(Blocks.PRISMARINE, 1)
                .unlockedBy("has_prismarine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.PRISMARINE).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Quartz_Dust.get(), 1)
                .requires(Items.QUARTZ, 1)
                .unlockedBy("has_quartz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.QUARTZ).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Quartz_Enriched_Iron_Dust.get(), 1)
                .requires(ModItems.Quartz_Enriched_Iron_Ingot.get(), 1)
                .unlockedBy("has_quartz_enriched_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Quartz_Enriched_Iron_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Glowstone_Dust.get(), 1)
                .requires(ModItems.Refined_Glowstone_Ingot.get(), 1)
                .unlockedBy("has_refined_glowstone_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Glowstone_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Refined_Obsidian_Dust.get(), 1)
                .requires(ModItems.Refined_Obsidian_Ingot.get(), 1)
                .unlockedBy("has_refined_obsidian_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Refined_Obsidian_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Rose_Gold_Dust.get(), 1)
                .requires(ModItems.Rose_Gold_Ingot.get(), 1)
                .unlockedBy("has_rose_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Rose_Gold_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Ruby_Dust.get(), 1)
                .requires(ModItems.Ruby.get(), 1)
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Ruby.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Sapphire_Dust.get(), 1)
                .requires(ModItems.Sapphire.get(), 1)
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Sapphire.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Signalum_Dust.get(), 1)
                .requires(ModItems.Signalum_Ingot.get(), 1)
                .unlockedBy("has_signalum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Signalum_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Silver_Dust.get(), 1)
                .requires(ModItems.Silver_Ingot.get(), 1)
                .unlockedBy("has_silver_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Silver_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Steel_Dust.get(), 1)
                .requires(ModItems.Steel_Ingot.get(), 1)
                .unlockedBy("has_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Steel_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Tin_Dust.get(), 1)
                .requires(ModItems.Tin_Ingot.get(), 1)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Tin_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Uranium_Dust.get(), 1)
                .requires(ModItems.Uranium_Ingot.get(), 1)
                .unlockedBy("has_uranium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Uranium_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Zinc_Dust.get(), 1)
                .requires(ModItems.Zinc_Ingot.get(), 1)
                .unlockedBy("has_zinc_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.Zinc_Ingot.get()).build()))
                .requires(ModTags.Items.HAMMERS)
                .unlockedBy("has_hammers", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.HAMMERS).build()))
                .save(pWriter);

        //RAW THINGS

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Aluminum.get(),RecipeCategory.MISC, ModBlocks.Raw_Aluminum_Block.get(),
                "evolved_resources:raw_aluminum", "aluminum", "evolved_resources:raw_aluminum_block", "aluminum");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Iridium.get(),RecipeCategory.MISC, ModBlocks.Raw_Iridium_Block.get(),
                "evolved_resources:raw_iridium", "iridium", "evolved_resources:raw_iridium_block", "iridium");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Lead.get(),RecipeCategory.MISC, ModBlocks.Raw_Lead_Block.get(),
                "evolved_resources:raw_lead", "lead", "evolved_resources:raw_lead_block", "lead");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Nickel.get(),RecipeCategory.MISC, ModBlocks.Raw_Nickel_Block.get(),
                "evolved_resources:raw_nickel", "nickel", "evolved_resources:raw_nickel_block", "nickel");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Osmium.get(),RecipeCategory.MISC, ModBlocks.Raw_Osmium_Block.get(),
                "evolved_resources:raw_osmium", "osmium", "evolved_resources:raw_osmium_block", "osmium");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Platinum.get(),RecipeCategory.MISC, ModBlocks.Raw_Platinum_Block.get(),
                "evolved_resources:raw_platinum", "platinum", "evolved_resources:raw_platinum_block", "platinum");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Silver.get(),RecipeCategory.MISC, ModBlocks.Raw_Silver_Block.get(),
                "evolved_resources:raw_silver", "silver", "evolved_resources:raw_silver_block", "silver");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Tin.get(),RecipeCategory.MISC, ModBlocks.Raw_Tin_Block.get(),
                "evolved_resources:raw_tin", "tin", "evolved_resources:raw_tin_block", "tin");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Uranium.get(),RecipeCategory.MISC, ModBlocks.Raw_Uranium_Block.get(),
                "evolved_resources:raw_uranium", "uranium", "evolved_resources:raw_uranium_block", "uranium");

        nineBlockStorageRecipes(pWriter,RecipeCategory.MISC, ModItems.Raw_Zinc.get(),RecipeCategory.MISC, ModBlocks.Raw_Zinc_Block.get(),
                "evolved_resources:raw_zinc", "zinc", "evolved_resources:raw_zinc_block", "zinc");

        //SMELTING AND BLASTING ORES

        oreSmelting(pWriter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Aluminum_Ingot.get(), 0.7f, 200, "aluminum");
        oreBlasting(pWriter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Aluminum_Ingot.get(), 0.7f, 100, "aluminum");

        oreSmelting(pWriter, APATITE_SMELTABLES, RecipeCategory.MISC, ModItems.Apatite.get(), 0.7f, 200, "apatite");
        oreBlasting(pWriter, APATITE_SMELTABLES, RecipeCategory.MISC, ModItems.Apatite.get(), 0.7f, 100, "apatite");

        oreSmelting(pWriter, CINNABAR_SMELTABLES, RecipeCategory.MISC, ModItems.Cinnabar.get(), 0.7f, 200, "cinnabar");
        oreBlasting(pWriter, CINNABAR_SMELTABLES, RecipeCategory.MISC, ModItems.Cinnabar.get(), 0.7f, 100, "cinnabar");

        oreSmelting(pWriter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Iridium_Ingot.get(), 0.7f, 200, "iridium");
        oreBlasting(pWriter, IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Iridium_Ingot.get(), 0.7f, 100, "iridium");

        oreSmelting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.Lead_Ingot.get(), 0.7f, 200, "lead");
        oreBlasting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.Lead_Ingot.get(), 0.7f, 100, "lead");

        oreSmelting(pWriter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.Nickel_Ingot.get(), 0.7f, 200, "nickel");
        oreBlasting(pWriter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.Nickel_Ingot.get(), 0.7f, 100, "nickel");

        oreSmelting(pWriter, OSMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Osmium_Ingot.get(), 0.7f, 200, "osmium");
        oreBlasting(pWriter, OSMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Osmium_Ingot.get(), 0.7f, 100, "osmium");

        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Platinum_Ingot.get(), 0.7f, 200, "platinum");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Platinum_Ingot.get(), 0.7f, 100, "platinum");

        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby.get(), 0.7f, 200, "ruby");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby.get(), 0.7f, 100, "ruby");

        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Sapphire.get(), 0.7f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Sapphire.get(), 0.7f, 100, "sapphire");

        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.Silver_Ingot.get(), 0.7f, 200, "silver");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.Silver_Ingot.get(), 0.7f, 100, "silver");

        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.Tin_Ingot.get(), 0.7f, 200, "tin");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.Tin_Ingot.get(), 0.7f, 100, "tin");

        oreSmelting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Uranium_Ingot.get(), 0.7f, 200, "uranium");
        oreBlasting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Uranium_Ingot.get(), 0.7f, 100, "uranium");

        oreSmelting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.Zinc_Ingot.get(), 0.7f, 200, "zinc");
        oreBlasting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.Zinc_Ingot.get(), 0.7f, 100, "zinc");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                     float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemLike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime,
                    pSerializer).group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(pFinishedRecipeConsumer, Evolved_Resources.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemLike));
        }
    }
}
