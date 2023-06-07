package task3;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println(4<1 && 5<1);
		System.out.println(3<1 && 9>1);
		System.out.println(4<1 && 1<7);
		
		System.out.println(3<1 ||6>1);
		System.out.println(6>3 || 5>1);
		System.out.println(8<1 || 7>1);
		
		System.out.println(!(4==4));
		System.out.println(!(3==2));
		System.out.println(!(4<7));
		
	}

}
