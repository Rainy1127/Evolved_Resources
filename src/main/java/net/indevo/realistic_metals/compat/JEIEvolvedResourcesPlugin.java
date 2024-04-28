package net.indevo.realistic_metals.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.indevo.realistic_metals.Realistic_Metals;
import net.minecraft.resources.ResourceLocation;
@JeiPlugin
public class JEIEvolvedResourcesPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Realistic_Metals.MOD_ID, "jei_plugin");
    }
}
