package net.ciupa.enderlead;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = EnderLead.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> ENTITY_STRINGS = BUILDER
            .comment("A list of entities that are blacklisted from being captured with the Ender Lead")
            .defineListAllowEmpty("blacklisted_entities", List.of("minecraft:wither", "minecraft:ender_dragon"), Config::validateEntityName);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    private static boolean validateEntityName(final Object obj) {
        return obj instanceof String entityName && ForgeRegistries.ENTITY_TYPES.containsKey(new ResourceLocation(entityName));
    }
}
