package com.starbot.oracle;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class DynamicArrowMath {
    public static float getAngle(Vec3d playerPos, float playerYaw, BlockPos target) {
        double dx = target.getX() + 0.5 - playerPos.x;
        double dz = target.getZ() + 0.5 - playerPos.z;
        float angle = (float) (MathHelper.atan2(dz, dx) * (180 / Math.PI)) - 90.0f;
        return MathHelper.wrapDegrees(angle - playerYaw);
    }
}
