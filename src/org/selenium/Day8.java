package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(fruits);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(3);
			
		s.selectByVisibleText("Orange");
				
		s.selectByValue("banana");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		System.out.println("All Selected");
		for (WebElement x : allSelectedOptions) {
			
			System.out.println(x.getText());
			
		}
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("All Values");
		for (int i = 0; i < options.size(); i++) {
			
			WebElement x1 = options.get(i);
			System.out.println(x1.getText());
			// if apple is presented then you need to select apple
			
		}
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//screenshot//report.png");
		
		FileUtils.copyFile(source, dest);
		
		
		driver.quit();
		
		/*
		 * s.deselectByIndex(0);
		 * 
		 * s.deselectByValue("grape");
		 * 
		 * s.deselectByVisibleText("Orange");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * s.deselectAll();
		 */
		
		
		
	}

}
