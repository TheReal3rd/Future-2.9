package net.futureclient.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import net.futureclient.client.Dh;
import net.futureclient.client.FH;
import net.futureclient.client.Oh;
import net.futureclient.client.cH;

public enum qg {
    f$g;


    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FH f$E() throws Exception {
        FH fH;
        DataInputStream dataInputStream;
        block10: {
            byte[] byArray = Dh.f$g.f$E("428A487E3361EF9C5FC20233485EA236");
            dataInputStream = new DataInputStream(Files.newInputStream(cH.f$a(), new OpenOption[0]));
            Throwable throwable = null;
            try {
                qg qg2;
                byte[] byArray2 = qg2.f$E(dataInputStream);
                byte[] byArray3 = Oh.f$g.f$E(qg2.f$E(dataInputStream), byArray, byArray2);
                byte[] byArray4 = Oh.f$g.f$E(qg2.f$E(dataInputStream), byArray, byArray2);
                fH = new FH(new String(byArray3, StandardCharsets.UTF_8), new String(byArray4, StandardCharsets.UTF_8));
                if (dataInputStream == null) return fH;
                if (throwable == null) break block10;
            }
            catch (Throwable throwable2) {
                try {
                    throwable = throwable2;
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    Throwable throwable4;
                    if (dataInputStream != null) {
                        if (throwable != null) {
                            try {
                                dataInputStream.close();
                                throwable4 = throwable3;
                                throw throwable4;
                            }
                            catch (Throwable throwable5) {
                                throwable4 = throwable3;
                                throwable.addSuppressed(throwable5);
                                throw throwable4;
                            }
                        }
                        dataInputStream.close();
                    }
                    throwable4 = throwable3;
                    throw throwable4;
                }
            }
            try {
                dataInputStream.close();
                return fH;
            }
            catch (Throwable throwable6) {
                throwable.addSuppressed(throwable6);
                return fH;
            }
        }
        dataInputStream.close();
        return fH;
    }

    private byte[] f$E(DataInputStream dataInputStream) throws IOException {
        DataInputStream dataInputStream2 = dataInputStream;
        byte[] byArray = new byte[dataInputStream2.readInt()];
        dataInputStream2.read(byArray);
        return byArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qg() {
        qg qg2;
    }
}
