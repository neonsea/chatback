package ee.nns.chatback

import org.bukkit.plugin.java.JavaPlugin


class ChatBack : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        this.server.pluginManager.registerEvents(PlayerChatListener(), this)
        this.server.pluginManager.registerEvents(PlayerJoinQuitListener(), this)
    }
}