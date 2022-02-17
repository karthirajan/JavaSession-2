package com.flipkart.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	//get(url)
	public void launch(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-popup-blocking");
		options.addArguments("start-maximized");
		options.addArguments("headless");
		
		chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(chromeCapabilities);
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	
	public void insertText(WebElement ele,String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
     public void button(WebElement ele) {
		
    	 ele.click();

	}

}
