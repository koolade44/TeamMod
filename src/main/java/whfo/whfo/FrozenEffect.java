package whfo.whfo;

import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Mod.EventBusSubscriber
public class FrozenEffect {

    public static List<UUID> idList = new ArrayList<>();

    @SubscribeEvent
    public static void EntityAttack(final AttackEntityEvent event) {
        if (event.getEntity() instanceof LivingEntity) {
            LivingEntity attacker = (LivingEntity) event.getEntity();
            if (idList.contains(attacker.getUniqueID())) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void BowShot(final ArrowLooseEvent event) {
        if (event.getEntity() instanceof LivingEntity) {
            LivingEntity shooter = (LivingEntity) event.getEntity();
            if (idList.contains(shooter.getUniqueID())) {
                event.setCanceled(true);
            }
        }
    }
}
