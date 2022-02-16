package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {
	
    
	public static void main(String[] args) {
		
		//To launch browser 
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//launch URL
		driver.get("https://www.facebook.com/");
		
		//get the title of url		
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//maximize window
		driver.manage().window().maximize();
		
		//close browser - it will close the UI
		driver.close();
		
		//quit browser - it will kill the chrome.exe
		driver.quit();
		
		
	}
	
	

}
