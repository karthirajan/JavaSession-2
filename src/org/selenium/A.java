package org.selenium;



public class A {
	
	public static A a;
	
	private A() {
		
	}
	
	public static A getInstance() {
		
		if(a == null) {
			
			a = new A();
			
		}
		return a;

	}
	
	

}
