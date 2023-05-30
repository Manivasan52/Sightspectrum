package task2;

public class DownWardTriangleProgram {
public static void main(String[] args) {
	int i,j,row=7;
	for(i=row-1;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}
