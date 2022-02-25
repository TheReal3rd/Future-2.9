package net.futureclient.client;

import net.futureclient.client.z;

public class s
extends z<Number> {
    public Number f$g;
    public Number f$M;
    public Number f$i;
    private boolean f$d;

    @Override
    public Number f$E() {
        s s2;
        return (Number)super.f$E();
    }

    public Number f$a() {
        s s2;
        return s2.f$g;
    }

    public Number f$e() {
        s s2;
        return s2.f$i;
    }

    public s(Number number, Number number2, Number number3, Number number4, String ... stringArray) {
        s s2 = 0;
        s s3 = 0;
        super(number, stringArray);
        s3.f$d = true;
        s3.f$i = number2;
        s2.f$M = number3;
        s2.f$g = number4;
    }

    public s(Number number, Number number2, Number number3, String ... stringArray) {
        s s2 = 0;
        s s3 = 0;
        super(number, stringArray);
        s3.f$d = false;
        s3.f$i = number2;
        s2.f$M = number3;
        s2.f$g = 0.1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Number 0) {
        block5: {
            block12: {
                block13: {
                    block10: {
                        block11: {
                            block8: {
                                block9: {
                                    block6: {
                                        block7: {
                                            block3: {
                                                block4: {
                                                    if (!0.f$d) ** GOTO lbl75
                                                    if (!(0 instanceof Integer)) break block3;
                                                    if (0.intValue() <= 0.f$M.intValue()) break block4;
                                                    v0 = 0;
                                                    v1 = v0;
                                                    0 = v0.f$M;
                                                    break block5;
                                                }
                                                if (0.intValue() >= 0.f$i.intValue()) ** GOTO lbl75
                                                v2 = 0;
                                                v1 = v2;
                                                0 = v2.f$i;
                                                break block5;
                                            }
                                            if (!(0 instanceof Float)) break block6;
                                            if (!(0.floatValue() > 0.f$M.floatValue())) break block7;
                                            v3 = 0;
                                            v1 = v3;
                                            0 = v3.f$M;
                                            break block5;
                                        }
                                        if (!(0.floatValue() < 0.f$i.floatValue())) ** GOTO lbl75
                                        v4 = 0;
                                        v1 = v4;
                                        0 = v4.f$i;
                                        break block5;
                                    }
                                    if (!(0 instanceof Double)) break block8;
                                    if (!(0.doubleValue() > 0.f$M.doubleValue())) break block9;
                                    v5 = 0;
                                    v1 = v5;
                                    0 = v5.f$M;
                                    break block5;
                                }
                                if (!(0.doubleValue() < 0.f$i.doubleValue())) ** GOTO lbl75
                                v6 = 0;
                                v1 = v6;
                                0 = v6.f$i;
                                break block5;
                            }
                            if (!(0 instanceof Long)) break block10;
                            if (0.longValue() <= 0.f$M.longValue()) break block11;
                            v7 = 0;
                            v1 = v7;
                            0 = v7.f$M;
                            break block5;
                        }
                        if (0.longValue() >= 0.f$i.longValue()) ** GOTO lbl75
                        v8 = 0;
                        v1 = v8;
                        0 = v8.f$i;
                        break block5;
                    }
                    if (!(0 instanceof Short)) break block12;
                    if (0.shortValue() <= 0.f$M.shortValue()) break block13;
                    v9 = 0;
                    v1 = v9;
                    0 = v9.f$M;
                    break block5;
                }
                if (0.shortValue() >= 0.f$i.shortValue()) ** GOTO lbl75
                v10 = 0;
                v1 = v10;
                0 = v10.f$i;
                break block5;
            }
            if (!(0 instanceof Byte)) ** GOTO lbl75
            if (0.byteValue() > 0.f$M.byteValue()) {
                v11 = 0;
                v1 = v11;
                0 = v11.f$M;
            } else {
                if (0.byteValue() < 0.f$i.byteValue()) {
                    0 = 0.f$i;
                }
lbl75:
                // 10 sources

                v1 = 0;
            }
        }
        super.f$E(0);
    }

    public Number f$B() {
        s s2;
        return s2.f$M;
    }
}
package net.futureclient.client;

public interface S {
}
