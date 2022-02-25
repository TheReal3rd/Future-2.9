package net.futureclient.client.deof.settings.listSetting;

import net.minecraft.block.Block;

import java.util.List;

public final class BlockList extends ListSetting<Block> {
    public BlockList(List<Block> list, String ... stringArray) {
        super(list, stringArray);
    }

    public BlockList(String ... stringArray) {
        super(stringArray);
    }
}
/*
public final class U extends O<Block> {
    public U(List<Block> list, String ... stringArray) {
        super(list, stringArray, (Ja)null);
    }

    public U(String ... stringArray) {
        super(stringArray, (Ja)null);
    }
}
 */