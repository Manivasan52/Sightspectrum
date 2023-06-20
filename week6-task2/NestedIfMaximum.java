package task2;

public class NestedIfMaximum {

	public static void main(String[] args) {
		int a=10;
		int b=50;
		int c=30;
		if(a>=b)
		{
			if(a>=c)
			System.out.println(a+" :largest number");
			else
				System.out.println(c+" :largest number");
		}
		else
		{
			if(b>=c)
				System.out.println(b+" :largest number");
			else
				System.out.println(c+" :largest number");
		}
				
	}

}
