package task4;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String>tree=new TreeSet<>();
		tree.add("d");
		tree.add("b");
		tree.add("a");
		tree.add("c");
		Iterator<String>itr=tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
