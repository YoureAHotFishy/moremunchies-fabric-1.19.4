package me.youreahotfishy.fabricmods.item;

import me.youreahotfishy.fabricmods.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //  GROUP STUFF
    public static void additemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, PIE_CRUST);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    //  FOOD
    public static final Item PIE_CRUST = registerItem("pie_crust", new Item(new FabricItemSettings()));


    //  REGISTRY STUFF
    public static void registerModItems() {
        Main.LOGGER.info("Registering Mod Items for" + Main.MOD_ID);

        additemsToItemGroup();
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, name), item);

    }

}
