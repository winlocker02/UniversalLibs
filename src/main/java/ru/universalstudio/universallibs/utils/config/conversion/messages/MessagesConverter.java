package ru.universalstudio.universallibs.utils.config.conversion.messages;

import lombok.*;
import ru.universalstudio.universallibs.utils.config.conversion.*;
import ru.universalstudio.universallibs.utils.config.data.*;
import ru.universalstudio.universallibs.utils.messages.*;

public class MessagesConverter implements TypeConverter<Messages> {

    public static MessagesConverter create() {
        return new MessagesConverter();
    }

    @Override
    public Messages loadFrom(DataHolder section, String path, Messages currentValue) {
        if(section instanceof ConfigurationSectionDataHolder) {
            val configuration = ((ConfigurationSectionDataHolder) section).getSection().getConfigurationSection(path);

            return Messages.create(configuration);
        }
        return null;
    }

    @Override
    public void saveTo(Messages messages, DataHolder section, String path) {}
}
