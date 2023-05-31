package task3;
interface cat {
	public void dog();
	public void run();
}
public class interfaceProgram implements cat
{
	public void dog()
	{
		System.out.println("hi");
	}
	public void run()
	{
		System.out.println("soghtspectrum");
	}
public static void main(String[] args) {
	interfaceProgram i=new interfaceProgram();
	i.dog();
	i.run();
}
}
