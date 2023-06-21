package task3;

import java.util.Scanner;

public class AgeGroupLoops {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Age");
	int age=sc.nextInt();
	
	
	for(int i=1;i<age;i++)
	{
		if(age>=0 && age<=2)
			System.out.println("Infant");
		else if(age>=3 && age<=12)
			System.out.println("Child");
		else if(age>=13 && age<=19)
			System.out.println("Teenager");
		else if(age>=20 && age<=59)
			System.out.println("Adult");
		else
			System.out.println("Senior Citizen");
		break;
	}
	System.out.println("Your age is a :"+age);
	}

}
