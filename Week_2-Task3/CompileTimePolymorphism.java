package Task3;
class adds
{
	public void getSolve(int a,int b, int c)
	{
		System.out.println(a+b);
	}

}
public class CompileTimePolymorphism extends adds {
	public void getSolve(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	CompileTimePolymorphism a=new CompileTimePolymorphism ();
	a.getSolve(10,20,30);
	a.getSolve(10, 20,0);
}
}
