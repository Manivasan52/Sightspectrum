package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageNumberList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter numbers (enter any non-numeric value to calculate average):");
        while(sc.hasNextDouble())
        {
        	double number=sc.nextDouble();
        	list.add(number);
        }
        double sum=0;
        for(double number:list)
        {
        	System.out.println(number);
        	 sum=sum+number;
        }
       double average=sum/list.size();
       
       System.out.println("sum :"+sum+"average :"+average);
       sc.close();
	}
}
