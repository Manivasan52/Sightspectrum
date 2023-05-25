package Task4;
import java.util.Scanner;
public class ScannerMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	String str;
	int a;
	str=sc.nextLine();
	a=sc.nextInt();
	System.out.println(str+" "+a);
}
}
