package net.futureclient.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class iG {
    public iG() {
        iG iG2;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 3 << 3 ^ 1;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    public static void f$E(File file, File file2) {
        Object object;
        ZipEntry zipEntry;
        ZipInputStream zipInputStream;
        byte[] byArray = new byte[1024];
        try {
            ZipEntry zipEntry2;
            if (!file2.exists()) {
                file2.mkdir();
            }
            zipInputStream = new ZipInputStream(new FileInputStream(file));
            zipEntry = zipEntry2 = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                int n;
                object = zipEntry2.getName();
                object = new File(file2, (String)object);
                new File(((File)object).getParent()).mkdirs();
                object = new FileOutputStream((File)object);
                ZipInputStream zipInputStream2 = zipInputStream;
                while ((n = zipInputStream2.read(byArray)) > 0) {
                    zipInputStream2 = zipInputStream;
                    ((FileOutputStream)object).write(byArray, 0, n);
                }
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        {
            ((FileOutputStream)object).close();
            zipEntry = zipInputStream.getNextEntry();
            continue;
        }
        ZipInputStream zipInputStream3 = zipInputStream;
        zipInputStream3.closeEntry();
        zipInputStream3.close();
    }
}
