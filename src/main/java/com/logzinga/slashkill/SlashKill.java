package com.logzinga.slashkill;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.EventListener;
import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public final class SlashKill extends JavaPlugin implements EventListener {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /kill - kills the player

        if (command.getName().equalsIgnoreCase("kill")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.setHealth(0);
                p.sendMessage("you just killed yourself...");

            }else if(sender instanceof ConsoleCommandSender){
                System.out.println("im not too sure if the console can kill itself, try /stop");
            }else if(sender instanceof BlockCommandSender){
                System.out.println("bruh command blocks cant kys");
            }

        }

        return true;
    }
}
