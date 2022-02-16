package org.nov;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections4.map.HashedMap;

public class StudentsDetails {
	
	
	public static void main(String[] args) throws IOException {
		
		//welcome = 1
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
	String s = "welcome all to java session to";
	
	char[] x = s.toCharArray();
	
	for (char key : x) { // welcome
		
		if(m.containsKey(key)) {
			
			Integer i = m.get(key);
			m.put(key, i+1);
			
		}else {
			m.put(key, 1);
		}
		
	}
	
	
	System.out.println(m);
	
		
	}

}
