package net.futureclient.client;

import net.futureclient.client.RF;

public class Ge
extends RF {
    private String f$d;

    public void f$E(String string) {
        0.f$d = string;
    }

    public Ge(String string) {
        0.f$d = string;
    }

    public String f$E() {
        Ge ge;
        return ge.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class GE
extends RF {
    public GE() {
        GE gE;
    }
}
package net.futureclient.client;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.io.IOException;
import net.futureclient.client.Ba;
import net.futureclient.client.Hf;
import net.futureclient.client.Ib;
import net.futureclient.client.J;
import net.futureclient.client.kH;
import net.futureclient.client.ma;
import net.futureclient.client.rC;
import org.lwjgl.input.Keyboard;

public class gE
extends Ib {
    public final Hf f$d;

    public gE(Hf hf, String string) {
        0.f$d = hf;
        super(string);
    }

    /*
     * Exception decompiling
     */
    private void f$E() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK], 0[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:845)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
         *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
         *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
         *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
         *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
         *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
         *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
         *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void f$E(Object ... objectArray) {
        File file;
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (!(file = new File(kH.f$E().f$E(), "modules")).exists()) {
            file.mkdir();
        }
        kH.f$E().f$E().f$E().forEach(ma::f$e);
        0.f$a();
    }

    private static void f$E(JsonArray jsonArray, ma ma2) {
        try {
            JsonObject jsonObject = new JsonObject();
            ma ma3 = ma2;
            jsonObject.addProperty("module-label", ma3.f$E()[0]);
            if (ma3 instanceof J) {
                Ba ba = (Ba)ma2;
                JsonObject jsonObject2 = jsonObject;
                jsonObject.addProperty("module-state", Boolean.valueOf(ba.f$E()));
                jsonObject2.addProperty("module-drawn", Boolean.valueOf(ba.f$a()));
                Object[] objectArray = new Object[1];
                objectArray[0] = ba.f$E()[0].replace(" ", "");
                jsonObject2.addProperty("module-keybind", Keyboard.getKeyName((int)kH.f$E().f$E().f$E(String.format("%sToggle", objectArray)).f$E()));
            }
            jsonArray.add((JsonElement)jsonObject);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static void f$E(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonObject)) {
            return;
        }
        try {
            JsonObject jsonObject = (JsonObject)jsonElement;
            kH.f$E().f$E().f$E().forEach(ma2 -> {
                if (ma2.f$E()[0].equalsIgnoreCase(jsonObject.get("module-label").getAsString()) && ma2 instanceof J) {
                    int n;
                    Ba ba = (Ba)ma2;
                    if (jsonObject.get("module-state").getAsBoolean()) {
                        ba.f$E(true);
                    }
                    ba.f$a(jsonObject.get("module-drawn").getAsBoolean());
                    JsonPrimitive jsonPrimitive = jsonObject.getAsJsonPrimitive("module-keybind");
                    int n2 = n = jsonPrimitive.isString() ? Keyboard.getKeyIndex((String)jsonPrimitive.getAsString()) : jsonPrimitive.getAsInt();
                    if (ba.getClass().equals(rC.class) && n == 0) {
                        n = 54;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = ba.f$E()[0].replace(" ", "");
                    kH.f$E().f$E().f$E(String.format("%sToggle", objectArray)).f$E(n);
                }
            });
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private void f$a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK], 0[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:845)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
         *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
         *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
         *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
         *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
         *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
         *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
         *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void f$a(Object ... objectArray) {
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        kH.f$E().f$E().f$E().forEach(ma::f$a);
        0.f$E();
    }
}

