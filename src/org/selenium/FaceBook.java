package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * WebElement userName = driver.findElement(By.id("email"));
		 * userName.sendKeys("karthirajan@gmail.com");
		 * 
		 * WebElement password = driver.findElement(By.name("pass"));
		 * password.sendKeys("76544432");
		 * 
		 * WebElement loginButton = driver.findElement(By.name("login"));
		 * loginButton.click();
		 */
		
		//TypeCast
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('karthi','optional value')", userName);
		
		
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("76544432");
		String attribute = password.getAttribute("data-testid");
		System.out.println(attribute);
		
		 WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		 js.executeScript("arguments[0].click();", loginButton);
		
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * 
		 * WebElement view =
		 * driver.findElement(By.xpath("//span[text()=' Facebook © 2021']"));
		 * 
		 * js.executeScript("arguments[0].scrollIntoView();",view);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement up = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 * js.executeScript("arguments[0].scrollIntoView();",up);
		 */
		
		/*
		 * WebElement loginButton =
		 * driver.findElement(By.xpath("//button[text()='Log In']"));
		 * loginButton.click();
		 * 
		 * 
		 * 
		 * 
		 * WebElement forgotten =
		 * driver.findElement(By.xpath("//div[contains(text(),'The password that ')]"));
		 * String text = forgotten.getText(); System.out.println(text);
		 * 
		 * 
		 * Actions a = new Actions(driver); a.contextClick().build().perform();
		 * 
		 * Robot r = new Robot(); r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(100);
		 * r.keyRelease(KeyEvent.VK_DOWN);
		 * 
		 * r.keyPress(KeyEvent.VK_ENTER); Thread.sleep(100);
		 * r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * r.keyPress(KeyEvent.VK_ENTER); Thread.sleep(100);
		 * r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_F);
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyRelease(KeyEvent.VK_F);
		 */
		
	}

}
