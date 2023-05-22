package gui;
public class Recursion {
	static int count=0;
	public static void print()
	{
		count++;
		if(count<=5)
		{
			System.out.println("sightspectrum :"+count);
			print();
		}
	}
public static void main(String[] args) {
	print();
}
}
