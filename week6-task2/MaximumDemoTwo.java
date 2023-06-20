package task2;

public class MaximumDemoTwo {
	public static int getMaximum(int num1,int num2,int num3)
	{
		int max=num1;
		if(num2>max)
		{
			max=num2;
		}
		if (num3>max)
		{
			max=num3;
			
		}
		return max;
	}
	public static void main(String[] args) {
		int a=10;
		int b=2;
		int c=33;
		int find=getMaximum(a,b,c);
		System.out.println("maximum :"+find);
	}

}
