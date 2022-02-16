package org.selenium;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Day6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 //  Thread.sleep(2000);
		  
		   
		   try {
			   
			   WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
			   button.isDisplayed();
			   button.click();
			
	    	} catch (Exception e) {
			System.out.println("pop up is not displayed");
	    	}
		   
		   
		   WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys("Mobiles",Keys.ENTER);
		   
		 //  Thread.sleep(2000);
		  

		   
		   WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'realme')])[2]"));
		   
		    
		   
		   mobileName.click();
		   
		   String parentURL = driver.getWindowHandle();
		   
		   Set<String> childURL = driver.getWindowHandles();
		   for (String child : childURL) {
			   
			   if(!parentURL.equals(child)) {
				   
				   driver.switchTo().window(child);
				   
			   }
			
		
		   }
		   
		  // Thread.sleep(1000);
		   
		   WebElement mobileName2 = driver.findElement(By.xpath("//span[contains(text(),'realme')]"));
		   String name = mobileName2.getText();
		   System.out.println(name);
		   
		   driver.switchTo().window(parentURL);
		   
		  // Thread.sleep(1000);
		   
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   
	}

}
