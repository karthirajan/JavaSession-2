package org.dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To handle dynamic frames
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for (int i = 0; i < frames.size(); i++) {
			
			driver.switchTo().frame(i);
			try {
				WebElement img = driver.findElement(By.xpath("(//img[contains(@src,'Jmeter720.png')])"));
				img.isDisplayed();
				img.click();
				break;
			}catch (Exception e) {
				
				
				
			}
			
		}
		
		driver.switchTo().defaultContent();
		
		WebElement image = driver.findElement(By.xpath("//h3[contains(text(),'iFrame')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", image);
		
		String text = image.getText();
		System.out.println(text);
		
		//index
		driver.switchTo().frame(1);
		
		//id
		driver.switchTo().frame("a077aa5e");
		
		//name
		driver.switchTo().frame("a077aa5e");
		
		//webelement
		WebElement frame = driver.findElement(By.xpath("//iframe[@scrolling='no']"));
		driver.switchTo().frame(frame);
		
		WebElement img = driver.findElement(By.xpath("(//img[contains(@src,'Jmeter720.png')])"));
		img.isDisplayed();
		
		//coming back to parent frame
		driver.switchTo().parentFrame();
		
		//coming back to main frame
		driver.switchTo().defaultContent();
		
		WebElement email = driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("karthi");
		
	}

}
