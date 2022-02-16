package org.dec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("karthi");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("xxxxxxxxx");
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		String login = button.getText();
		System.out.println(login);
		button.click();
		
		String attributeNameValue = button.getAttribute("name");
		System.out.println(attributeNameValue);
		
		
		
		
		//validation
		WebElement errorMessage = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[1]"));
		errorMessage.isDisplayed();
		
		String error = errorMessage.getText();
		System.out.println(error);
		
		String attributeValue = errorMessage.getAttribute("href");
		System.out.println(attributeValue);
		
	}

}
