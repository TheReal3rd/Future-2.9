package net.futureclient.client.deof.utils.other.tpsCalc;

import net.futureclient.client.deof.utils.other.DelayTimer;

import java.util.ArrayDeque;

public class TPSCalc {
    private static final int f$j = 20;//OG f$j Does fuck all anyway prob delete
    private final DelayTimer timeDelay; // OG gG f$d
    private long time;// OG f$g I think this is the Delay in prob ms
    private float tps;// OG f$M I think this is the result
    private final ArrayDeque<Float> tpsResult;// OG f$i

    public static float setTPS(TPSCalc rG, float f) {
        rG.tps = f;
        return rG.tps;
    }

    public static DelayTimer getDelayTimer(TPSCalc rG) {
        return rG.timeDelay;
    }

    public TPSCalc() {
        this.tpsResult = new ArrayDeque<Float>(20);
        this.timeDelay = new DelayTimer();
        kH.f$E().f$E().f$a(new VG(rG));//Reg Listener
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static long getTime(TPSCalc rG) {
        return rG.time;
    }

    public static long setTime(TPSCalc rG, long l) {
        rG.time = l;
        return rG.time;
    }

    public DelayTimer getTimeDelay() {
        return this.timeDelay;
    }

    public float getTPS() {
        return this.tps;
    }

    public static ArrayDeque<Float> getTPSResults(TPSCalc rG) {
        return rG.tpsResult;
    }

    public boolean passedTime() {
        return this.timeDelay.getTimeStart() > 2500L;
    }
}
/*
public class RG {
    private static final int f$j = 20;
    private final gG f$d;
    private long f$g;
    private float f$M;
    private ArrayDeque<Float> f$i;

    public static float f$E(RG rG, float f) {
        rG.f$M = f;
        return rG.f$M;
    }

    public static gG f$E(RG rG) {
        return rG.f$d;
    }

    public RG() {
        RG rG;
        RG rG2 = rG;
        rG.f$i = new ArrayDeque(20);
        rG2.f$d = new gG();
        kH.f$E().f$E().f$a(new VG(rG));
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static long f$E(RG rG) {
        return rG.f$g;
    }

    public static long f$E(RG rG, long l) {
        rG.f$g = l;
        return rG.f$g;
    }

    public gG f$E() {
        RG rG;
        return rG.f$d;
    }

    public float f$E() {
        RG rG;
        return rG.f$M;
    }

    public static ArrayDeque f$E(RG rG) {
        return rG.f$i;
    }

    public boolean f$E() {
        RG rG;
        return rG.f$d.f$E() > 2500L;
    }
}
 */