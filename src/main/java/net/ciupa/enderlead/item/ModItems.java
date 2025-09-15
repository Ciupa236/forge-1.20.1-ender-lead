package net.ciupa.enderlead.item;

import net.ciupa.enderlead.EnderLead;
import net.ciupa.enderlead.item.custom.EnderLeadItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnderLead.MOD_ID);

    public static final RegistryObject<Item> ENDER_LEAD = ITEMS.register("ender_lead",
            () -> new EnderLeadItem());
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
