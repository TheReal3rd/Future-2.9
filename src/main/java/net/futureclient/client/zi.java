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