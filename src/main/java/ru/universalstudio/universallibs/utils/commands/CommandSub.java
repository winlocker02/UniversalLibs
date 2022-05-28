package ru.universalstudio.universallibs.utils.commands;

import org.bukkit.command.*;
import ru.universalstudio.universallibs.utils.messages.*;

import java.util.*;

public interface CommandSub {

    boolean execute(Messages messages, CommandSender sender, String[] args);
    List<String> tab(Messages messages, CommandSender sender, String[] args);
}
