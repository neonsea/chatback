package ee.nns.chatback

import org.bukkit.ChatColor.ITALIC
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent


class PlayerJoinQuitListener : Listener {
    @EventHandler(priority = EventPriority.LOWEST) fun onPlayerJoin(event: PlayerJoinEvent) {
        for (message in MessageHistory.messages) {
                event.player.sendMessage(ITALIC.toString() + message)
        }
        
        MessageHistory.add(event.joinMessage)
    }
    
    @EventHandler(priority = EventPriority.LOWEST) fun onPlayerQuit(event: PlayerQuitEvent) {
        MessageHistory.add(event.quitMessage)
    }
}
