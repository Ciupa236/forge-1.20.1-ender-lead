package net.ciupa.enderlead.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

public class ModTags {
    public static class Entities {
        public static final TagKey<EntityType<?>> BLACKLIST = create("blacklist");

        private static TagKey<EntityType<?>> create(String name) {
            return TagKey.create(
                    Registries.ENTITY_TYPE,
                    ResourceLocation.fromNamespaceAndPath("enderlead", name));
        }
    }
}
