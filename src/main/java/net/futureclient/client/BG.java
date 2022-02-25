package net.futureclient.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import net.futureclient.client.La;
import net.futureclient.client.RA;
import net.futureclient.client.V;
import net.futureclient.client.kH;
import net.futureclient.client.u;
import net.futureclient.client.x;

public abstract class BG {
    private static String f$i;
    public static final String f$g = "&lang=";
    public static final String f$d = "&text=";
    public static final String f$M = "key=";
    public static String f$j;
    public static final String f$b = "UTF-8";

    public BG() {
        BG bG;
    }

    public static String f$a(URL uRL, String string) throws Exception {
        return ((u)V.f$a(BG.f$E(uRL))).get((Object)string).toString();
    }

    public static String f$E(URL uRL, String stringArray) throws Exception {
        int n;
        stringArray = BG.f$E(((x)((u)V.f$a(BG.f$E(uRL))).get((Object)((String)stringArray))).f$E(), null);
        String string = "";
        int n2 = stringArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string2 = stringArray[n];
            string = new StringBuilder().insert(0, string).append(string2).toString();
            n3 = ++n;
        }
        return string.trim();
    }

    public static String f$E() {
        return f$j;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 4 << 3 ^ 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static String[] f$E(String string, String string2) throws Exception {
        Object object = (x)V.f$a(string);
        String[] stringArray = new String[object.size()];
        int n = 0;
        object = object.iterator();
        Iterator iterator = object;
        while (iterator.hasNext()) {
            Object e = object.next();
            if (string2 != null && string2.length() != 0) {
                u u2 = (u)e;
                if (u2.containsKey((Object)string2)) {
                    stringArray[n] = u2.get((Object)string2).toString();
                }
            } else {
                stringArray[n] = e.toString();
            }
            ++n;
            iterator = object;
        }
        return stringArray;
    }

    private static String f$E(URL uRL) throws Exception {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRL.openConnection();
        if (f$i != null) {
            httpsURLConnection.setRequestProperty("referer", f$i);
        }
        HttpsURLConnection httpsURLConnection2 = httpsURLConnection;
        httpsURLConnection2.setRequestProperty("Content-Type", "text/plain; charset=UTF-8");
        httpsURLConnection2.setRequestProperty("Accept-Charset", f$b);
        httpsURLConnection.setRequestMethod("GET");
        try {
            HttpsURLConnection httpsURLConnection3 = httpsURLConnection;
            int n = httpsURLConnection3.getResponseCode();
            String string = BG.f$E(httpsURLConnection3.getInputStream());
            if (n != 200) {
                throw new Exception(new StringBuilder().insert(0, "Error from Yandex API: ").append(string).toString());
            }
            String string2 = string;
            return string2;
        }
        catch (Exception exception) {
            RA rA = (RA)kH.f$E().f$E().f$E(RA.class);
            if (rA != null && rA.f$E()) {
                rA.f$E(false);
            }
            La.f$E().f$E("Disabled Translate due to an error.");
            throw new Exception(new StringBuilder().insert(0, "Error from Yandex API: ").append(exception.getMessage()).toString());
        }
        finally {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
        }
    }

    public static void f$E() throws Exception {
        if (f$j == null || f$j.length() < 27) {
            throw new RuntimeException("INVALID_API_KEY - Please set the API Key with your Yandex API Key");
        }
    }

    private static String f$E(InputStream inputStream) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (inputStream != null) {
                String string;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f$b));
                while (null != (string = bufferedReader.readLine())) {
                    stringBuilder.append(string.replaceAll("\ufeff", ""));
                }
            }
        }
        catch (Exception exception) {
            throw new Exception("[yandex-translator-api] Error reading translation stream.", exception);
        }
        return stringBuilder.toString();
    }

    public static void f$a(String string) {
        f$j = string;
    }

    public static void f$E(String string) {
        f$i = string;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class bg
extends RF {
    private boolean f$d;

    public bg(boolean bl) {
        0.f$d = bl;
    }

    public boolean f$a() {
        bg bg2;
        return bg2.f$d;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;
import net.futureclient.client.lg;
import net.futureclient.client.ma;
import org.lwjgl.input.Keyboard;

public class bG
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 3) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            String string3 = stringArray[2].toUpperCase();
            int n = string3.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string3);
            if (string.equalsIgnoreCase("module")) {
                ma ma2 = kH.f$E().f$E().f$E(string2);
                if (ma2 == null) {
                    return "That module does not exist.";
                }
                if (!(ma2 instanceof J)) {
                    return "That module is not toggleable.";
                }
                Ba ba = (Ba)ma2;
                kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
                return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
            }
            if (string.equalsIgnoreCase("macro")) {
                if (kH.f$E().f$E().f$E(n)) {
                    kH.f$E().f$E().f$E(n);
                    return String.format("Removed macro with the keybind %s.", Keyboard.getKeyName((int)n));
                }
                kH.f$E().f$E().f$a(new lg(n, string2));
                return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)n));
            }
            return "Invalid action. Correct actions: Module | Macro.";
        }
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string4 = stringArray[1].toUpperCase();
            ma ma3 = kH.f$E().f$E().f$E(string);
            if (ma3 == null) {
                return "That module does not exist.";
            }
            if (!(ma3 instanceof J)) {
                return "That module is not toggleable.";
            }
            Ba ba = (Ba)ma3;
            int n = string4.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string4);
            kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
            return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
        }
        return 0.f$E();
    }

    public bG() {
        bG bG2;
        String[] stringArray = new String[3];
        stringArray[0] = "Keybind";
        stringArray[1] = "Bind";
        stringArray[2] = "kb";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[module|macro] [module|command] [key] &7| &e[module] [key]";
    }
}
