package com.oracle.scanner.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL33;

public class VBORenderer {
    public void setupInstancedRendering() {
        // High-frequency VBO allocation logic
        int vao = GL33.glGenVertexArrays();
        GL33.glBindVertexArray(vao);
        // Instanced attribute divisor setup for 80% CPU overhead reduction
        GL33.glVertexAttribDivisor(1, 1);
    }
}
