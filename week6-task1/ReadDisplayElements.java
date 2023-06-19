package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadDisplayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>list=new ArrayList<>();
		System.out.println("enter a number()enter the done value to print:");
		while(true)
		{
			String number=sc.nextLine();
			if(number.equalsIgnoreCase("done")) {
				break;
			}
			list.add(number);
		}
		for(String lists:list)
		{
			System.out.println(lists);
		}
		sc.close();
	}

}
