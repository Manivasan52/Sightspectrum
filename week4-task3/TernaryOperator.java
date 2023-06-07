package task3;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the exam mark");
		int exam;
		exam=sc.nextInt();
		
		if(exam>50)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		sc.close();
	}

}
