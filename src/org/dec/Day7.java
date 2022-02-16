package org.dec;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		// maximize
		driver.manage().window().maximize();
		
		//Dynamic webtable handling
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			
			List<WebElement> tDatas = tRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				
				String value = tDatas.get(0).getText();
				//System.out.println(value);
				if(value.contains("Shriram Trans.Fi")) {
					
					String prevClose = tDatas.get(2).getText();
					System.out.println("Shriram Trans.Fi prev close value :"+prevClose);
					break;
					
				}else if(value.contains("CESC Ltd")) {
					
					String prevClose = tDatas.get(2).getText();
					System.out.println("CESC Ltd prev close value :"+prevClose);
					break;
				}
				
			}
			
			
			
		}
		
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(".//screenshot//webtable.png");
		
		FileUtils.copyFile(source, dest);
		
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   
		   File source1 = tk.getScreenshotAs(OutputType.FILE);
			
			File dest1 = new File(".//screenshot//webtable1.png");
			
			FileUtils.copyFile(source1, dest1);
		
		driver.quit();
		
	}

}
