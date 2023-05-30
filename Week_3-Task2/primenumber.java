package task2;

public class primenumber {
public static void main(String[] args) {
	int number=11;
	boolean flag=false;
	for(int i=2;i<number;i++)
	{
		if(number%2==0)
		{
			flag=true;
			break;
		}
	}
	if(!flag)
	{
		System.out.println("primenumber"+number);
	}
	else
	{
		System.out.println("not prime number"+number);
	}
}
}
