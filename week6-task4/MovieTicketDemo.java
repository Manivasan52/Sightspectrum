package task4;

import java.util.Scanner;

public class MovieTicketDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the movie name :");
	String movieName=sc.nextLine();
	System.out.println("Enter the number of tickets :");
	int numberOfTickets=sc.nextInt();
	int ticketPrice;
	int totalCost = 0;
	if(movieName.equals("Avengers"))
	{
		ticketPrice=10;
		totalCost=numberOfTickets * ticketPrice;
	}
	else if(movieName.equals("the lion of king"))
	{
		ticketPrice=11;
		 totalCost=numberOfTickets * ticketPrice;
	}
	else
	{
		ticketPrice=0;
		 totalCost=numberOfTickets * ticketPrice;
	}
	System.out.println("Enter the movie name :"+movieName);
	System.out.println("Enter the number of tickets :"+numberOfTickets);
	System.out.println("ticket price :"+ticketPrice);
	
	System.out.println("total of cost :"+totalCost+"₹");
	
}
}
