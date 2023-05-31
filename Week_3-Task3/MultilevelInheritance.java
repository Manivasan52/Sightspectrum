package task3;
class babydog
{
	public void bdog()
	{
		System.out.println("wow");
	}
}
class dog extends babydog{
	public void bigDog() {
		System.out.println("wowwwww");
	}
}
class Animal extends dog{
	public void animal()
	{
		System.out.println("animal ");
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	Animal a=new Animal();
	a.bdog();
	a.bigDog();
	a.animal();
}
}
