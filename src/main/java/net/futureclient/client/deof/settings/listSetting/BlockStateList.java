package net.futureclient.client.deof.settings.listSetting;

import net.minecraft.block.state.IBlockState;

import java.util.List;

public final class BlockStateList extends ListSetting<IBlockState> {
    public BlockStateList(String ... stringArray) {
        super(stringArray);
    }

    public BlockStateList(List<IBlockState> list, String ... stringArray) {
        super(list, stringArray);
    }
}
/*
public final class ha
extends O<IBlockState> {
    public ha(String ... stringArray) {
        super(stringArray, (Ja)null);
    }

    public ha(List<IBlockState> list, String ... stringArray) {
        super(list, stringArray, (Ja)null);
    }
}
 */