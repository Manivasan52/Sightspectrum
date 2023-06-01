package task4;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlist {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<>();
	list.add("chennai");
	list.add("hi");
	list.add("sightspectrum");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
