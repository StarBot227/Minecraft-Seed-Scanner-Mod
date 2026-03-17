package com.starbot.oracle;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftOracle implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraft-oracle");
    private static long worldSeed = 0;

    @Override
    public void onInitialize() {
        LOGGER.info("Oracle Awakened. Awaiting World Seed.");
    }

    public static void setSeed(long seed) {
        worldSeed = seed;
        LOGGER.info("Seed synchronized: " + seed);
    }
}
