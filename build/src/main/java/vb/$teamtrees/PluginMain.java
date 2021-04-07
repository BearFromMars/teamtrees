package vb.$teamtrees;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.plugin.java.*;
import org.bukkit.util.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;
	private static Object localVariableScope = new Object();

	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		Object localVariableScope = new Object();
	}

	public void onDisable() {
	}

	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("teamtreesjungle")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Entity) commandSender).getLocation().getWorld().generateTree(
						((org.bukkit.entity.Entity) commandSender).getLocation(), org.bukkit.TreeType.JUNGLE);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
						"tellraw @a [\"\",{\"text\":\"[TEAMTREES] \",\"color\":\"dark_red\"},{\"text\":\">> \",\"bold\":true,\"color\":\"gray\"},{\"text\":\"A \"},{\"text\":\"[JUNGLE]\",\"bold\":true,\"color\":\"gray\"},{\"text\":\" tree was just spawned in.\"}]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("teamtreesredwood")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Entity) commandSender).getLocation().getWorld().generateTree(
						((org.bukkit.entity.Entity) commandSender).getLocation(), org.bukkit.TreeType.REDWOOD);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
						"tellraw @a [\"\",{\"text\":\"[TEAMTREES] \",\"color\":\"dark_red\"},{\"text\":\">> \",\"bold\":true,\"color\":\"gray\"},{\"text\":\"A \"},{\"text\":\"[REDWOOD]\",\"bold\":true,\"color\":\"gray\"},{\"text\":\" tree was just spawned in.\"}]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("teamtreesdarkoak")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Entity) commandSender).getLocation().getWorld().generateTree(
						((org.bukkit.entity.Entity) commandSender).getLocation(), org.bukkit.TreeType.DARK_OAK);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
						"tellraw @a [\"\",{\"text\":\"[TEAMTREES] \",\"color\":\"dark_red\"},{\"text\":\">> \",\"bold\":true,\"color\":\"gray\"},{\"text\":\"A \"},{\"text\":\"[DARKOAK]\",\"bold\":true,\"color\":\"gray\"},{\"text\":\" tree was just spawned in.\"}]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (command.getName().equalsIgnoreCase("teamtreesoak")) {
			try {
				Object localVariableScope = new Object();
				((org.bukkit.entity.Entity) commandSender).getLocation().getWorld().generateTree(
						((org.bukkit.entity.Entity) commandSender).getLocation(), org.bukkit.TreeType.TREE);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
						"tellraw @a [\"\",{\"text\":\"[TEAMTREES] \",\"color\":\"dark_red\"},{\"text\":\">> \",\"bold\":true,\"color\":\"gray\"},{\"text\":\"An \"},{\"text\":\"[OAK]\",\"bold\":true,\"color\":\"gray\"},{\"text\":\" tree was just spawned in.\"}]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public static void procedure(String procedure, List<?> procedureArgs) throws Exception {
	}

	public static Object function(String function, List<?> functionArgs) throws Exception {
		return null;
	}

	public static List<Object> createList(Object obj) {
		List<Object> list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static String color(String string) {
		return string != null ? ChatColor.translateAlternateColorCodes('&', string) : null;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}
}
