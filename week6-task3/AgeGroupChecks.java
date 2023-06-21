package task3;

import java.util.Scanner;

public class AgeGroupChecks {
	public  static String ageCheck(int age)
	{
		if(age>=0 && age<=2)
			return "Infant";
		else if(age>=3 && age<=12)
			return "Child";
		else if(age>=13 && age<=19)
		return "Teenager";
		else if(age>=20 && age<=59)
			return "Adult";
		else
			return "Senior Citizen";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Age");
		int age=sc.nextInt();
		String ageGroup=ageCheck(age);
		System.out.println("your age is a :"+ageGroup);

	}

}
