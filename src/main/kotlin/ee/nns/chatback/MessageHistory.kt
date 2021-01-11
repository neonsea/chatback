package ee.nns.chatback

import org.bukkit.event.player.AsyncPlayerChatEvent
import java.util.concurrent.ConcurrentLinkedQueue


class MessageHistory {
    val messages: ConcurrentLinkedQueue<String?> = ConcurrentLinkedQueue<String?>()
    fun add(message: String?) {
        while (messages.size > 50) {
            messages.remove()
        }

        messages.add(message)
    }
}

val messageHistory: MessageHistory = MessageHistory()