package org.dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3B {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//maximize
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement DASource = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement DATarget = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Thread.sleep(2000);
		//drag and drop
		a.dragAndDrop(DASource, DATarget).build().perform();
		
		
	}

}
