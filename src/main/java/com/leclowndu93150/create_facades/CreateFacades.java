package com.leclowndu93150.create_facades;

import com.portingdeadmods.cable_facades.api.CableFacadesAPI;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CreateFacades.MODID)
public class CreateFacades {
    public static final String MODID = "create_facades";

    public CreateFacades(IEventBus modEventBus, ModContainer modContainer) {
        CableFacadesAPI.enqueueAPICallback(
                api -> {
                    api.registerAllowedBlocks("create*");
                }
        );
    }

}
