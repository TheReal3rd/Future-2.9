package net.futureclient.client;

public enum Qd {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Qd() {
        Qd qd;
    }
}
package net.futureclient.client;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.futureclient.client.Ib;
import net.futureclient.client.eg;
import net.futureclient.client.kH;
import net.futureclient.client.mg;

public class QD
extends Ib {
    public final mg f$d;

    private static void f$E(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonObject)) {
            return;
        }
        try {
            JsonObject jsonObject = (JsonObject)jsonElement;
            kH.f$E().f$E().f$E().add(new eg(jsonObject.get("friend-label").getAsString(), jsonObject.get("friend-alias").getAsString()));
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public QD(mg mg2, String string) {
        0.f$d = mg2;
        super(string);
    }

    private static void f$E(JsonArray jsonArray, eg eg2) {
        try {
            JsonObject jsonObject;
            JsonObject jsonObject2;
            JsonObject jsonObject3 = jsonObject2 = (jsonObject = new JsonObject());
            jsonObject3.addProperty("friend-label", eg2.f$E());
            jsonObject3.addProperty("friend-alias", eg2.f$a());
            jsonArray.add((JsonElement)jsonObject3);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void f$E(Object ... 0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 8[CATCHBLOCK]], but top level block is 4[TRYBLOCK]
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

    /*
     * Exception decompiling
     */
    @Override
    public void f$a(Object ... 0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK], 6[CATCHBLOCK]], but top level block is 3[TRYBLOCK]
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

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.UF;

public class qD
extends Ha<De> {
    public final UF f$d;

    public qD(UF uF) {
        0.f$d = uF;
    }

    @Override
    public void f$E(De de) {
        qD qD2 = 0;
        UF.f$e(qD2.f$d).clear();
        UF.f$a(qD2.f$d).clear();
        UF.f$E(qD2.f$d).clear();
        UF.f$E(qD2.f$d).f$a();
        UF.f$a(qD2.f$d).f$a();
        UF.f$e(qD2.f$d).f$a();
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.jf;
import net.futureclient.client.vb;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.math.Vec3d;

public class qd
extends Ha<jf> {
    public final vb f$d;

    public qd(vb vb2) {
        0.f$d = vb2;
    }

    @Override
    public void f$E(jf jf2) {
        block2: {
            block3: {
                SPacketSoundEffect sPacketSoundEffect;
                if (!(jf2.f$E() instanceof SPacketSoundEffect) || !(sPacketSoundEffect = (SPacketSoundEffect)jf2.f$E()).getSound().equals(SoundEvents.ENTITY_BOBBER_SPLASH) || vb.f$B().player.field_71104_cf == null || !vb.f$a().player.field_71104_cf.getAngler().equals((Object)vb.f$e().player)) break block2;
                if (vb.f$E(0.f$d).f$E().doubleValue() == 0.0) break block3;
                Vec3d vec3d = new Vec3d(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ());
                if (!(vb.f$E().player.field_71104_cf.func_174791_d().distanceTo(vec3d) <= vb.f$E(0.f$d).f$E().doubleValue())) break block2;
            }
            vb.f$E(0.f$d, true);
        }
    }
}
