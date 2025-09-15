package net.ciupa.enderlead.item;

import net.ciupa.enderlead.EnderLead;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnderLead.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENDER_LEAD_TAB = CREATIVE_MODE_TABS.register("ender_lead_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDER_LEAD.get()))
                    .title(Component.translatable("creativetab.ender_lead_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ENDER_LEAD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
