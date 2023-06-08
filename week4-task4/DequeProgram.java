package task4;

import java.util.*;

public class DequeProgram {

	public static void main(String[] args) {
		Deque<String>queue=new ArrayDeque<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		for(String i:queue)
		{
			System.out.println(i);
		}
	}

}
