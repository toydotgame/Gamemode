package io.github.toydotgame.Gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMC implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {		
		if(sender instanceof Player) {
			if(sender.hasPermission("gm.use")) {
				if(args.length == 0) {
					Player player = (Player) sender;
					player.setGameMode(GameMode.CREATIVE);
					sender.sendMessage("Set your game mode to gamemode CREATIVE.");
					return true;
				} else {
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					return false;
				}
			} else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to use this command!");
				return true;
			}
		} else {
			System.out.print("[GM] Only players are able to change their gamemodes!");
			return true;
		}
	}
}
