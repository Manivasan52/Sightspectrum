package task4;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String>map=new TreeMap<>();
		map.put(1,"arun");
		map.put(2,"Ashok");
		map.put(3,"murali");
		map.put(4,"sameer");
		for(Map.Entry i:map.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}

}
