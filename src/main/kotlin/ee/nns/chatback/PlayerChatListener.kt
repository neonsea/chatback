package ee.nns.chatback

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent


class PlayerChatListener : Listener {
    @EventHandler(priority = EventPriority.LOWEST) fun onPlayerChat(event: AsyncPlayerChatEvent) {
        if (!event.isCancelled) {
            messageHistory.add(String.format(event.format, event.player.displayName, event.message))
        }
    }
}
