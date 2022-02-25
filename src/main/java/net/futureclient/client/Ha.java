package net.futureclient.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import net.futureclient.client.RF;

public abstract class Ha<S extends RF> {
    private Class<S> f$d;

    public abstract void f$E(S var1);

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public Class<S> f$E() {
        Ha ha;
        return ha.f$d;
    }

    public Ha() {
        Ha ha;
        Ha ha2 = ha;
        Type[] typeArray = ha2.getClass().getGenericSuperclass();
        if (typeArray instanceof ParameterizedType) {
            int n;
            typeArray = ((ParameterizedType)typeArray).getActualTypeArguments();
            int n2 = typeArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                Type type = typeArray[n];
                if (type instanceof Class && RF.class.isAssignableFrom((Class)type)) {
                    ha.f$d = (Class)type;
                    return;
                }
                n3 = ++n;
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.RD;

public class HA
extends Ha<RD> {
    public final DA f$d;

    public HA(DA dA) {
        0.f$d = dA;
    }

    @Override
    public void f$E(RD rD) {
        rD.f$E(0.f$d.f$b.f$E());
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.Ja;
import net.futureclient.client.O;
import net.minecraft.block.state.IBlockState;

public final class ha
extends O<IBlockState> {
    public ha(String ... stringArray) {
        super(stringArray, (Ja)null);
    }

    public ha(List<IBlockState> list, String ... stringArray) {
        super(list, stringArray, (Ja)null);
    }
}
package net.futureclient.client;

public enum hA {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hA() {
        hA hA2;
    }
}
