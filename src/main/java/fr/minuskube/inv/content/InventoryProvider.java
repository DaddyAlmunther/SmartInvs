package fr.minuskube.inv.content;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.inventory.ItemStack;

public interface InventoryProvider {

    void init(Player player, InventoryContents contents);
    default void update(Player player, InventoryContents contents) {}
    void onClick(Player player, ItemStack itemStack, InventoryAction action, int slot);

}
