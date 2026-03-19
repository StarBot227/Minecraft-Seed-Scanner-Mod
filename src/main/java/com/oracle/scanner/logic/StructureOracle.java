package com.oracle.scanner.logic;

import java.util.Random;
import net.minecraft.util.math.BlockPos;

public class StructureOracle {
    private final long worldSeed = -7024425759600359010L;

    public BlockPos predictStronghold(int x, int z) {
        Random random = new Random(worldSeed ^ ((long) x * 341873128712L) ^ ((long) z * 132897987541L));
        if (random.nextFloat() < 0.01) {
            return new BlockPos(x * 16 + 8, 32, z * 16 + 8);
        }
        return null;
    }
}
