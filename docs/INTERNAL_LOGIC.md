# Minecraft Oracle - Master Technical Spec

## Logic: Seed-Based Chunk Intersection
The scanner operates on the `FeaturePlacement` intercept logic. By knowing the `ChunkRandom` seed sequence, we can reverse-engineer where the 'Diamond Provider' successfully places a vein without ever 'seeing' the block via the server.

## Rendering: Matrix4f Projection
The ESP uses a custom `WorldRenderer` hook to draw bounding boxes directly into the global render buffer, bypassing occlusion culling.
