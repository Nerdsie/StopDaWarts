package me.NerdsWBNerds.StopDaWarts;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import org.bukkit.plugin.java.JavaPlugin;

public class StopDaWarts extends JavaPlugin implements Listener{
	public ArrayList<Integer> softBlocks = new ArrayList<Integer>();
	
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
	
	}

	@EventHandler
	public void wartGrow(BlockGrowEvent e){
		if(e.getBlock().getType() == Material.NETHER_WARTS){
			e.setCancelled(true);
		}
	}
}
