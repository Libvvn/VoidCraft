import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public boolean onCommand(Command sender, Command command, String label, String[] args) {
			if(label.equalsIgnoreCase("potato")){
				if(sender instanceof Player){
					Player player = (Player) sender;
					player.getInventory().addItem(new ItemStack(Material.POTATO));
					player.sendMessage("" + ChatColor.YELLOW + "Here have A...");
					player.sendMessage("§e§lPotato!");
				} else {
					sender.setUsage("You dont have permission to run this command");
				}
			}
			return true;
	}
	Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		
		logger.info("Hope you enjoyed this, see ya next time!");
	}

}
