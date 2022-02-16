package org.dec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		// maximize
		driver.manage().window().maximize();
		
		WebElement CusID = driver.findElement(By.name("cusid"));
		CusID.sendKeys("342332");
		
		WebElement submit = driver.findElement(By.name("submit"));
		Thread.sleep(500);
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		submit.click();
		
		Alert alert1 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert1.accept();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert2.getText());
		alert2.accept();
		
		
		
		
	}

}
