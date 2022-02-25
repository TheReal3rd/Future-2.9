package net.futureclient.client;

import java.nio.ByteBuffer;
import net.futureclient.client.La;
import org.apache.logging.log4j.Level;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public abstract class Wh {
    private int f$b;
    public final int f$K;
    private String f$A;
    public final int f$C;
    public final int f$a;
    private int f$M;
    private int f$g;
    private String f$B;
    public int f$i;
    public int f$d;
    public int f$j;
    public static final double f$c = 2.0;
    public final int f$e;
    public final int f$I;

    public int f$E(String string) {
        return ARBShaderObjects.glGetUniformLocationARB((int)0.f$d, (CharSequence)string);
    }

    public void f$B() {
        Wh wh;
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        GL11.glDisable((int)3553);
        GL11.glBegin((int)4);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)wh.f$K);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        Wh wh2 = wh;
        GL11.glVertex2d((double)wh.f$I, (double)wh.f$K);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)wh2.f$I, (double)wh.f$K);
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)wh2.f$I, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
    }

    public static String f$E(int n) {
        int n2 = n;
        return ARBShaderObjects.glGetInfoLogARB((int)n2, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35716));
    }

    public abstract Wh f$E();

    public void f$e() {
        Wh wh;
        if (wh.f$i > -1) {
            EXTFramebufferObject.glDeleteRenderbuffersEXT((int)wh.f$i);
        }
        if (wh.f$j > -1) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)wh.f$j);
        }
        if (wh.f$b > -1) {
            GL11.glDeleteTextures((int)wh.f$b);
        }
    }

    private void f$K() {
        Wh wh;
        Wh wh2 = wh;
        wh2.f$j = EXTFramebufferObject.glGenFramebuffersEXT();
        wh2.f$b = GL11.glGenTextures();
        wh2.f$i = EXTFramebufferObject.glGenRenderbuffersEXT();
        GL11.glBindTexture((int)3553, (int)wh.f$b);
        GL11.glTexParameterf((int)3553, (int)10241, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10240, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
        GL11.glBindTexture((int)3553, (int)0);
        GL11.glBindTexture((int)3553, (int)wh.f$b);
        Wh wh3 = wh;
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)wh3.f$C, (int)wh3.f$e, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)wh.f$j);
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)wh.f$b, (int)0);
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)wh.f$i);
        Wh wh4 = wh;
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)wh4.f$C, (int)wh4.f$e);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)wh.f$i);
        wh.f$a();
    }

    public static int f$E(String string, int n) throws Exception {
        int n2;
        block4: {
            n2 = 0;
            try {
                n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
                if (n2 != 0) break block4;
                return 0;
            }
            catch (Exception exception) {
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                throw exception;
            }
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) == 0) {
            throw new RuntimeException(new StringBuilder().insert(0, "Error creating shader: ").append(Wh.f$E(n2)).toString());
        }
        return n2;
    }

    private void f$a() {
        int n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)36160);
        switch (n) {
            case 36053: {
                return;
            }
            case 36054: {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT");
            }
            case 36055: {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT");
            }
            default: {
                throw new RuntimeException(new StringBuilder().insert(0, "glCheckFramebufferStatusEXT returned unknown status:").append(n).toString());
            }
            case 36057: {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT");
            }
            case 36058: {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT");
            }
            case 36059: 
        }
        throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT");
    }

    private void f$E() {
        Wh wh;
        if (wh.f$d == -1) {
            wh.f$d = ARBShaderObjects.glCreateProgramObjectARB();
            try {
                String string;
                if (wh.f$M == -1) {
                    string = "#version 120 \nvoid main() { \ngl_TexCoord[0] = gl_MultiTexCoord0; \ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex; \n}";
                    wh.f$M = Wh.f$E(string, 35633);
                }
                if (wh.f$g == -1) {
                    string = "#version 120\n\nuniform sampler2D DiffuseSamper;\nuniform vec2 TexelSize;\nuniform int SampleRadius;\n\nvoid main()\n{\n    vec4 centerCol = texture2D(DiffuseSamper, gl_TexCoord[0].st);\n    \n    if(centerCol.a != 0.0F)\n    {\n        gl_FragColor = vec4(0, 0, 0, 0);\n        return;\n    }\n    float closest = SampleRadius * 1.0F;\n    for(int xo = -SampleRadius; xo <= SampleRadius; xo++) \n    {\n        for(int yo = -SampleRadius; yo <= SampleRadius; yo++) \n        {\n            vec4 currCol = texture2D(DiffuseSamper, gl_TexCoord[0].st + vec2(xo * TexelSize.x, yo * TexelSize.y));\n            if(currCol.r != 0.0F || currCol.g != 0.0F || currCol.b != 0.0F || currCol.a != 0.0F)\n            {\n                float currentDist = sqrt(xo * xo + yo * yo);\n                if(currentDist < closest)\n                {\n                    closest = currentDist;\n                }\n            }\n        }\n    }\n    float m = 2.0;\n    float fade = max(0, ((SampleRadius * 1.0F) - (closest - 1)) / (SampleRadius * 1.0F));\n    gl_FragColor = vec4(m - fade, m - fade, m - fade, fade);\n}";
                    wh.f$g = Wh.f$E(string, 35632);
                }
            }
            catch (Exception exception) {
                Wh wh2 = wh;
                wh.f$d = -1;
                wh2.f$M = -1;
                wh2.f$g = -1;
                exception.printStackTrace();
            }
            if (wh.f$d != -1) {
                Wh wh3 = wh;
                Wh wh4 = wh;
                ARBShaderObjects.glAttachObjectARB((int)wh3.f$d, (int)wh4.f$M);
                ARBShaderObjects.glAttachObjectARB((int)wh3.f$d, (int)wh.f$g);
                ARBShaderObjects.glLinkProgramARB((int)wh4.f$d);
                if (ARBShaderObjects.glGetObjectParameteriARB((int)wh3.f$d, (int)35714) == 0) {
                    La.f$E().f$E(Level.ERROR, Wh.f$E(wh.f$d));
                    return;
                }
                Wh wh5 = wh;
                ARBShaderObjects.glValidateProgramARB((int)wh5.f$d);
                if (ARBShaderObjects.glGetObjectParameteriARB((int)wh5.f$d, (int)35715) == 0) {
                    La.f$E().f$E(Level.ERROR, Wh.f$E(wh.f$d));
                    return;
                }
                ARBShaderObjects.glUseProgramObjectARB((int)0);
            }
        }
    }

    public Wh(String string, String string2, int n, int n2, int n3, int n4, int n5) {
        Wh wh = 0;
        Wh wh2 = 0;
        Wh wh3 = 0;
        Wh wh4 = 0;
        Wh wh5 = 0;
        0.f$b = -1;
        wh5.f$j = -1;
        wh5.f$i = -1;
        wh4.f$M = -1;
        wh4.f$g = -1;
        wh3.f$d = -1;
        wh3.f$A = string;
        wh2.f$B = string2;
        wh2.f$a = n;
        wh.f$C = n2;
        wh.f$e = n3;
        0.f$I = (int)((double)n4 * 2.0);
        0.f$K = (int)((double)n5 * 2.0);
        0.f$K();
        0.f$E();
    }

    public int f$E() {
        Wh wh;
        return wh.f$b;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 5;
        int cfr_ignored_0 = 2 << 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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
}
package net.futureclient.client;

import com.google.common.io.ByteArrayDataOutput;
import java.io.DataInputStream;
import java.io.IOException;

public abstract class WH {
    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ 3 << 1;
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

    public abstract void f$E(DataInputStream var1) throws IOException;

    public abstract int f$E();

    public WH() {
        WH wH;
    }

    public abstract void f$E(ByteArrayDataOutput var1) throws IOException;
}
package net.futureclient.client;

public final class wH {
    public wH() {
        wH wH2;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.GA;
import net.futureclient.client.Xi;
import net.futureclient.client.kH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketTabComplete;

public class wh
extends GA {
    private List<String> f$d;

    @Override
    public String f$E(String[] stringArray) {
        0.f$d.player.connection.sendPacket((Packet)new CPacketTabComplete("/", null, false));
        kH.f$E().f$E().f$a(new Xi(0));
        return "Discovering plugins, please wait...";
    }

    @Override
    public String f$E() {
        return null;
    }

    public wh() {
        wh wh2;
        String[] stringArray = new String[5];
        stringArray[0] = "Plugins";
        stringArray[1] = "PluginDiscover";
        stringArray[2] = "Discover";
        stringArray[3] = "plugin";
        stringArray[4] = "pl";
        super(stringArray);
        wh wh3 = wh2;
        wh3.f$d = new ArrayList<String>();
    }

    public static List f$E(wh wh2) {
        return wh2.f$d;
    }

    public static List f$E(wh wh2, List list) {
        wh2.f$d = list;
        return wh2.f$d;
    }
}
