package net.futureclient.client.deof.settings;

public class NumberSetting extends SettingsBase<Number> {
    public Number increament;//OG f$g
    public Number max;//OG f$M
    public Number min;//OG f$i
    private boolean f$d;//OG f$d

    public NumberSetting(Number defaultValue, Number min, Number max, Number inc, String ... stringArray) {
        super(defaultValue, stringArray);
        this.f$d = true;
        this.min = min;
        this.max = max;
        this.increament = inc;
    }

    public NumberSetting(Number defaultValue, Number min, Number max, String ... stringArray) {
        super(defaultValue, stringArray);
        this.f$d = false;
        this.min = min;
        this.max = max;
        this.increament = 0.1;
    }

    @Override
    public Number getValue() {
        return super.getValue();
    }

    public Number getIncreament() {
        return this.increament;
    }

    public Number getMin() {
        return this.min;
    }

    public Number getMax() {
        return this.max;
    }

    @Override
    public void setValue(Number number) {
        /*
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
                                                    if (!this.f$d) ** GOTO lbl75
                                                    if (!(number instanceof Integer)) break block3;
                                                    if (number.intValue() <= this.max.intValue()) break block4;
                                                    v0 = 0;
                                                    v1 = v0;
                                                    0 = v2.max;
                                                    break block5;
                                                }
                                                if (number.intValue() >= this.min.intValue()) ** GOTO lbl75
                                                v2 = 0;
                                                v1 = v2;
                                                0 = v2.min;
                                                break block5;
                                            }
                                            if (!(number instanceof Float)) break block6;
                                            if (!(number.floatValue() > this.max.floatValue())) break block7;
                                            v3 = 0;
                                            v1 = v3;
                                            0 = v3.max;
                                            break block5;
                                        }
                                        if (!(number.floatValue() < this.min.floatValue())) ** GOTO lbl75
                                        v4 = 0;
                                        v1 = v4;
                                        0 = v4.min;
                                        break block5;
                                    }
                                    if (!(number instanceof Double)) break block8;
                                    if (!(number.doubleValue() > this.max.doubleValue())) break block9;
                                    v5 = 0;
                                    v1 = v5;
                                    0 = v5.max;
                                    break block5;
                                }
                                if (!(number.doubleValue() < this.min.doubleValue())) ** GOTO lbl75
                                v6 = 0;
                                v1 = v6;
                                0 = v6.min;
                                break block5;
                            }
                            if (!(number instanceof Long)) break block10;
                            if (number.longValue() <= this.max.longValue()) break block11;
                            v7 = 0;
                            v1 = v7;
                            0 = v7.max;
                            break block5;
                        }
                        if (number.longValue() >= this.min.longValue()) ** GOTO lbl75
                        v8 = 0;
                        v1 = v8;
                        0 = v8.min;
                        break block5;
                    }
                    if (!(number instanceof Short)) break block12;
                    if (number.shortValue() <= this.max.shortValue()) break block13;
                    v9 = 0;
                    v1 = v9;
                    0 = v9.max;
                    break block5;
                }
                if (number.shortValue() >= this.min.shortValue()) ** GOTO lbl75
                v10 = 0;
                v1 = v10;
                0 = v10.min;
                break block5;
            }
            if (!(number instanceof Byte)) ** GOTO lbl75
            if (number.byteValue() > this.max.byteValue()) {
                v11 = 0;
                v1 = v11;
                0 = v11.max;
            } else {
                if (number.byteValue() < this.min.byteValue()) {
                    0 = 0.min;
                }
                lbl75:
                // 10 sources

                v1 = 0;
            }
        }
        */

        if(this.f$d) {
            if (number instanceof Integer) {
                if(number.intValue() >= max.intValue()) {
                    super.setValue(max.intValue());
                    return;
                } else if(number.intValue() <= min.intValue()) {
                    super.setValue(min.intValue());
                    return;
                }
            } else if (number instanceof Float) {
                if(number.floatValue() > max.floatValue()) {
                    super.setValue(max.floatValue());
                    return;
                } else if(number.floatValue() < min.floatValue()) {
                    super.setValue(min.floatValue());
                    return;
                }
            } else if (number instanceof Long) {
                if(number.longValue() > max.longValue()) {
                    super.setValue(max.longValue());
                    return;
                } else if(number.longValue() < min.longValue()) {
                    super.setValue(min.longValue());
                    return;
                }
            } else if (number instanceof Short) {
                if(number.shortValue() > max.shortValue()) {
                    super.setValue(max.shortValue());
                    return;
                } else if(number.shortValue() < min.shortValue()) {
                    super.setValue(min.shortValue());
                    return;
                }
            } else if (number instanceof Byte) {
                if(number.byteValue() > max.byteValue()) {
                    super.setValue(max.byteValue());
                    return;
                } else if(number.byteValue() < min.byteValue()) {
                    super.setValue(min.byteValue());
                    return;
                }
            }
        }
        super.setValue(number);
    }
}
/*
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
 */