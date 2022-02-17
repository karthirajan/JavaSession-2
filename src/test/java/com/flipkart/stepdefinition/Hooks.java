package com.flipkart.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before");
		ca.launch("https://www.flipkart.com/");

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		System.out.println("After");
		if (scenario.isFailed()) {
			
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
			
		} else {
			
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");

		}
		
		
		
		driver.quit();

	}

}
