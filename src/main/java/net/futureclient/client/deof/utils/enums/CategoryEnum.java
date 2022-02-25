package net.futureclient.client.deof.utils.enums;

public enum CategoryEnum {
    COMBAT("Combat"),
    EXPLOITS("Exploits"),
    MISC("Miscellaneous"),
    MOVEMENT("Movement"),
    RENDER("Render"),
    WORLD("World");

    private String name;

    CategoryEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/*
public enum JD {
    f$I("Combat"),
    f$K("Exploits"),
    f$b("Miscellaneous"),
    f$j("Movement"),
    f$i("Render"),
    f$M("World");

    private String f$g;


     * WARNING - Possible parameter corruption
     * WARNING - void declaration

private JD(String string) {
    JD jD;
    jD.f$g = 0;
}

    public String f$E() {
        JD jD;
        return jD.f$g;
    }
}
 */
