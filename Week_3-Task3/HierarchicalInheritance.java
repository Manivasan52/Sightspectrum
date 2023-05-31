package task3;
class Dog{
	public void motherDog()
	{
		System.out.println("mother dog");
	}
} 
class Babydog extends Dog{
	public void babyDog()
	{
		System.out.println("baby dog");
	}
}
class Anotherbabydog extends Dog{
	public void anotherDog()
	{
		System.out.println("Another dog");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Anotherbabydog d=new Anotherbabydog();
		d.motherDog();
		d.anotherDog();
	}

}
