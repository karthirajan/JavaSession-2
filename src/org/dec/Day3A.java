package org.dec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Day3A {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// maximize
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//sendkeys
		js.executeScript("arguments[0].setAttribute('value','karthirajan')", username);
		
		//click
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", button);
		
		//wait until page load
		js.executeScript("return document.readyState");
		
		
		
		
		
		
		

		/*
		 * //actions sendkeys Actions a = new Actions(driver); a.sendKeys(username,
		 * "karthirajan").build().perform();
		 * 
		 * //actions click
		 * 
		 * WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		 * a.click(button).build().perform();
		 * 
		 * Thread.sleep(7000);
		 * 
		 * //actions doubleclick WebElement username2 =
		 * driver.findElement(By.xpath("//input[@value='karthirajan']"));
		 * a.doubleClick(username2).build().perform();
		 * 
		 * //actions mouseover WebElement forgotten =
		 * driver.findElement(By.xpath("(//a[text()='Not you?'])"));
		 * a.moveToElement(forgotten).build().perform();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * //actions contextclick or rightclick a.contextClick().build().perform();
		 * 
		 * 
		 * //Robot
		 * 
		 * Robot r = new Robot();
		 * 
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_DOWN);
		 * r.keyRelease(KeyEvent.VK_DOWN);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * 
		 * //Typecast
		 * 
		 * 
		 * 
		 * //Entire body
		 * 
		 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * 
		 * //WebElement
		 * 
		 * WebElement english =
		 * driver.findElement(By.xpath("//li[text()='English (UK)']"));
		 * 
		 * js.executeScript("arguments[0].scrollIntoView(true)", english);
		 * 
		 * //Thread.sleep(2000);
		 * 
		 * //scroll up js.executeScript("arguments[0].scrollIntoView(false)",
		 * forgotten);
		 * 
		 * //Offset js.executeScript("window.scrollTo(0,100)");
		 */

	}

}
