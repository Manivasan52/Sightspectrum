package task4;

import java.util.Scanner;

public class MovieBookingSystem {
	public static int getTicketDetails(String movieName)
	{
		int ticketPrice;
		if(movieName.equals("Avengers"))
		{
			ticketPrice=10;

		}
		else if(movieName.equals("the lion of king"))
		{
			ticketPrice=11;
		}
		else
		{
			ticketPrice=0;
		}
		return ticketPrice;
		
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the Movie Name :");
		String movieName=sc.nextLine();
		System.out.println("Enter the number of ticket  :");
		int noOfticket=sc.nextInt();
		int ticketPrice=getTicketDetails(movieName);
		
		int totalCost=ticketPrice*noOfticket;
		System.out.println("Enter a movie name: "+movieName);
		System.out.println("Enter a ticket price: "+ticketPrice);
		System.out.println("Enter a number of tickets: "+noOfticket);
		System.out.println("Total of cost: "+totalCost+"₹");
	}

	
}
