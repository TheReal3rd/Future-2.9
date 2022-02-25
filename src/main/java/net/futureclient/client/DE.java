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
package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.ME;
import net.futureclient.client.VD;
import net.futureclient.client.hf;
import net.futureclient.client.kH;
import net.futureclient.client.oE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.Display;

public class dE
extends Ha<ME> {
    public final oE f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(ME 0) {
        block22: {
            block21: {
                if (oE.f$E(0.f$d).f$a(oE.f$B(0.f$d).f$E().floatValue() + 100.0f)) break block21;
                switch (hf.f$d[((VD)oE.f$E(0.f$d).f$E()).ordinal()]) lbl-1000:
                // 2 sources

                {
                    case 1: {
                        if (false) ** GOTO lbl-1000
                        0.f$d.f$a(String.format("Orebfuscator \u00a77[\u00a7F%s\u00a77]", new Object[]{oE.f$e(0.f$d).size()}));
                        break;
                    }
                    case 2: {
                        0.f$d.f$a(String.format("Orebfuscator \u00a77[\u00a7F%s\u00a77]", new Object[]{oE.f$a(0.f$d).size()}));
                    }
                }
                break block22;
            }
            0.f$d.f$a("Orebfuscator");
        }
        switch (hf.f$d[((VD)oE.f$E(0.f$d).f$E()).ordinal()]) {
            case 1: {
                while (false) {
                }
                if (!oE.f$E(0.f$d).f$a(oE.f$B(0.f$d).f$E().floatValue())) break;
                if (oE.f$K(0.f$d) == -2) {
                    return;
                }
                if (oE.f$K(0.f$d) == -1) {
                    La.f$E().f$E("Finished looping through blocks.");
                    if (!Display.isActive() && (var2_2 = (DC)kH.f$E().f$E().f$E(DC.class)) != null && var2_2.f$E()) {
                        kH.f$E().f$E().f$g.displayMessage("Orebfuscator finished", "Finished looping through blocks.", TrayIcon.MessageType.NONE);
                    }
                    0.f$d.f$E(false);
                    return;
                }
                var2_3 = (BlockPos)oE.f$e(0.f$d).get(oE.f$K(0.f$d));
                if (!oE.f$E(0.f$d).contains(oE.f$b().world.func_180495_p(var2_3).getBlock())) {
                    oE.f$F().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(var2_3, EnumFacing.UP, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                }
                oE.f$e(0.f$d).remove(oE.f$K(0.f$d));
                oE.f$B(0.f$d);
                oE.f$E(0.f$d).f$a();
                return;
            }
            case 2: {
                if (oE.f$e(0.f$d).f$E().intValue() > 35) {
                    oE.f$e(0.f$d).f$E(35);
                }
                v0 = var2_4 = 0;
                while (v0 <= oE.f$e(0.f$d).f$E().intValue()) {
                    v1 = var3_5 = 0;
                    while (v1 <= oE.f$e(0.f$d).f$E().intValue()) {
                        v2 = -var2_4;
                        while (v2 < var2_4) {
                            v3 = -var2_4;
                            while (v3 < var2_4) {
                                v4 = 0;
                                var3_5 = oE.f$E(v4.f$d, oE.f$E(v4.f$d) == false) != false ? -var3_5 : var3_5;
                                oE.f$B(0.f$d, (int)Math.floor(oE.f$G().player.field_70165_t) + var4_6);
                                oE.f$e(0.f$d, (int)Math.floor(oE.f$D().player.field_70163_u) + var3_5);
                                oE.f$a(0.f$d, (int)Math.floor(oE.f$g().player.field_70161_v) + var5_7);
                                if (oE.f$i().player.func_70092_e(oE.f$m().player.field_70165_t + (double)var4_6, oE.f$f().player.field_70163_u + (double)var3_5, oE.f$L().player.field_70161_v + (double)var5_7) <= 256.0) {
                                    var6_8 = new BlockPos(oE.f$e(0.f$d), oE.f$a(0.f$d), oE.f$E(0.f$d));
                                    var7_9 = oE.f$c().world.func_180495_p(var6_8).getBlock();
                                    if (oE.f$E(0.f$d).f$a(oE.f$B(0.f$d).f$E().floatValue()) && !oE.f$E(0.f$d).contains(var7_9) && !oE.f$a(0.f$d).contains(var6_8)) {
                                        oE.f$a(0.f$d).add(var6_8);
                                        oE.f$I().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(var6_8, EnumFacing.UP, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                                        oE.f$E(0.f$d).f$a();
                                        break;
                                    }
                                }
                                v3 = ++var5_7;
                            }
                            v2 = ++var4_6;
                        }
                        v1 = ++var3_5;
                    }
                    v0 = ++var2_4;
                }
                break;
            }
        }
    }

    public dE(oE oE2) {
        0.f$d = oE2;
    }
}
