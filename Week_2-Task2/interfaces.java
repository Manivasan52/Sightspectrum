package Task2;
interface declares{
	void add();
	void learn();
}
public class interfaces implements declares{
	public void add()
	{
		System.out.println("sightspectrum");
	}
	public void learn()
	{
		System.out.println("chennai");
	}
public static void main(String[] args) {
	interfaces in=new interfaces();
	in.add();
	in.learn();
}
}
