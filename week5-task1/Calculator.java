package task1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char operators;
		int firstNumber,secondNumber,result=0;
		System.out.println("Choose  The Operator  : +, -, *, /");
		operators=sc.next().charAt(0);
		System.out.println("Enter The First Number :");
		firstNumber=sc.nextInt();
		System.out.println("Enter The Second Number");
		secondNumber=sc.nextInt();
		result=firstNumber+secondNumber;
		sc.close();
		switch(operators)
		{
		case '+':
			result=firstNumber+secondNumber;
			System.out.println("Addition of two numbers :"+firstNumber+"+"+secondNumber+"="+result);
			break;
			
		case '-':
			result=firstNumber-secondNumber;
			System.out.println("Subtraction of two numbers : "+firstNumber+"-"+secondNumber+"="+result );
			break;
			
		case '*':
			result=firstNumber*secondNumber;
			System.out.println("Multiplication of two numbers : "+firstNumber+"*"+secondNumber+"="+result);
			break;
			
		case '/':
			result=firstNumber/secondNumber;
			System.out.println("Division of two numbers : "+firstNumber+"/"+secondNumber+"="+result);
			break;
			
		case '%':
			result=firstNumber%secondNumber;
			System.out.println("Modulus of two numbers"+firstNumber+"%"+secondNumber+"="+result);
			break;
}
}
}