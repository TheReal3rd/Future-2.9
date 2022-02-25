package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;

public class DH
extends GA {
    @Override
    public String f$E(String[] object) {
        object = kH.f$E().f$E().f$E();
        StringJoiner stringJoiner = new StringJoiner(", ");
        StringJoiner stringJoiner2 = new StringJoiner(", ");
        object.forEach(ma2 -> {
            if (ma2 instanceof J) {
                Ba ba = (Ba)ma2;
                Object[] objectArray = new Object[2];
                objectArray[0] = ba.f$E() ? "&a" : "&c";
                objectArray[1] = ba.f$E()[0];
                stringJoiner.add(String.format("%s%s&7", objectArray));
                return;
            }
            stringJoiner2.add(ma2.f$E()[0]);
        });
        return String.format("Modules (%s) %s, %s.", object.size(), stringJoiner2.toString(), stringJoiner.toString());
    }

    public DH() {
        DH dH;
        String[] stringArray = new String[5];
        stringArray[0] = "Modules";
        stringArray[1] = "Mods";
        stringArray[2] = "lm";
        stringArray[3] = "ml";
        stringArray[4] = "list";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return null;
    }
}
package net.futureclient.client;

import java.io.IOException;
import java.io.InputStream;

public enum Dh {
    f$g;


    public byte[] f$E(String string) {
        int n;
        byte[] byArray = new byte[string.length() / 2];
        int n2 = n = 0;
        while (n2 < string.length()) {
            int n3 = n / 2;
            byte by = (byte)((Character.digit(string.charAt(n), 16) << 4) + Character.digit(string.charAt(n + 1), 16));
            byArray[n3] = by;
            n2 = n += 2;
        }
        return byArray;
    }

    /*
     * Exception decompiling
     */
    public byte[] f$E(InputStream 0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Dh() {
        Dh dh;
    }

    /*
     * Exception decompiling
     */
    public <T> T f$E(byte[] 0) throws IOException, ClassNotFoundException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 11[CATCHBLOCK]
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
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Hc;
import net.futureclient.client.ME;
import net.futureclient.client.Mh;
import net.futureclient.client.kH;
import net.futureclient.client.lE;
import net.futureclient.client.lc;

public class dh
extends Ha<ME> {
    public final Mh f$d;

    @Override
    public void f$E(ME mE) {
        Hc hc = (Hc)kH.f$E().f$E().f$E(Hc.class);
        lc lc2 = (lc)kH.f$E().f$E().f$E(lc.class);
        lE lE2 = (lE)kH.f$E().f$E().f$E(lE.class);
        0.f$d.f$g.assumeWalkOnWater.value = hc != null && hc.f$E();
        0.f$d.f$g.assumeStep.value = lc2 != null && lc2.f$E();
        0.f$d.f$g.assumeSafeWalk.value = lE2 != null && lE2.f$E() && lE2.f$e();
    }

    public dh(Mh mh) {
        0.f$d = mh;
    }
}
