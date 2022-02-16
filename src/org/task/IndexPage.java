package org.task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndexPage {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> m = new HashMap<>();
		
		//put helps to store values in map
		m.put(1, "Lesson 1");
		m.put(2, "Lesson 2");
		m.put(3, "Lesson 1");
		m.put(null, null);
		m.put(4, null);
		
		System.out.println(m);
		
		//get(key) helps to get values based up on key
		
		System.out.println(m.get(2));
		
		//keySet helps to get only the key data
		Set<Integer> x = m.keySet();
		for (Integer y : x) {
			System.out.println(y);
			
		}
		
		//values helps to get only the value data
		Collection<String> values = m.values();
		for (String x1 : values) {
			
			System.out.println(x1);
			
		}
		
		
		//entrySet helps to iterate key & value in map
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey()+ "=" +entry.getValue());
			
		}
		
		
	}

}