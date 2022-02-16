package org.task;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
		// add helps to store values 
		li.add("java");
		li.add("selenium");
		li.add("project");
		li.add(1, "programms");
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
			
		}
		
		//Size method helps to identify the length of list
		int j = li.size();
		//System.out.println(j);
		
		
		
		// set will help you to override the value
		li.set(1, "protractor");
		li.set(2, "robot");
		
		// equals method will help you to compare two variables
		
		List<String> li1 = new ArrayList<String>();
		li1.add("junit");
		
		boolean equals = li.equals(li1);
		//System.out.println(equals);
		
		// addAll helps to add the values from one variable into another
		
		li1.addAll(li);

		
		//retainAll helps to retain the values 
		
		li1.retainAll(li);
		
		//indexof helps to identify the index of the value
		int i = li1.indexOf("java");
		System.out.println(i);
		
		//lastindexof helps to identify the last index of the value
	
		int k = li1.lastIndexOf("java");
		System.out.println(k);
		
		//contains helps to verify the values are presented or not
		boolean contains = li1.contains("java");
		System.out.println(contains);
		
		//remove helps to delete the particular value
		
         li1.remove(1);
         li1.removeAll(li);
		
		// get values from list
		
				
				
				System.out.println("values from li1");
				for (String x : li1) {
					
					System.out.println(x);
					
				}
		
		
	}

}
