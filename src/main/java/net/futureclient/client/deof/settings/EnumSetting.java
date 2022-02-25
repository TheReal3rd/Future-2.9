package net.futureclient.client.deof.settings;

public class EnumSetting<T extends Enum<?>> extends SettingsBase<T> {

    public EnumSetting(T t, String ... stringArray) {
        super(t, stringArray);
    }

    //From what i gather from this it increments through the enum selection.
    public void increment() {
        T[] t = this.getEnums();
        int n = this.getValue().ordinal();
        if (++n > (t).length - 1) n = 0;
        this.setValue(t[n]);
    }

    //Returns the array of the enum selection.
    public T[] getEnums() {
        return (T[]) ((Enum)this.getValue()).getClass().getEnumConstants();
    }

    //Seems this back steps through the enum list.
    public void deduct() {
        T[] t = this.getEnums();
        int n = this.getValue().ordinal();
        if (--n < 0) n = (t).length - 1;
        this.setValue(t[n]);
    }

    //Searches and sets value as enum that meets the search term.
    public void search(String string) {
        int n;
        T[] t = this.getEnums();
        int n2 = t.length;
        int n3 = n = 0;
        while (n3 < n2) {
            T t2 = t[n];
            if (((Enum)t2).name().equalsIgnoreCase(string)) {
                this.setValue(t2);
                return;
            }
            n3 = ++n;
        }
    }

    //Returns selected enum value as a string with upper case first letter.
    public String toString() {
        return ((Enum)this.getValue()).name().charAt(0) + ((Enum)this.getValue()).name().toLowerCase().replaceFirst(Character.toString(((Enum)this.getValue()).name().charAt(0)).toLowerCase(), "");
    }
}

/*
public class ka<T extends Enum<?>> extends z<T> {
    public ka(T t, String ... stringArray) {
        super(t, stringArray);
    }

    public void f$a() {
        ka ka2;
        ka ka3 = ka2;
        Object t = ka3.f$E();
        int n = ((Enum)ka3.f$E()).ordinal();
        if (++n > ((T)t).length - 1) {
            n = 0;
        }
        ka2.f$E(t[n]);
    }

    @Override
    public T[] f$E() {
        ka ka2;
        return (Enum[])((Enum)ka2.f$E()).getClass().getEnumConstants();
    }

    @Override
    public void f$E() {
        ka ka2;
        ka ka3 = ka2;
        Object t = ka3.f$E();
        int n = ((Enum)ka3.f$E()).ordinal();
        if (--n < 0) {
            n = ((T)t).length - 1;
        }
        ka2.f$E(t[n]);
    }

    @Override
    public void f$E(String string) {
        int n;
        Object t = 0.f$E();
        int n2 = ((T)t).length;
        int n3 = n = 0;
        while (n3 < n2) {
            Object t2 = t[n];
            if (((Enum)t2).name().equalsIgnoreCase(string)) {
                0.f$E(t2);
                return;
            }
            n3 = ++n;
        }
    }

    @Override
    public String f$E() {
        ka ka2;
        return ((Enum)ka2.f$d).name().charAt(0) + ((Enum)ka2.f$d).name().toLowerCase().replaceFirst(Character.toString(((Enum)ka2.f$d).name().charAt(0)).toLowerCase(), "");
    }
}
 */