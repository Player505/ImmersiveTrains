package imancus.immersivetrains;

import imancus.immersivetrains.lib.Misc;
import imancus.immersivetrains.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Misc.MOD_ID, name = Misc.MOD_NAME, version = Misc.VERSION, acceptedMinecraftVersions = Misc.ACCEPTED_VERSIONS, dependencies = Misc.DEPENDENCIES)
public class ImmersiveTrains {

	@Instance(Misc.MOD_ID)
	public static ImmersiveTrains instance;

	@SidedProxy(clientSide = Misc.CLIENT_PROXY_CLASS, serverSide = Misc.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);
	}
}
