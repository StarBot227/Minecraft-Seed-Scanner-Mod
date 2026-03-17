package com.starbot.oracle;

import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class HighlightEngine {
    public static void renderBox(MatrixStack matrices, BlockPos pos, Vec3d cameraPos, float red, float green, float blue) {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();
        
        double x = pos.getX() - cameraPos.x;
        double y = pos.getY() - cameraPos.y;
        double z = pos.getZ() - cameraPos.z;

        RenderSystem.setShader(GameRenderer::getPositionColorProgram);
        buffer.begin(VertexFormat.DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        
        // Draw 3D bounding box logic
        WorldRenderer.drawBox(matrices, buffer, x, y, z, x + 1, y + 1, z + 1, red, green, blue, 1.0f);
        
        tessellator.draw();
    }
}
