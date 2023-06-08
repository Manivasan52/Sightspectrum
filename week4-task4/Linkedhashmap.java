package task4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
	map.put(1,"abc");
	map.put(2, "bca");
	map.put(3,"cba");
	for(Map.Entry i:map.entrySet())
	{
		System.out.println(i.getKey()+" "+i.getValue());
	}
}
}
