package net.badbird5907.anticombatlog.commands;

import net.badbird5907.anticombatlog.AntiCombatLog;
import net.badbird5907.anticombatlog.utils.CC;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.UUID;

public class AntiCombatLogCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(CC.AQUA + "Anti-Combat-Log V." + AntiCombatLog.getInstance().getDescription().getVersion());
        sender.sendMessage(CC.AQUA + "By Badbird5907");
        System.out.println(Arrays.toString(AntiCombatLog.getToKillOnLogin().keySet().toArray(new UUID[0])));
        return true;
    }
}