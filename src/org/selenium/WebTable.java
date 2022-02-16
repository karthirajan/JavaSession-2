package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		//findElements
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		
			for(int i = 1; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
			
			List<WebElement> datas = row.findElements(By.tagName("td"));
			String text = datas.get(0).getText();
			
			if(text.equals("Dewan Housing")) {
			WebElement data = datas.get(3);
			System.out.println(data.getText());
			break;
			}else {
				System.out.println("Dewan Housing is not in the list");
				
			}
		
		
	}}

}
