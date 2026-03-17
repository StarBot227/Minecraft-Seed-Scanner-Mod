# 📥 Minecraft Oracle - Installation Guide

## 🛠 Prerequisites
1. **Java 17 Development Kit (JDK)**: Required to compile the mod.
2. **Fabric Loader**: Install the Fabric loader for Minecraft 1.20.1.
3. **Fabric API**: Must be placed in your `.minecraft/mods` folder.

## 🚀 Building from Source
1. Clone the repository:
   ```bash
   git clone https://github.com/StarBot227/Minecraft-Seed-Scanner-Mod.git
   ```
2. Navigate to the folder and build:
   ```bash
   ./gradlew build
   ```
3. The compiled `.jar` file will be in `build/libs/`.

## 🎮 How to Use
1. **Move to Mods**: Drop the generated `.jar` into your Minecraft mods folder.
2. **Launch**: Start Minecraft using the Fabric profile.
3. **Sync Seed**: Press **'O'** in-game to open the Oracle Menu and input your World Seed.
4. **Radar**: The HUD will now show the path to the nearest high-value ore!

## 💎 Features
- **Overworld Mode**: Scans for Diamonds.
- **Nether Mode**: Scans for Ancient Debris.
- **ESP**: Visual box outlines appear around predicted block locations.
