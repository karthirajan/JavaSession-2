package com.flipkart.stepdefinition;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertyHandling {
	
	public static void main(String[] args) throws Throwable {
		
		Properties prop = new Properties();
		
		FileReader file = new FileReader(".//credentials.properties");
		
		prop.load(file);
		
		System.out.println(prop.get("Username"));
		
	}

}
