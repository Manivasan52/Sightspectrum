package task2;

public class NumberPattern {
public static void main(String[] args) {
	int row=7;
	for(int i=0;i<row;i++)
	{
		int num=1;
		for(int j=0;j<=i;j++)
		{
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
}
}
