package task3;
class First{
	public void disp()
	{
		System.out.println("hi");
	}
}
class Second extends First{
	public void disp()
	{
		System.out.println("chennai");
	}
}
class Third extends First{
	public void disp()
	{
		System.out.println("sightspectrum");
	}
}
public class HybridInheritance extends Third {
public static void main(String[] args) {
	Third t=new Third();
	t.disp();
}
}
