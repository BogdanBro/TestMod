package net.pugdan.pruebamod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pugdan.pruebamod.ModEjemplo;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModEjemplo.MOD_ID);

    public static void register(IEventBus eventBus){

        Items.register(eventBus);

    }
}
