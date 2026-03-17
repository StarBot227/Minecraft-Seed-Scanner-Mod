package com.starbot.oracle;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import java.util.ArrayList;
import java.util.List;

public class OracleEngine {
    private final long seed = -7024425759600359010L;
    private final List<BlockPos> activeTargets = new ArrayList<>();

    public void update(Vec3d playerPos) {
        activeTargets.removeIf(target -> {
            // Tightened radius: Must be within 1.0 block distance squared
            double distSq = target.getSquaredDistance(playerPos.x, playerPos.y, playerPos.z);
            if (distSq <= 1.0) {
                MinedRegistry.markAsMined(target);
                return true;
            }
            return false;
        });
    }

    public List<BlockPos> getActiveTargets() {
        return activeTargets;
    }
}
