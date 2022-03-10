package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import net.futureclient.client.BG;
import net.futureclient.client.Ib;
import net.futureclient.client.RA;

public class Ec
extends Ib {
    public final RA f$d;

    @Override
    public void f$a(Object ... objectArray) {
        block5: {
            try {
                if (!BG.f$E().isEmpty()) {
                    if (!BG.f$E().equals("trnsl.1.1.20170518T111332Z.58a1bdbd6f594a69.53b43d8829fb0d32cc1b8fa36cef007dac7717c4")) break block5;
                }
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        if (!0.f$E().exists()) {
            0.f$E().createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
        bufferedWriter.write(BG.f$E());
        bufferedWriter.close();
    }

    @Override
    public void f$E(Object ... objectArray) {
        block4: {
            if (0.f$E().exists()) break block4;
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            String string = bufferedReader.readLine();
            if (string != null) {
                BG.f$a(string);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Ec(RA rA, String string) {
        0.f$d = rA;
        super(string);
    }
}
