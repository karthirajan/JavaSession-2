package org.nov;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpDetails {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		//To store values in map ---- put();
		m.put(123, "karthi");
		m.put(123, "java");
		m.put(124, "java");
		m.put(125, "selenium");
		
		System.out.println(m);
		
		
		//to iterate key and value pair --- entrySet();
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> x : entrySet) {
			
			System.out.println(x.getKey()+"="+x.getValue());
			
		}
		
		
		
		
		
		
	}

}
