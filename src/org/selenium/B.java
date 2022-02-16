package org.selenium;

public class B {
	
	public static void main(String[] args) {
		
		A a = A.getInstance();
		System.out.println(a);
		
		
		A a1 = A.getInstance();
		System.out.println(a1);
		
	}

}
