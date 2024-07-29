package me.agwoo.cowCannon;

import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class EntityListener implements Listener {

    @EventHandler
    public void onEntityRightClick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();

        if (event.getHand() != EquipmentSlot.HAND) {
            return;
        }

        if (entity instanceof Cow cow && entity.hasMetadata("CowCannon") && player.getInventory().getItemInMainHand().getType() == Material.BUCKET) {
            cow.getWorld().createExplosion(cow.getLocation(), 2.5F);
        }
    }
}
