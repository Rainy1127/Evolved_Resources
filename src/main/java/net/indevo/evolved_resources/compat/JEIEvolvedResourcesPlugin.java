package net.indevo.evolved_resources.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.indevo.evolved_resources.Evolved_Resources;
import net.minecraft.resources.ResourceLocation;
@JeiPlugin
public class JEIEvolvedResourcesPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Evolved_Resources.MOD_ID, "jei_plugin");
    }
}
