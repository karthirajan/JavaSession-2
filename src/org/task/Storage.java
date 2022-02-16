package org.task;

public class Storage {
	
	
	final static String s = "java";
	
	public static void main(String[] args) {
		
		
		
		
	
		
		//lesenium
		
	   char ch;
	   char ch1;
	   String S1 = "";
	   String S2 = "";
		
		for (int i = 2; i >= 0; i--) {
			
			 ch = s.charAt(i);
			
			
	
			S1 = S1 + ch;
			
		}
		
		
		
		for (int i = 3; i < s.length(); i++) {
			
			 ch1 = s.charAt(i);
			 S2 = S2 + ch1;
			
		}
		
		
		System.out.println(S1+S2);
		
	}

}
