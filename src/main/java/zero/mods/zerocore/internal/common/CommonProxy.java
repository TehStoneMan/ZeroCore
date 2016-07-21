package zero.mods.zerocore.internal.common;

import net.minecraftforge.common.MinecraftForge;
import zero.mods.zerocore.api.multiblock.IMultiblockRegistry;

public class CommonProxy {

    public IMultiblockRegistry initMultiblockRegistry() {

        if (null == s_multiblockHandler)
            MinecraftForge.EVENT_BUS.register(s_multiblockHandler = new MultiblockEventHandler());

        return MultiblockRegistry.INSTANCE;
    }

    private static MultiblockEventHandler s_multiblockHandler = null;
}