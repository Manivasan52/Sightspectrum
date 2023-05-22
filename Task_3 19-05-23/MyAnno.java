package example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	 int myValue() default 0;
	 String name() default "Manivasan";
	 String city() default "Thanjavur";
}