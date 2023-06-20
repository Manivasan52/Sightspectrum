package task2;

import java.util.Scanner;

public class ScannerMaximum {

	public static void main(String[] args) {
		Scanner sc=	new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("enter the first  number");
		a=sc.nextInt();
		System.out.println("enter the second  number");
		b=sc.nextInt();
		System.out.println("enter the third number ");
		c=sc.nextInt();
		if(a>=b)
		{
			if(a>=c) {
			System.out.println(a+" : A is a Largest Number");
			}
			else
			{
				System.out.println(c+" C is a largest number");
			}
		}
		else
		{
			if(b>=c)
			{
			System.out.println(b+" : B is a Largest Number");
			}
			else
			{
				System.out.println(c+" C is a largest number");
			}
		}
	}

}
