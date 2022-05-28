package ru.universalstudio.universallibs.utils.inventory.aggregates;

import lombok.*;
import org.bukkit.entity.*;
import ru.universalstudio.universallibs.utils.inventory.*;
import ru.universalstudio.universallibs.utils.inventory.holder.*;

public interface Aggregate {

    void init(@NonNull Player player, @NonNull GuiContents contents, @NonNull GuiInventory inventory, @NonNull GuiHolder holder);
}
