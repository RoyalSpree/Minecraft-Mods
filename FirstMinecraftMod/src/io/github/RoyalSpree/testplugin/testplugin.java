package io.github.RoyalSpree.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class testplugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("onEnable() has been invoked!");
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable() has been invoked!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
	}
}
