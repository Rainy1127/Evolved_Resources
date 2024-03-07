package net.indevo.evolved_resources;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

public final class Config {
    public static final String CATEGORY_ORES = "ores";

    public static final ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_ORE;
    public static final ForgeConfigSpec.BooleanValue DISABLE_CUSTOM_ORE;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Ore Generation Settings").push(CATEGORY_ORES);

        ENABLE_CUSTOM_ORE = builder
                .comment("Enable generation of custom ore")
                .define("enableCustomOre1", true);
        DISABLE_CUSTOM_ORE = builder
                .comment("Disable generation of custom ore")
                .define("enableCustomOre1", true);

        builder.pop();

        // Здесь вы можете добавить определения для других кастомных руд

        ForgeConfigSpec spec = builder.build();
    }
}
