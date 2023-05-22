package example;

import java.lang.annotation.Annotation;

public class Main {
public static void main(String[] args) {
	
	Demo d=new Demo();
	Class<? extends Demo> c=d.getClass();
	System.out.println(c.getName());
	
	MyAnno an=(MyAnno)c.getAnnotation(MyAnno.class);
	System.out.println(an.myValue());
	System.out.println(an.name());
	System.out.println(an.city());
}
}
