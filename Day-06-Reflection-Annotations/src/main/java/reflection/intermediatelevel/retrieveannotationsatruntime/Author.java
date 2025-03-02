package reflection.intermediatelevel.retrieveannotationsatruntime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Step 1: Define the custom annotation @Author
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name();
}
