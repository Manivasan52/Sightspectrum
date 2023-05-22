package Task1;

public class Exceptionhandling {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		try {
			System.out.println(a+b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
