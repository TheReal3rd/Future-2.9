package net.futureclient.client;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.KeyStore;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import net.futureclient.client.FH;
import net.futureclient.client.cH;

public enum zi {
    f$i;

    private static final Path f$g;
    private static final Path f$M;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zi() {
        zi zi2;
    }

    public FH f$E() throws Exception {
        zi zi2;
        return new FH(zi2.f$E(f$M, "6dHE4YP6oqBGsiBrcJ4H0lCJIL39sZvVqe0sTWUwEr1zENh29D0VR2C7jBmB", "niZommG1XsGcm2wrzn1lZ958AsMFAdfp3NVYDJCuG3unpunI5DvqZkFCGW5L"), zi2.f$E(f$g, "Gu9OUix0MRAcDwyp6zEqOveJwWPBEL0al6bf6MMtTfSfb5PH1lXRT6bwKcbN", "y5TFr5XULaDljxo19RmccrGQ6JSxpMgJeNcsSw9Q0nIvw0SBa0vJUYgDkl6P"));
    }

    static {
        f$M = cH.f$E().resolve("auth_username_key");
        f$g = cH.f$E().resolve("auth_password_key");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String f$E(Path path, String object32, String object22) throws Exception {
        Object object32;
        InputStream inputStream;
        block10: {
            inputStream = Files.newInputStream(path, new OpenOption[0]);
            Throwable throwable = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("JCEKS");
                keyStore.load(null, ((String)object22).toCharArray());
                KeyStore.PasswordProtection passwordProtection = new KeyStore.PasswordProtection(((String)object22).toCharArray());
                keyStore.load(inputStream, ((String)object22).toCharArray());
                object22 = SecretKeyFactory.getInstance("PBE");
                object32 = (KeyStore.SecretKeyEntry)keyStore.getEntry((String)object32, passwordProtection);
                object32 = (PBEKeySpec)((SecretKeyFactory)object22).getKeySpec(((KeyStore.SecretKeyEntry)object32).getSecretKey(), PBEKeySpec.class);
                object32 = new String(((PBEKeySpec)object32).getPassword());
                if (inputStream == null) return object32;
                if (throwable == null) break block10;
            }
            catch (Throwable throwable2) {
                try {
                    throwable = throwable2;
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    Throwable throwable4;
                    if (inputStream != null) {
                        if (throwable != null) {
                            try {
                                inputStream.close();
                                throwable4 = throwable3;
                                throw throwable4;
                            }
                            catch (Throwable object32) {
                                throwable4 = throwable3;
                                throwable.addSuppressed(object32);
                                throw throwable4;
                            }
                        }
                        inputStream.close();
                    }
                    throwable4 = throwable3;
                    throw throwable4;
                }
            }
            try {
                inputStream.close();
                return object32;
            }
            catch (Throwable object22) {
                throwable.addSuppressed(object22);
                return object32;
            }
        }
        inputStream.close();
        return object32;
    }

    public boolean f$E() {
        return Files.exists(f$M, new LinkOption[0]) && Files.exists(f$g, new LinkOption[0]);
    }
}
package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;

public class zI
extends GA {
    public zI() {
        zI zI2;
        String[] stringArray = new String[2];
        stringArray[0] = "Toggle";
        stringArray[1] = "t";
        super(stringArray);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String f$E(String[] 0) {
        block8: {
            block10: {
                block9: {
                    if (0.length < 1) break block8;
                    var2_2 = 0[0];
                    var3_3 = kH.f$E().f$E().f$E(var2_2);
                    if (var3_3 == null) {
                        var4_4 = new StringJoiner(", ");
                        var5_6 = kH.f$E().f$E().f$E().iterator();
                        while (var5_6.hasNext()) {
                            var6_7 = var5_6.next().f$E();
                            var7_8 = var6_7.length;
                            v0 = var8_9 = 0;
                            while (v0 < var7_8) {
                                var9_10 = var6_7[var8_9];
                                if (var9_10.contains(var2_2)) {
                                    var4_4.add(String.format("&e%s&7", new Object[]{var9_10}));
                                }
                                v0 = ++var8_9;
                            }
                        }
                        if (var4_4.length() < 1) {
                            return "That module does not exist.";
                        }
                        return String.format("Did you mean: %s?", new Object[]{var4_4.toString()});
                    }
                    if (!(var3_3 instanceof J)) {
                        return "That module is not toggleable.";
                    }
                    var4_5 = (Ba)var3_3;
                    if (0.length < 2) break block9;
                    if (0[1].toLowerCase().contains("activ")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("on")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("enable")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("true")) lbl-1000:
                    // 4 sources

                    {
                        v1 = true;
                    } else {
                        v1 = false;
                    }
                    var4_5.f$E(v1);
                    break block10;
                }
                var4_5.f$E();
            }
            v2 = new Object[2];
            v2[0] = var4_5.f$E()[0];
            v2[1] = var4_5.f$E() ? "&aon" : "&coff";
            return String.format("%s toggled %s&7.", v2);
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[module] [state]";
    }
}
