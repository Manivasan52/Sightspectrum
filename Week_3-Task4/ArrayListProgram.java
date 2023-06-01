package task4;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
