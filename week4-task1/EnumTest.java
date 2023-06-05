package task1;

public class EnumTest {
	Acters a;
public EnumTest(Acters a) {
		this.a=a;
	}
public static void main(String[] args) {
	EnumTest e=new EnumTest(Acters.AJITH);
	e.act();
	
}
private void act() {
	System.out.println("acting");
	
}
}
