package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement forgottenPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgottenPassword.getCssValue("font-size");
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		a.moveToElement(forgottenPassword).build().perform();
		
		a.contextClick().build().perform();
		
		WebElement fb = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		a.doubleClick(fb).build().perform();
		
		WebElement userName = driver.findElement(By.cssSelector("input#email"));
		a.sendKeys(userName, "karthi").build().perform();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		a.click(loginButton).build().perform();
		
	}

}
