package org.dec;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		
	    wait.until(ExpectedConditions.visibilityOf(Day));
		
		Select s = new Select(Day);
		s.selectByIndex(0);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		Wait fwait = new FluentWait(driver).
				withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				
		
		WebElement Month = driver.findElement(By.name("birthday_mont"));
		
		 fwait.until(ExpectedConditions.visibilityOf(Month));
		
		Select s1 = new Select(Month);
		s1.selectByValue("6");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1992");
		
		
		
		
		
	}

}
