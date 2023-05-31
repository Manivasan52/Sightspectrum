package task3;
class subclass{
	float salary=40000;
}
public class inheritance extends subclass{
	int bonus=1000;
	public static void main(String[] args) {
		
		inheritance i=new inheritance();
		System.out.println("bonus: "+i.bonus);
		System.out.println("salary :"+i.salary);
	}
}