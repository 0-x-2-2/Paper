package org.bukkit.fillr;

import org.bukkit.*;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;
import org.bukkit.event.*;

import java.io.File;

public class Fillr extends JavaPlugin {
    private FillrListener listener;
    public static String name = "Fillr";
    public static String version = "1.0";
    public static String directory = "plugins";

    public Fillr(PluginLoader pluginLoader, Server instance, PluginDescriptionFile desc, File plugin, ClassLoader cLoader) {
        super(pluginLoader, instance, desc, plugin, cLoader);
        registerEvents();
    }

    public void onDisable() {}
    public void onEnable() {}

    private void registerEvents() {
        listener = new FillrListener(getServer());
        getServer().getPluginManager().registerEvent(Event.Type.PLAYER_COMMAND, listener, Event.Priority.Normal, this);
    }
}
