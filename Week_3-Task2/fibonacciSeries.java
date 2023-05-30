package task2;

public class fibonacciSeries {
public static void main(String[] args) {
	int n1=0,n2=1,n3,count=10;
	System.out.println(n1+" "+n2);
	for(int i=1;i<=count;i++ ) {
		n3=n1+n2;
		System.out.println("fibonacci :"+n3);
		n1=n2;
		n2=n3;
	}
}
}
