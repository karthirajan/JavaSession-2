package org.dec;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		// maximize
		driver.manage().window().maximize();
		
		try {
			
			WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
			close.click();
			
		}catch (Exception e) {
			
			System.out.println("Close button is not displayed");
			
		}
		
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("realme mobile",Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'realme')])[3]"));
		mobileName.click();
		
		Thread.sleep(2000);
		
		//getWindowHandle - parent url
		String parentURL = driver.getWindowHandle();
		
		//getWindowHandles - all parent & child url
		Set<String> windowHandles = driver.getWindowHandles();
		for (String childURL : windowHandles) {
			
			if(!parentURL.equals(childURL)) {
			
				driver.switchTo().window(childURL);
				
			}
			
		}
		
		Thread.sleep(2000);
		
		WebElement atc = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",atc);
		
		atc.click();
		
		//again coming back to parent window
		
		driver.switchTo().window(parentURL);
		
	}

}
