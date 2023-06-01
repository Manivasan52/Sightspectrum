package task4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
public static void main(String[] args) {
	PriorityQueue<String>queue=new PriorityQueue<>();
	queue.add("aaa");
	queue.add("bbb");
	queue.add("ccc");
	Iterator itr=queue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
