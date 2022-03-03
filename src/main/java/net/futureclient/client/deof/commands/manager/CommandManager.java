package net.futureclient.client.deof.commands.manager;

import net.futureclient.client.*;
import net.futureclient.client.deof.commands.commands.BreedCMD;
import net.futureclient.client.deof.commands.commands.ConnectCMD;
import net.futureclient.client.deof.utils.ObjectList;

import java.util.ArrayList;
import java.util.Comparator;

public class CommandManager extends ObjectList<CommandBase> {
    private String prefix;// OG f$d

    public static String setPrefix(CommandManager aG, String string) {
        aG.prefix = string;
        return aG.prefix;
    }

    public static String getPrefix(CommandManager aG) {
        return aG.prefix;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public CommandManager() {
        this.prefix = ".";
        this.list = new ArrayList<CommandBase>();
        //Reg START
        this.add(new BreedCMD());
        this.add(new ConnectCMD());
        //Reg END
        this.list.sort(Comparator.comparing(gA -> gA.getArgs()[0]));
        kH.f$E().f$E().f$a(new Ai(aG));
        new Vi(aG, "command_prefix.txt");
    }

    public void setPrefix(String string) {
        this.prefix = string;
    }

}
/*
public class AG extends QE<GA> {
    private String f$d;

    public static String f$E(AG aG, String string) {
        aG.f$d = string;
        return aG.f$d;
    }

    public static String f$E(AG aG) {
        return aG.f$d;
    }

    public String f$E() {
        AG aG;
        return aG.f$d;
    }

    public AG() {
        AG aG;
        AG aG2 = aG;
        aG.f$d = ".";
        aG2.f$d = new ArrayList();
        aG.f$a(new zI());//Done
        aG2.f$a(new bG());
        aG2.f$a(new lh());
        aG2.f$a(new Qi());
        aG2.f$a(new DH());
        aG2.f$a(new RH());
        aG2.f$a(new eh());
        aG2.f$a(new Xg());
        aG2.f$a(new fi());
        aG2.f$a(new EG());
        aG2.f$a(new hG());
        aG2.f$a(new mD());
        aG2.f$a(new di());
        aG2.f$a(new SG());
        aG2.f$a(new XG());
        aG2.f$a(new Hh());
        aG2.f$a(new GG());
        aG2.f$a(new ti());
        aG2.f$a(new uH());
        aG2.f$a(new wh());
        aG2.f$a(new JE());
        aG2.f$a(new Ej());
        aG2.f$a(new yG());
        aG2.f$a(new AF());
        aG2.f$a(new Xf());
        aG2.f$a(new kI());
        aG2.f$a(new Eh());
        aG2.f$a(new vI());
        aG2.f$a(new Ui());
        aG2.f$a(new TG());
        aG2.f$a(new fH());
        aG2.f$a(new sH());
        aG2.f$a(new Th());
        aG2.f$a(new sI());
        aG2.f$a(new ih());
        aG2.f$a(new NG());
        aG2.f$a(new yi());
        aG2.f$a(new YG());
        aG2.f$d.sort(Comparator.comparing(gA -> gA.f$E()[0]));
        kH.f$E().f$E().f$a(new Ai(aG));
        new Vi(aG, "command_prefix.txt");
    }

    @Override
    public void f$E(String string) {
        0.f$d = string;
    }
}
 */