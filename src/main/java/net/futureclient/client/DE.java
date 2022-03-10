package net.futureclient.client;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.futureclient.client.Je;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public final class DE
implements IMixinConfigPlugin {
    private final AtomicBoolean f$M;
    private boolean f$g;
    private Je f$d;

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public DE() {
        DE dE;
        DE dE2 = dE;
        dE2.f$M = new AtomicBoolean(true);
    }

    /*
     * Exception decompiling
     */
    public boolean shouldApplyMixin(String 0, String 0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
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

    public List<String> getMixins() {
        return null;
    }

    public String getRefMapperConfig() {
        return null;
    }

    public void onLoad(String string) {
        0.f$d = Je.f$E(string);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.multiplayer.WorldClient;

public class De
extends RF {
    private WorldClient f$d;

    public WorldClient f$E() {
        De de;
        return de.f$d;
    }

    public De(WorldClient worldClient) {
        0.f$d = worldClient;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.bE;
import net.futureclient.client.ye;

public class de
extends Ha<ye> {
    public final bE f$d;

    @Override
    public void f$E(ye ye2) {
        ye2.f$E(true);
    }

    public de(bE bE2) {
        0.f$d = bE2;
    }
}

