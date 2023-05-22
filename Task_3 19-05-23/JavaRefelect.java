package jdbcconnectivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class JavaRefelect {
	public void print(String message)
	{
		System.out.println("your message:"+message);
	}
public static void main(String[] args) throws Exception 
 {
	JavaRefelect obj = new JavaRefelect();
    Class<?> classObj = obj.getClass();
    Method printMessage = classObj.getDeclaredMethod("printMessage", String.class);

    try {
        printMessage.invoke(obj, "hello"); 
    }
    
    catch (InvocationTargetException e) 
    {
        System.out.println(e.getCause());
    }
}
}
