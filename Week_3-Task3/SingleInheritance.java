package task3;
class employee{
	public void print()
	{
		System.out.println("hi ");
	}
}
class company extends employee{
	public void run()
	{
		System.out.println("sightspectrum");
	}
}
public class SingleInheritance {
public static void main(String[] args) {
	company cm=new company();
	cm.print();
	cm.run();
}
}
