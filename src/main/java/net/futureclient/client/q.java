package net.futureclient.client;

public interface q {
    public float f$E();

    public void f$E(float var1);
}
package net.futureclient.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Q {
    public String f$E();
}
