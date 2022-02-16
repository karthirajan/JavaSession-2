package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {
	
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		WebElement frame = driver.findElement(By.xpath("//h3[contains(text(),'iFrame')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", frame);
		
		//index
		//driver.switchTo().frame(1);
		
		//id
		//driver.switchTo().frame("a077aa5e");
		
		//name
		//driver.switchTo().frame("a077aa5e");
		
		//webelement
		WebElement insideFrame = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(insideFrame);
		
		WebElement image = driver.findElement(By.xpath("//img[contains(@src,'Jmeter')]"));
		String text = image.getText();
		System.out.println(text);
		
		//parentFrame
		//driver.switchTo().parentFrame();
		
		//defaultContent
		driver.switchTo().defaultContent();
		
		WebElement email = driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("karthi@gmail.com");
		
		//imagine
		/*
		 * driver.switchTo().frame(1); 
		 * driver.switchTo().frame(2);
		 * driver.switchTo().frame(3);
		 *  WebElement image1 =
		 * driver.findElement(By.xpath("//img[contains(@src,'Jmeter')]"));
		 * image1.getText();
		 * driver.switchTo().parentFrame();   3 to 2
		 * driver.switchTo().parentFrame();   2 to 1
		 * driver.switchTo().parentFrame();   1 to main page
		 * driver.switchTo().defaultContent(); 3 to main page
		 * 
		 */
        
		
	}

}
