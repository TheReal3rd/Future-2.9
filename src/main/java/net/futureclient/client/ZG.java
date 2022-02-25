package net.futureclient.client;

public enum ZG {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZG() {
        ZG zG;
    }
}
package net.futureclient.client;

import baritone.api.BaritoneAPI;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.event.events.ChatEvent;
import java.util.StringJoiner;
import net.futureclient.client.GA;

public final class zg
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    @Override
    public String f$E(String[] chatEvent) {
        int n;
        StringJoiner stringJoiner = new StringJoiner(" ");
        int n2 = ((String[])chatEvent).length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string = chatEvent[n];
            stringJoiner.add(string);
            n3 = ++n;
        }
        chatEvent = new ChatEvent(new StringBuilder().insert(0, IBaritoneChatControl.FORCE_COMMAND_PREFIX).append(stringJoiner.toString()).toString());
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onSendChatMessage(chatEvent);
        if (!chatEvent.isCancelled()) {
            return "Unable to redirect to Baritone!";
        }
        return "";
    }

    public zg() {
        zg zg2;
        String[] stringArray = new String[3];
        stringArray[0] = "BaritoneControl";
        stringArray[1] = "BC";
        stringArray[2] = "B";
        super(stringArray);
    }
}
