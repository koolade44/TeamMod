package whfo.whfo.spartanweaponryintegration;

import net.minecraftforge.fml.ModList;
import whfo.whfo.Whfo;

public class SWIntegrationMain {

    public static void init() {
        if (ModList.get().isLoaded("spartanweaponry")) {
            SWIRegistryHandler.init();
            Whfo.getLOGGER().info("Spartan Weaponry is loaded. Addon initializing...");
        }
        else Whfo.getLOGGER().info("Spartan Weaponry not found. Skipping...");
    }
}
