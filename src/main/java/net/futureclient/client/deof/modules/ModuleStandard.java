package net.futureclient.client.deof.modules;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.unknown.HF_Unknown_Listener;
import net.futureclient.client.deof.unknown.fE_Unknown_Listener;
import net.futureclient.client.deof.unknown.if_Unknown;
import net.futureclient.client.deof.unknown.ig_Unknown;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.futureclient.client.deof.utils.logger.FutureLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModuleStandard extends ModuleBase implements IModuleStandard {
    private final fE_Unknown_Listener f$g = new fE_Unknown_Listener(this);//Unknown Event Prob they calc the width and height of the GUI;//Listener //OG f$g
    private boolean enabled;//OG f$j
    public float f$b;//OG f$b // WTF does this do?
    //private CategoryEnum category;//Category // OG f$i
    private final HF_Unknown_Listener f$d = new HF_Unknown_Listener(this);//Another listener //OG f$d  //Unknown Event
    private boolean visibility;//OG f$i visibility
    private int colour;//OG f$M
    private final List<Listener<?>> listenerList;//Listener list //OG f$K

    public void setVisibility(boolean bl) {
        this.visibility = bl;
    }

    public boolean isVisibility() {
        return this.visibility;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void toggle() {
        this.setEnabled(!this.enabled);
    }

    public int getColour() {
        return this.colour;
    }

    public ModuleStandard(String name, String[] searchTerms, boolean visibility, int n, CategoryEnum category) {
        super(name, searchTerms);
        this.listenerList = new ArrayList<>();
        this.colour = n;
        this.category = category;
        this.visibility = visibility;
        if (name.equalsIgnoreCase("ClickGui")) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.getTerms()[0].toLowerCase().replace(" ", "");
            kH.f$E().f$E().f$E(new ig_Unknown(String.format("%sToggle", objectArray), new if_Unknown(this), 54));
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = this.getTerms()[0].toLowerCase().replace(" ", "");
        kH.f$E().f$E().f$E(new ig_Unknown(String.format("%sToggle", objectArray), new if_Unknown(this), 0));
    }

    public void subListeners() {
        this.listenerList.forEach(ha -> kH.f$E().f$E().f$a((Listener)ha));
        if (this.getClass().isAnnotationPresent(AModule.class)) {//This annotation is probably a plugin system within future? possible evidence: https://github.com/nerdsinspace/nocom-chatschizophreniagaslight/blob/master/src/main/java/com/nhackindustries/ChatSchizophreniaGaslightPlugin.java
            AModule q = this.getClass().getAnnotation(AModule.class);
            FutureLogger.getInstance().log(String.format("&cNOTE: &7%s", q.f$E()));
        }
        kH.f$E().f$E().f$a(this.f$g);
    }

    public void addListeners(Listener<?> ... haArray) {
        Collections.addAll(this.listenerList, haArray);
    }

    @Override
    public CategoryEnum getCategory() {
        return this.category;
    }

    public static boolean isEnabled(ModuleStandard ba) {
        return ba.enabled;
    }

    public void unSubListeners() {
        this.listenerList.forEach(ha -> kH.f$E().f$E().f$E((Listener)ha));
        kH.f$E().f$E().f$a(this.f$d);
    }

    @Override
    public void setEnabled(boolean bl) {
        this.enabled = bl;
        if (this.enabled) {
            this.subListeners();
            return;
        }
        this.unSubListeners();
    }

    public void setColour(int n) {
        this.colour = n;
    }
}
/*
public class Ba
extends ma
implements J {
    private final Ha f$g;
    private boolean f$j;
    public float f$b;
    private JD f$i;
    private final Ha f$d;
    private boolean f$i;
    private int f$M;
    private List<Ha> f$K;

    public void f$a(boolean bl) {
        0.f$i = bl;
    }

    public boolean f$a() {
        Ba ba;
        return ba.f$i;
    }

    @Override
    public boolean f$E() {
        Ba ba;
        return ba.f$j;
    }

    @Override
    public void f$E() {
        Ba ba;
        Ba ba2 = ba;
        ba2.f$E(!ba2.f$j);
    }

    public int f$E() {
        Ba ba;
        return ba.f$M;
    }

    public Ba(String string, String[] stringArray, boolean bl, int n, JD jD) {
        Ba ba = 0;
        super(string, stringArray);
        Ba ba2 = 0;
        0.f$K = new ArrayList<Ha>();
        0.f$M = n;
        ba.f$i = jD;
        ba.f$i = bl;
        ba.f$g = new fE(0);
        0.f$d = new HF(0);
        if (string.equalsIgnoreCase("ClickGui")) {
            Object[] objectArray = new Object[1];
            objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
            kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 54));
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
        kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 0));
    }

    public void f$K() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$a((Ha)ha));
        if (ba.getClass().isAnnotationPresent(Q.class)) {
            Q q = ba.getClass().getAnnotation(Q.class);
            La.f$E().f$E(String.format("&cNOTE: &7%s", q.f$E()));
        }
        kH.f$E().f$E().f$a(ba.f$g);
    }

    public void f$E(Ha ... haArray) {
        Collections.addAll(0.f$K, haArray);
    }

    @Override
    public JD f$E() {
        Ba ba;
        return ba.f$i;
    }

    public static boolean f$E(Ba ba) {
        return ba.f$j;
    }

    public void f$B() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$E((Ha)ha));
        kH.f$E().f$E().f$a(ba.f$d);
    }

    @Override
    public void f$E(boolean bl) {
        0.f$j = bl;
        if (0.f$j) {
            0.f$K();
            return;
        }
        0.f$B();
    }

    public void f$E(int n) {
        0.f$M = n;
    }
}
 */