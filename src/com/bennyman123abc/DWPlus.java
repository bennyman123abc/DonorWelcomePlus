package com.bennyman123abc;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class DWPlus extends JavaPlugin implements Listener{
	
	public Permission donor = new Permission("dwp.donor");
	public Permission staff = new Permission("dwp.staff");
	public Permission owner = new Permission("dwp.owner");
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getLogger().info("DonorWelcomePlus is Working Correctly");
		getServer().getPluginManager().addPermission(donor);
		getServer().getPluginManager().addPermission(staff);
		getServer().getPluginManager().addPermission(owner);
	}
	
	@EventHandler
	public void donorJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(player.hasPermission(donor)) {
			getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Welcome Back Donor " + player.getCustomName() + " !");
		}
		
		else if(player.hasPermission(staff)) {
			getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Welcome Back Staff " + player.getCustomName() + " !");
		}
		
		else if(player.hasPermission(owner)) {
			getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Welcome Back Owner " + player.getCustomName() + " !");
		}
		
	}
	
	

}
