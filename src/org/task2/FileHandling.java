package org.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\admin\\Desktop\\JavaFile\\A\\B\\Demo.txt");
		
		//If you want to read text file
		
	   FileReader f1 = new FileReader(f);
	   
	   char[] a =new char[100];
		
		f1.read(a);
		
		for (char c : a) {
			
			System.out.print(c);
			
		}
		
		
		
	}

}
