package Task3;
class Student
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class Enacpsulation {
public static void main(String[] args) {
	Student e=new Student();
	e.setName("sightspectrum");
	System.out.println(e.getName());
}
}
