package me.agwoo.cowCannon;

import org.bukkit.entity.Cow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class EntityListener implements Listener {

    @EventHandler
    public void onEntityRightClick(PlayerInteractEntityEvent event) {
        System.out.println("Right clicked: " + event.getRightClicked().getClass());

        if (event.getRightClicked() instanceof Cow cow) {
            cow.getWorld().createExplosion(cow.getLocation(), 2.5F);
        }
    }
}
