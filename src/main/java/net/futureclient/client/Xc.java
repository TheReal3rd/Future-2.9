package net.futureclient.client;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.futureclient.client.La;
import net.futureclient.client.Wh;
import org.apache.logging.log4j.Level;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class Xc {
    private float f$l;
    private final int f$a;
    private static int f$j;
    private static int f$d;
    private final int f$c;
    private int f$K;
    private final int f$B;
    private int f$e;
    private static int f$g;
    private int f$L;
    private int f$I;
    private static int f$b;
    private final int f$A;
    private final int f$C;
    private static int f$i;
    private static int f$M;

    public Xc(int n, int n2, int n3, int n4, int n5, float f, int n6) {
        Xc xc = 0;
        Xc xc2 = 0;
        Xc xc3 = 0;
        Xc xc4 = 0;
        xc4.f$e = -1;
        xc4.f$I = -1;
        xc3.f$K = -1;
        xc3.f$c = n;
        xc2.f$A = n2;
        xc2.f$B = n3;
        xc.f$a = n4;
        xc.f$C = n5;
        0.f$l = f;
        0.f$L = n6;
        0.f$a();
        0.f$E();
    }

    static {
        f$b = -1;
        f$j = -1;
        f$i = -1;
        f$M = -1;
        f$g = -1;
        f$d = -1;
    }

    public void f$e() {
        Xc xc;
        if (xc.f$K > -1) {
            EXTFramebufferObject.glDeleteRenderbuffersEXT((int)xc.f$K);
        }
        if (xc.f$I > -1) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)xc.f$I);
        }
        if (xc.f$e > -1) {
            GL11.glDeleteTextures((int)xc.f$e);
        }
    }

    private void f$a() {
        Xc xc;
        Xc xc2 = xc;
        xc2.f$I = EXTFramebufferObject.glGenFramebuffersEXT();
        xc2.f$e = GL11.glGenTextures();
        xc2.f$K = EXTFramebufferObject.glGenRenderbuffersEXT();
        GL11.glBindTexture((int)3553, (int)xc.f$e);
        GL11.glTexParameterf((int)3553, (int)10241, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10240, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
        GL11.glBindTexture((int)3553, (int)0);
        GL11.glBindTexture((int)3553, (int)xc.f$e);
        Xc xc3 = xc;
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)xc3.f$A, (int)xc3.f$B, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)xc.f$I);
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)xc.f$e, (int)0);
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)xc.f$K);
        Xc xc4 = xc;
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)xc4.f$A, (int)xc4.f$B);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)xc.f$K);
    }

    public Xc f$E(int n) {
        0.f$L = n;
        return 0;
    }

    private void f$E() {
        if (f$i == -1) {
            Xc xc;
            f$i = ARBShaderObjects.glCreateProgramObjectARB();
            try {
                String string;
                if (f$b == -1) {
                    string = "#version 120 \nvoid main() { \ngl_TexCoord[0] = gl_MultiTexCoord0; \ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex; \n}";
                }
                if (f$j == -1) {
                    string = "#version 120 \nuniform sampler2D DiffuseSamper; \nuniform vec2 TexelSize; \nuniform int SampleRadius; \nvoid main() { \nvec4 centerCol = texture2D(DiffuseSamper, gl_TexCoord[0].st); \nif (centerCol.a != 0.0F) { \ngl_FragColor = vec4(0, 0, 0, 0); \nreturn; \n} \nfloat closest = SampleRadius * 2.0F + 2.0F; \nfor (int xo = -SampleRadius; xo <= SampleRadius; xo++) { \nfor (int yo = -SampleRadius; yo <= SampleRadius; yo++) { \nvec4 currCol = texture2D(DiffuseSamper, gl_TexCoord[0].st + vec2(xo * TexelSize.x, yo * TexelSize.y)); \nif (currCol.r != 0.0F || currCol.g != 0.0F || currCol.b != 0.0F || currCol.a != 0.0F) { \nfloat currentDist = sqrt(xo*xo*1.0f + yo*yo*1.0f); \nif (currentDist < closest) { \nclosest = currentDist; \n} \n} \n} \n} \ngl_FragColor = vec4(1, 1, 1, max(0, ((SampleRadius*1.0F) - (closest - 1)) / (SampleRadius*1.0F))); \n}";
                    f$j = Wh.f$E("#version 120 \nuniform sampler2D DiffuseSamper; \nuniform vec2 TexelSize; \nuniform int SampleRadius; \nvoid main() { \nvec4 centerCol = texture2D(DiffuseSamper, gl_TexCoord[0].st); \nif (centerCol.a != 0.0F) { \ngl_FragColor = vec4(0, 0, 0, 0); \nreturn; \n} \nfloat closest = SampleRadius * 2.0F + 2.0F; \nfor (int xo = -SampleRadius; xo <= SampleRadius; xo++) { \nfor (int yo = -SampleRadius; yo <= SampleRadius; yo++) { \nvec4 currCol = texture2D(DiffuseSamper, gl_TexCoord[0].st + vec2(xo * TexelSize.x, yo * TexelSize.y)); \nif (currCol.r != 0.0F || currCol.g != 0.0F || currCol.b != 0.0F || currCol.a != 0.0F) { \nfloat currentDist = sqrt(xo*xo*1.0f + yo*yo*1.0f); \nif (currentDist < closest) { \nclosest = currentDist; \n} \n} \n} \n} \ngl_FragColor = vec4(1, 1, 1, max(0, ((SampleRadius*1.0F) - (closest - 1)) / (SampleRadius*1.0F))); \n}", 35632);
                }
            }
            catch (Exception exception) {
                f$i = -1;
                f$b = -1;
                Xc xc2 = xc;
                f$j = -1;
                exception.printStackTrace();
            }
            if (f$i != -1) {
                ARBShaderObjects.glAttachObjectARB((int)f$i, (int)f$j);
                ARBShaderObjects.glLinkProgramARB((int)f$i);
                Xc xc3 = xc;
                if (ARBShaderObjects.glGetObjectParameteriARB((int)f$i, (int)35714) == 0) {
                    La.f$E().f$E(Level.ERROR, Wh.f$E(f$i));
                    return;
                }
                ARBShaderObjects.glValidateProgramARB((int)f$i);
                if (ARBShaderObjects.glGetObjectParameteriARB((int)f$i, (int)35715) == 0) {
                    La.f$E().f$E(Level.ERROR, Wh.f$E(f$i));
                    return;
                }
                ARBShaderObjects.glUseProgramObjectARB((int)0);
                f$M = ARBShaderObjects.glGetUniformLocationARB((int)f$i, (CharSequence)"DiffuseSamper");
                Xc xc4 = xc;
                f$g = ARBShaderObjects.glGetUniformLocationARB((int)f$i, (CharSequence)"TexelSize");
                Xc xc5 = xc;
                f$d = ARBShaderObjects.glGetUniformLocationARB((int)f$i, (CharSequence)"SampleRadius");
            }
        }
    }

    public int f$E() {
        Xc xc;
        return xc.f$e;
    }

    public Xc f$E() {
        Xc xc;
        if (xc.f$I == -1 || xc.f$K == -1 || f$i == -1) {
            throw new RuntimeException("Invalid IDs!");
        }
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)xc.f$I);
        GL11.glClear((int)16640);
        ARBShaderObjects.glUseProgramObjectARB((int)f$i);
        ARBShaderObjects.glUniform1iARB((int)f$M, (int)0);
        GL13.glActiveTexture((int)33984);
        GL11.glEnable((int)3553);
        GL11.glBindTexture((int)3553, (int)xc.f$c);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)2);
        floatBuffer.position(0);
        floatBuffer.put(1.0f / (float)xc.f$A * xc.f$l);
        floatBuffer.put(1.0f / (float)xc.f$B * xc.f$l);
        floatBuffer.flip();
        ARBShaderObjects.glUniform2ARB((int)f$g, (FloatBuffer)floatBuffer);
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        intBuffer.position(0);
        intBuffer.put(xc.f$L);
        intBuffer.flip();
        ARBShaderObjects.glUniform1ARB((int)f$d, (IntBuffer)intBuffer);
        int n = 2;
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)768);
        GL11.glBegin((int)9);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)(xc.f$C * 2));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        Xc xc2 = xc;
        GL11.glVertex2d((double)(xc.f$a * 2), (double)(xc.f$C * 2));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(xc2.f$a * 2), (double)(xc.f$C * 2));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)(xc2.f$a * 2), (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ARBShaderObjects.glUseProgramObjectARB((int)0);
        return xc;
    }

    public Xc f$E(float f) {
        0.f$l = f;
        return 0;
    }
}
package net.futureclient.client;

public enum xC {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xC() {
        xC xC2;
    }
}
