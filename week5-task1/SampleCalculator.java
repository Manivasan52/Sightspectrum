package task1;

import java.util.Scanner;

public class SampleCalculator {
	public  static void  addition(int firstNumnber,int secondNumber,int resultOne)
	{
		resultOne=firstNumnber+secondNumber;
		System.out.println("Addition of two numbers :"+resultOne);
		}
	public static void  subtraction( int firstNumnber, int secondNumber,int resultTwo)
	{
		resultTwo=firstNumnber-secondNumber;
		System.out.println("Subtraction of two numbers :" + resultTwo);
		}
	public static void  multiplication( int firstNumnber, int secondNumber,int resultThree)
	{
		resultThree=firstNumnber*secondNumber;
		System.out.println("Multiplication of two numbers :" + resultThree);
		}
	public static void  division( int firstNumnber, int secondNumber,int resultFour)
	{
		resultFour=firstNumnber/secondNumber;
		System.out.println("Division of two numbers :" + resultFour);
		}
	public static void main(String[] args) {
		SampleCalculator sc=new SampleCalculator();
		addition(1,2,0);
		subtraction(5,3,0);
		multiplication(3,6,0);
		division(10,3,0);
	}

}
