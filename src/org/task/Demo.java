package org.task;

public  class Demo {
	
	public Demo(){
	
		System.out.println("default");
		
	}
	
   public Demo(int i){
		this("ssdsd");
		System.out.println(" int argument :"+i);
		
	}
   
   public Demo(String i){
		
		System.out.println("string argument :"+i);
		
	}
   
   public boolean tester(String value) {
	
	   boolean b = false;
	   
	   if(value.equals("Hi")) {
		   
		   b = true;
		   
	   }
	   
	   return b;

   }
   
   public boolean tester(int value) {
		
	   boolean b = false;
	   
	   if(value == 20) {
		   
		   b = true;
		   
	   }
	   
	   return b;

   }
	
	public static void main(String[] args) {
	
		Demo d = new Demo();
		
		boolean i = d.tester("Hiii");
		
		System.out.println(i);
		
		
	}
	
	
}
