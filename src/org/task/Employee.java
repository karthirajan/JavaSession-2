package org.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	
	
	private String emp;
	
	
	
	
	public String getEmp() {
		return emp;
	}





	public void setEmp(String emp) {
		this.emp = emp;
	}





	public static void main(String[] args) {
		
		    B b = B.getInstance();
		    System.out.println(b);
		    
		    B b1 = B.getInstance();
		    System.out.println(b1);
		
		EmployeeDatas e = new EmployeeDatas();		
		e.setName("sunita");
		e.setId(1342432);
		e.setPhno(544244222l);
		
		EmployeeDatas e1 = new EmployeeDatas();
		e1.setName("java");
		e1.setId(454333);
		e1.setPhno(97876453343l);
		
		//user defined map
		
		Map<Integer,EmployeeDatas> m = new HashMap<>();
		m.put(1, e);
		m.put(2, e1);
		
		Set<Entry<Integer, EmployeeDatas>> entrySet = m.entrySet();
		for (Entry<Integer, EmployeeDatas> x : entrySet) {
			
			System.out.println(x.getKey()+"  "+x.getValue().getId());
			System.out.println(x.getKey()+"  "+x.getValue().getName());
			System.out.println(x.getKey()+"  "+x.getValue().getPhno());
			
		}
		
		
		
	}

}
