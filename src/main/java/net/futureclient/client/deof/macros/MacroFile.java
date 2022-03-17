package net.futureclient.client.deof.macros;

import net.futureclient.client.deof.utils.file.FileObject;
import org.lwjgl.input.Keyboard;

import java.io.*;

public class MacroFile extends FileObject {
    public final MacroManager f$d;

    public MacroFile(MacroManager lf2, String string) {
        super(string);
        this.f$d = lf2;
    }

    @Override
    public void load(Object ... objectArray) {
        this.f$d.getList().clear();
        try {
            if (!this.getFile().exists()) {
                this.getFile().createNewFile();
            }
        }
        catch (IOException var2_2) {
            var2_2.printStackTrace();
        }
        if (!this.getFile().exists()) return;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.getFile()));//OG var2_3
            String text;
            while ((text = reader.readLine()) != null) {
                String[] split = text.split(":");
                int key;
                try {
                    key = Integer.parseInt(split[0]);
                } catch (NumberFormatException var5_8) {
                    key = Keyboard.getKeyIndex(split[0]);
                }

                try {
                    this.f$d.getList().add(new MacroObject(key, split[1]));
                } catch (Exception var5_9) {
                    var5_9.printStackTrace();
                }
            }
            reader.close();
        }
        catch (Exception var2_4) {
            var2_4.printStackTrace();
        }
    }

    @Override
    public void save(Object ... objectArray) {
        BufferedWriter bufferedWriter;
        try {
            if (!this.getFile().exists()) {
                this.getFile().createNewFile();
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            /*
            Iterator iterator;
            bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            Iterator iterator2 = iterator = this.f$d.getList().iterator();
            while (iterator2.hasNext()) {
                lg lg2 = (lg)iterator.next();
                iterator2 = iterator;
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.write(Keyboard.getKeyName((int)lg2.f$E()) + ":" + lg2.f$E());
                bufferedWriter2.newLine();
            }
            */
            bufferedWriter = new BufferedWriter(new FileWriter(this.getFile()));
            for(MacroObject object : this.f$d.getList()) {
                bufferedWriter.write(Keyboard.getKeyName(object.getKeyID())+":"+object.getMacro());
                bufferedWriter.newLine();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        try {
            bufferedWriter.close();
        } catch (IOException ignore) {}
    }
}
/*
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import net.futureclient.client.Ib;
import net.futureclient.client.lf;
import net.futureclient.client.lg;
import org.lwjgl.input.Keyboard;

public class nf extends Ib {
    public final lf f$d;

@Override
public void f$E(Object ... 0) {
    0.f$d.f$d.clear();
    try {
        if (!0.f$E().exists()) {
            0.f$E().createNewFile();
        }
    }
    catch (IOException var2_2) {
        var2_2.printStackTrace();
    }
    if (!0.f$E().exists()) {
        return;
    }
    try {
        var2_3 = new BufferedReader(new FileReader(0.f$E()));
        while ((var3_5 = var2_3.readLine()) != null) {
            var3_5 = var3_5.split(":");
            try {
                var4_6 = Integer.parseInt(var3_5[0]);
                v0 = 0;
                    ** GOTO lbl24
            }
            catch (NumberFormatException var5_8) {
                var4_6 = Keyboard.getKeyIndex((String)var3_5[0]);
                try {
                    v0 = 0;
                    lbl24:
                    // 2 sources

                    v0.f$d.f$d.add(new lg(var4_6, var3_5[1]));
                }
                catch (Exception var5_9) {
                    var5_9.printStackTrace();
                }
            }
        }
        var2_3.close();
        return;
    }
    catch (Exception var2_4) {
        var2_4.printStackTrace();
        return;
    }
}

    @Override
    public void f$a(Object ... objectArray) {
        BufferedWriter bufferedWriter;
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            Iterator iterator;
            bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            Iterator iterator2 = iterator = 0.f$d.f$d.iterator();
            while (iterator2.hasNext()) {
                lg lg2 = (lg)iterator.next();
                iterator2 = iterator;
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.write(Keyboard.getKeyName((int)lg2.f$E()) + ":" + lg2.f$E());
                bufferedWriter2.newLine();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        bufferedWriter.close();
    }

    public nf(lf lf2, String string) {
        0.f$d = lf2;
        super(string);
    }
}
 */