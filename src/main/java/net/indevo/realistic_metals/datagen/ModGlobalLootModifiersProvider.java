package net.indevo.realistic_metals.datagen;

import net.indevo.realistic_metals.Realistic_Metals;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Realistic_Metals.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
