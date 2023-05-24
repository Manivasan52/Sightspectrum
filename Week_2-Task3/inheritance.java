package Task3;
class a
{
	public void run()
	{
		System.out.println("sightspectrum ");
	}
}
class b extends a
{
	public void print()
	{
		System.out.println("chennai");
	}
}
public class inheritance {
public static void main(String[] args) {
	b bb=new b();
	bb.print();
	bb.run();
}
}
