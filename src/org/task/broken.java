package org.task;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken {
	
	public static void main(String[] args) {
		
		String hp = "https://www.facebook.com/";
		String url = "";
		HttpURLConnection http = null;
		int responsecode = 200;
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(hp);
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement x : links) {
			
		    url = x.getAttribute("href");
			
			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("url is not configured");
			}
			
			if(!url.startsWith(hp)) {
				System.out.println("url belongs to another application :"+url);
			}
			
			try {
				http = (HttpURLConnection)(new URL(url).openConnection());
				
				http.setRequestMethod("HEAD");
				http.connect();
				
				 responsecode = http.getResponseCode();
				 
				 if(responsecode >= 400) {
					 
					 System.out.println(url + " is a broken link");
					 
				 }else {
					 System.out.println(url +" is a valid one");
				 }
				
				
			}catch (Exception e) {
			
				
			}
			
		}
		
	}

}
