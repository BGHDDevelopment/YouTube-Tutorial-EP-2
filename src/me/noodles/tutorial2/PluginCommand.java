package me.noodles.tutorial2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class PluginCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { 
		Player player = (Player) sender;
		player.sendMessage(ChatColor.AQUA + "Hi YouTube its BGHDDevelopment!");
		player.sendMessage(ChatColor.RED + "Hi YouTube its BGHDDevelopmentX2!");
		return true;
	}
}
