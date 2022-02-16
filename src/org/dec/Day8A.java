package org.dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8A {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			
			System.out.println("Drop down values are :"+x.getText());
			
		}
		
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First selected value :"+firstSelectedOption.getText());
		
		
       Thread.sleep(500);
		
		s.deselectByIndex(0);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			
			System.out.println("Selected values are :"+x.getText());
			
		}
		
		
		
		//Thread.sleep(500);
		
		//s.deselectByValue("apple");
		
		//Thread.sleep(500);
		
		//s.deselectByVisibleText("Orange");
		
		s.deselectAll();
		
	}

}
