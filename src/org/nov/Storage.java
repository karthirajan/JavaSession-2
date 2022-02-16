package org.nov;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		
		
		//To store value in list -- add();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(20);
        
         
         List<Integer> li1 = new ArrayList<>();
         li1.add(100);
                
         //to copy value from one list into an another list -- addAll
         li1.addAll(li);
         
         for (int i = 0; i < li1.size(); i++) {
        	 
        	 System.out.println(li1.get(i));
			
		}
         
       
       //to remove entirely
       li1.retainAll(li);
       
       System.out.println("After remove all");
       
       for (int i = 0; i < li1.size(); i++) {
      	 
      	 System.out.println(li1.get(i));
			
		}
       
       //contains
       boolean c = li1.contains(20);
       System.out.println(c);
		
		
	}

}
