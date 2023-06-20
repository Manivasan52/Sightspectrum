package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayList {
	public static HashMap<Integer,Integer>countFrequency(ArrayList<Integer>list)
{
	HashMap<Integer,Integer>hashmap=new HashMap<>();
	for(int num:list)
	{
		if(hashmap.containsKey(num))
		{
			int hash=hashmap.get(num);
			hashmap.put(num, hash+1);
			
		}
		else
		{
			hashmap.put(num, 1);
		}
		
	}
	return hashmap;
	
}
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		HashMap<Integer, Integer>hashmap=countFrequency(list);
		for(Map.Entry<Integer, Integer>entry: hashmap.entrySet())
		{
			System.out.println("elements :"+entry.getKey()+"frequency :"+entry.getValue());
		}
	}

}
