package me.Gezelligheid.Startup

import me.Gezelligheid.Startup.Command.Command2
import me.Gezelligheid.Startup.Command.TestCommand
import me.Gezelligheid.Startup.Events.Event
import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.plugin.java.JavaPlugin

 class Main : JavaPlugin(), CommandExecutor {
     companion object {
         var instance: Main? = null
             private set;
     }
    override fun onEnable() {

        getCommand("test")?.setExecutor(TestCommand)
        Bukkit.getPluginManager().registerEvents(Event, this)
        getCommand("command2")?.setExecutor(Command2())

        Bukkit.getConsoleSender().sendMessage("boe")
        instance = this;
    }


}