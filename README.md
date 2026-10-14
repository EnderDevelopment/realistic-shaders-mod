# Realistic Shaders Mod

Ultra-realistic shaders for Minecraft with dynamic grass, realistic fire, and more.

## Features

- Dynamic grass and plant movement
- Realistic fire effects with brightness
- Improved sky and cloud rendering
- Shiny metal reflections
- Wind-affected visual elements

## Requirements

- Minecraft 1.21.4
- Fabric Loader 0.15.11 or later
- Fabric API

## Installation

1. Download the latest release from the [Releases](https://github.com/EnderDevelopment/realistic-shaders-mod/releases) page.
2. Place the JAR file in your `mods` folder.
3. Launch Minecraft with the Fabric profile.

## Usage

Once installed, the shaders will automatically apply to your game. No additional configuration is required for basic usage.

## Configuration

The mod includes a JSON configuration file at `assets/realisticshadersmod/shaders/realistic_shaders.json` where you can adjust shader settings:

```json
{
  "shaders": {
    "grass": {
      "sway": true,
      "wind_affected": true
    },
    "plants": {
      "movement": true,
      "wind_affected": true
    },
    "sky": {
      "realistic": true,
      "clouds": true
    },
    "fire": {
      "realistic": true,
      "brightness": true
    },
    "metal": {
      "shiny": true,
      "sunlight_reflection": true
    }
  }
}
```

---

## Generated with EnderDevelopment

This mod was generated in minutes with [EnderDevelopment](https://enderdevelopment.com) — the AI platform that turns your ideas into working Minecraft plugins, Discord bots and FiveM scripts.

**Want your own?** [Generate this project on EnderDevelopment](https://dash.enderdevelopment.com?utm_source=github&utm_medium=readme&utm_campaign=realistic-shaders-mod&utm_content=bottom) — describe it in one sentence and get the full source code.