package net.futureclient.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class HI {
    private static String f$d;

    private static String f$B() {
        block6: {
            int n;
            block5: {
                if (!f$d.contains("WIN")) break block5;
                Process process = Runtime.getRuntime().exec("wmic baseboard get product,Manufacturer,version,serialnumber");
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.nextLine();
                scanner.nextLine();
                Scanner scanner2 = scanner;
                String string = scanner2.nextLine();
                scanner2.close();
                return string;
            }
            if (!f$d.contains("MAC")) break block6;
            Process process = Runtime.getRuntime().exec("system_profiler SPHardwareDataType");
            process.getOutputStream().close();
            Scanner scanner = new Scanner(process.getInputStream());
            int n2 = n = 1;
            while (n2 <= 16) {
                scanner.nextLine();
                n2 = ++n;
            }
            try {
                Scanner scanner3 = scanner;
                String string = scanner3.nextLine();
                scanner3.close();
                return string;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return "Error";
    }

    private static String f$K() {
        block6: {
            int n;
            block5: {
                if (!f$d.contains("WIN")) break block5;
                Process process = Runtime.getRuntime().exec("wmic path Win32_VideoController get Description,PNPDeviceID");
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.nextLine();
                scanner.nextLine();
                Scanner scanner2 = scanner;
                String string = scanner2.nextLine();
                scanner2.close();
                return string;
            }
            if (!f$d.contains("MAC")) break block6;
            Process process = Runtime.getRuntime().exec("system_profiler SPDisplaysDataType");
            process.getOutputStream().close();
            Scanner scanner = new Scanner(process.getInputStream());
            int n2 = n = 1;
            while (n2 <= 4) {
                scanner.nextLine();
                n2 = ++n;
            }
            try {
                Scanner scanner3 = scanner;
                String string = scanner3.nextLine();
                scanner3.close();
                return string;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return "Error";
    }

    public HI() {
        HI hI;
    }

    static {
        f$d = System.getProperty("os.name").toUpperCase();
    }

    public static String f$A() {
        boolean bl;
        String[] stringArray = new String[7];
        stringArray[0] = System.getenv("PROCESSOR_IDENTIFIER");
        stringArray[1] = System.getenv("NUMBER_OF_PROCESSORS");
        stringArray[2] = HI.f$B();
        stringArray[3] = HI.f$K();
        stringArray[4] = HI.f$e();
        stringArray[5] = HI.f$E();
        stringArray[6] = HI.f$a();
        String[] stringArray2 = stringArray;
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray3 = stringArray2;
        int n = stringArray2.length;
        boolean bl2 = bl = false;
        int n2 = n;
        return stringBuilder.toString();
    }

    private static String f$a() {
        block7: {
            String string;
            if (!f$d.contains("WIN")) break block7;
            String[] stringArray = new String[4];
            stringArray[0] = "wmic";
            stringArray[1] = "memorychip";
            stringArray[2] = "get";
            stringArray[3] = "serialnumber";
            Process process = Runtime.getRuntime().exec(stringArray);
            process.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            BufferedReader bufferedReader2 = bufferedReader;
            while ((string = bufferedReader2.readLine()) != null) {
                bufferedReader2 = bufferedReader;
                stringBuilder.append(string);
            }
            StringBuilder stringBuilder2 = stringBuilder;
            return stringBuilder2.substring(stringBuilder2.toString().lastIndexOf("r") + 1).trim();
        }
        try {
            if (f$d.contains("MAC")) {
                int n;
                Process process = Runtime.getRuntime().exec("system_profiler SPMemoryDataType");
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                int n2 = n = 1;
                while (n2 <= 9) {
                    scanner.nextLine();
                    n2 = ++n;
                }
                Scanner scanner2 = scanner;
                String string = scanner2.nextLine();
                scanner2.close();
                return string;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "Error";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String f$E() {
        try {
            if (f$d.contains("WIN")) {
                String[] stringArray;
                Process process = Runtime.getRuntime().exec("wmic volume get driveletter,serialnumber");
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.nextLine();
                HashMap<String, String> hashMap = new HashMap<String, String>();
                while (scanner.hasNext()) {
                    stringArray = scanner.nextLine().replaceAll(" ", "").split(":");
                    if (stringArray.length != 2) continue;
                    hashMap.put(stringArray[0].toLowerCase(), stringArray[1]);
                }
                scanner.close();
                stringArray = (String[])hashMap.get("c");
                if (stringArray != null) {
                    return stringArray;
                }
                return "";
            }
            if (f$d.contains("MAC")) {
                int n;
                Process process = Runtime.getRuntime().exec("system_profiler SPSerialATADataType");
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                int n2 = n = 1;
                while (true) {
                    if (n2 > 16) {
                        Scanner scanner2 = scanner;
                        String string = scanner2.nextLine();
                        scanner2.close();
                        return string;
                    }
                    scanner.nextLine();
                    n2 = ++n;
                }
            }
            if (!f$d.contains("LINUX")) return "Error";
            String string = "/sbin/udevadm info --query=property --name=sda";
            String[] stringArray = new String[3];
            stringArray[0] = "/bin/sh";
            stringArray[1] = "-c";
            stringArray[2] = string;
            Object object = stringArray;
            Object object2 = Runtime.getRuntime().exec((String[])object);
            ((Process)object2).waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Process)object2).getInputStream()));
            object2 = new StringBuilder();
            block6: while (true) {
                BufferedReader bufferedReader2 = bufferedReader;
                while ((object = bufferedReader2.readLine()) != null) {
                    if (!((String)object).contains("ID_SERIAL_SHORT")) continue block6;
                    bufferedReader2 = bufferedReader;
                    ((StringBuilder)object2).append((String)object);
                }
                return ((StringBuilder)object2).toString().substring(((StringBuilder)object2).toString().indexOf("=") + 1);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "Error";
    }

    private static String f$e() {
        try {
            if (f$d.contains("WIN")) {
                String[] stringArray = new String[4];
                stringArray[0] = "wmic";
                stringArray[1] = "csproduct";
                stringArray[2] = "get";
                stringArray[3] = "uuid";
                Process process = Runtime.getRuntime().exec(stringArray);
                process.getOutputStream().close();
                Object object = new Scanner(process.getInputStream());
                ((Scanner)object).nextLine();
                ((Scanner)object).nextLine();
                Scanner scanner = object;
                object = scanner.nextLine();
                scanner.close();
                return object;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return "Error";
    }
}
package net.futureclient.client;

public class hi {
    public hi() {
        hi hi2;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n5 = 5 << 4 ^ 2 << 1;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}
package net.futureclient.client;

import java.util.Map;

public class hI<K, V> {
    public Map<K, V> f$d;

    public hI() {
        hI hI2;
    }

    public Map<K, V> f$E() {
        hI hI2;
        return hI2.f$d;
    }

    public void f$E(K k) {
        0.f$d.remove(k);
    }

    public void f$E(K k, V v) {
        0.f$d.put(k, v);
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
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
}
