/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.votiverp.core;

import com.votiverp.core.logging.Logger;
import com.votiverp.core.logging.handlers.JULHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class VotiveAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger.init(new JULHandler(getLogger()));
        Logger.info("VotiveAPI loading...");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Logger.info("VotiveAPI disabled");
        super.onDisable();
    }
}
