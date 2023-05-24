package Task3;
abstract class add{
	abstract void print();
	{
		System.out.println("hi sightspectrum");
	}
}
public class Abstraction extends add {
	public void print()
{
	System.out.println("chennai");
}
public static void main(String[] args) {
	add a=new Abstraction();
	a.print();
}
}
