package io.github.toydotgame.Gamemode;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	@Override
	public void onEnable() {
		this.getCommand("gmc").setExecutor(new GMC());
		this.getCommand("gms").setExecutor(new GMS());
		System.out.print("[GM] Plugin loaded successfully!");
	}
}
