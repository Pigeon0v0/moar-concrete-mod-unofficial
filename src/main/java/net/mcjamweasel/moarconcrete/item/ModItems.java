package net.mcjamweasel.moarconcrete.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Properties()));

    private static void addItemsToIngredientItemGroup(FabricCreativeModeTabOutput entries){
        entries.accept(RUBY);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoarConcrete.LOGGER.info("Registering mod items for " + MoarConcrete.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
