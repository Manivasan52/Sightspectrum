package task4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<String>set=new LinkedHashSet<>();
		set.add("abc");
		set.add("bca");
		set.add("cba");
		Iterator<String >itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
