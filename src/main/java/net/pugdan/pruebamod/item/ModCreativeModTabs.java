package net.pugdan.pruebamod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pugdan.pruebamod.ModEjemplo;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB,ModEjemplo.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRUEBA_TAB = CREATIVE_MODE_TABS.register("prueba_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORINDON.get()))
                    .title(Component.translatable("creative.prueba_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CORINDON.get());
                        pOutput.accept(Items.IRON_INGOT);

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
