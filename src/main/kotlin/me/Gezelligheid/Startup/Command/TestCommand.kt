package me.Gezelligheid.Startup.Command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object TestCommand : CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(command.name.equals("test")){

            (sender as? Player)?.sendMessage("hoi")

        }


        return true;


    }

}