package com.oracle.scanner.logic;

import java.util.Random;
import net.minecraft.util.math.BlockPos;

public class DeepSeedResolver {
    private final long worldSeed = -7024425759600359010L;

    public boolean isVillageAt(int chunkX, int chunkZ) {
        Random random = new Random((long)chunkX * 341873128712L + (long)chunkZ * 132897987541L ^ worldSeed);
        return random.nextFloat() < 0.02;
    }
}
