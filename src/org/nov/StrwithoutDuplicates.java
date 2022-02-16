package org.nov;

import java.util.HashSet;
import java.util.Set;

public class StrwithoutDuplicates {
	
	public static void main(String[] args) {
		
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(20);
		
		for (Integer x : s) {
			
			System.out.println(x);
			
		}
		
		
		
	}

}
