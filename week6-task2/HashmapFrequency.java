package task2;

import java.util.HashMap;
import java.util.Map;

public class HashmapFrequency {

	public static void main(String[] args) {
		String []arr= {"apple","orange","apple","orange"};
		HashMap<String, Integer>map=new HashMap<>();
		for(String element:arr)
		{
			if(map.containsKey(element))
			{
				int frequency=map.get(element);
				map.put(element, frequency+1);
			}
			else
			{
				map.put(element, 1);
			}
		}
		for(Map.Entry<String, Integer>entry: map.entrySet())
		{
			System.out.println("elements:"+entry.getKey()+" frequency:"+entry.getValue());
		}
		
		
	}

}
