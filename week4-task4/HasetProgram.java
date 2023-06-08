package task4;

import java.util.HashSet;
import java.util.Iterator;

public class HasetProgram {
public static void main(String[] args) {
	HashSet<String>hash=new HashSet<>();
	hash.add("set");
	hash.add("set2");
	hash.add("set3");
	hash.add("set4");
	Iterator<String>itr=hash.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
