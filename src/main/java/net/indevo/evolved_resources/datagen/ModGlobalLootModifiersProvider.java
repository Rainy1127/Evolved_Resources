package net.indevo.evolved_resources.datagen;

import net.indevo.evolved_resources.Evolved_Resources;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Evolved_Resources.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
