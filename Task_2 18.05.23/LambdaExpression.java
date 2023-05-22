package task3;
interface drawable{
	public void draw();
}
public class LambdaExpression {
public static void main(String[] args) {
	int width=10;
	drawable d=()->{
		System.out.println("width size "+width);
	};
	 d.draw();  
	
}
}
