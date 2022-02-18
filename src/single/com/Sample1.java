package single.com;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<>();
		ex.add(100);
		ex.add(100);
		ex.add(200);
		ex.add(300);
	    System.out.println(ex);
	   int k = ex.size();
	   System.out.println(k);
	  int h = ex.get(3);
	  System.out.println(h);
	  for(int i=0; i<ex.size(); i++)
	  {
		  System.out.println(ex.get(i));  
	  }
	  boolean t = ex.contains(300);
	  System.out.println(t);
	  ex.set(2, 1000);
	  System.out.println(ex);
	}
}
