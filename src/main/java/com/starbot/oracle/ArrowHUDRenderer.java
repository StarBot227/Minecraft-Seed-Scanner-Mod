package com.starbot.oracle;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;

public class ArrowHUDRenderer {
    public static void render(MatrixStack matrices, TextRenderer textRenderer, float angle, double distance) {
        String arrow = getArrowChar(angle);
        String text = String.format("%s %.1fm", arrow, distance);
        int color = 0x00FFFF; // Diamond Cyan
        textRenderer.draw(matrices, text, 10, 10, color);
    }

    private static String getArrowChar(float angle) {
        if (angle > -22.5 && angle <= 22.5) return "↑";
        if (angle > 22.5 && angle <= 67.5) return "↗";
        if (angle > 67.5 && angle <= 112.5) return "→";
        if (angle > 112.5 && angle <= 157.5) return "↘";
        if (angle > 157.5 || angle <= -157.5) return "↓";
        if (angle > -157.5 && angle <= -112.5) return "↙";
        if (angle > -112.5 && angle <= -67.5) return "←";
        return "↖";
    }
}
