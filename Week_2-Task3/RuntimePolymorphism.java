package Task3;
class bike{
	public void hero()
	{
		System.out.println("herohonda");
	}
}
class showroom extends bike
{
	public void hero()
	{
		System.out.println("Chennai");
	}
}
public class RuntimePolymorphism {
public static void main(String[] args) {
	bike sh=new showroom();
	sh.hero();
	}
}
