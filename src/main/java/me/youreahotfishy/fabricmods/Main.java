package me.youreahotfishy.fabricmods;

import me.youreahotfishy.fabricmods.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

    public static final String MOD_ID = "moremunchies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModItems.registerModItems();
    }
}