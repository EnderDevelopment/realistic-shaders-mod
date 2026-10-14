package com.britiz5141j.realisticshadersmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealisticShadersMod implements ModInitializer {
    public static final String MOD_ID = "realisticshadersmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Realistic Shaders Mod");
        // Initialize shaders and other mod components
    }
}