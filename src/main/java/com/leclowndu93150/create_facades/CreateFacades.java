package com.leclowndu93150.create_facades;

import com.portingdeadmods.cable_facades.api.CableFacadesAPI;
import net.minecraftforge.fml.common.Mod;

@Mod(CreateFacades.MODID)
public class CreateFacades {
    public static final String MODID = "create_facades";

    public CreateFacades() {
        CableFacadesAPI.enqueueAPICallback(
                api -> {
                    api.registerAllowedBlocks("create*");
                }
        );
    }

}
