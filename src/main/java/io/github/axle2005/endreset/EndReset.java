package io.github.axle2005.endreset;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EndReset extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onLoad() {
		
		
		String path = Bukkit.getWorldContainer().toString()+File.separator+"world_the_end"+File.separator+"DIM1"+File.separator+"region";

		File location = new File(path);

		if (location.isDirectory()) {
			String[] entries = location.list();
			for (String s : entries) {
				File currentFile = new File(location.getPath(), s);
				log.info(s);
				currentFile.delete();

			}

		}
	}
}
