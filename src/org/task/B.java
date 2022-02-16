package org.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
	
	public static B b = null;
	
	private B() {
		
	}
	
	public static B getInstance() {
		
		if(b == null) {
			b = new B();
		}
		
		return b;
		

	}
		
	public static void main(String[] args) {
		
		
		
        B b1 = getInstance();
        System.out.println(b1);
	 
	}
	
}
