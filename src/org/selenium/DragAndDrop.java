package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement bankLoc = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement bankAmtLoc = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement bankAmtDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement salesLoc = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement salesDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement salesAmtLoc = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement salesAmtDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(bankLoc, bankDes).build().perform();
		a.dragAndDrop(bankAmtLoc, bankAmtDes).build().perform();
		
		a.dragAndDrop(salesLoc, salesDes).build().perform();
		a.dragAndDrop(salesAmtLoc, salesAmtDes).build().perform();
		
		WebElement validation = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		boolean displayed = validation.isDisplayed();
		System.out.println(displayed);
		
		String value = validation.getText();
		
		if(value.equals("Perfect!")) {
			System.out.println("condition satisfied");
		}else {
			System.out.println("condition fail");
		}
		
		driver.quit();
		
	}

}
