package ee.nns.chatback

import java.util.concurrent.ConcurrentLinkedQueue


object MessageHistory {
    val messages: ConcurrentLinkedQueue<String?> = ConcurrentLinkedQueue<String?>()
    fun add(message: String?) {
        while (messages.size > 50) {
            messages.remove()
        }

        messages.add(message)
    }
}
