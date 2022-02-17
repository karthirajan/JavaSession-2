package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	MobilePurchasePage mp = new MobilePurchasePage();
	
	static String mobileName;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		
		System.out.println("launch");
		
		
	}

	@Given("user login by entering crendentials")
	public void user_login_by_entering_crendentials() {
		
          try {
        	  
        	 // WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
			   mp.getLoginButton().isDisplayed();
			   ca.button(mp.getLoginButton());
			
	    	} catch (Exception e) {
			System.out.println("pop up is not displayed");
	    	}
	    
	}

	@When("user search mobile")
	public void user_search_mobile() {
	    
		mobileName = "realme";
		
		ca.insertText(mp.getSearchBar(), mobileName);
		
	}

	@When("user click on the mobile name")
	public void user_click_on_the_mobile_name() {
	    
		 WebElement mobile = driver.findElement(By.xpath("(//div[contains(text(),'"+mobileName+"')])[2]"));   
		  ca.button(mobile);
		   

		
	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() {
	   
		String parentURL = driver.getWindowHandle();
		   
		   Set<String> childURL = driver.getWindowHandles();
		   for (String child : childURL) {
			   
			   if(!parentURL.equals(child)) {
				   
				   driver.switchTo().window(child);
				   
			   }
			
		
		   }
		   
		   
		 //  WebElement atc = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",mp.getAddToCart());
			
			ca.button(mp.getAddToCart());
			
			//driver.quit();
		
	}
	
	@When("user search mobile by one dim list")
	public void user_search_mobile_by_one_dim_list(DataTable dataTable) {
	    
		List<String> asList = dataTable.asList(String.class);
		
		WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys(asList.get(1),Keys.ENTER);
		   
		   mobileName = asList.get(1);
		
	}
	
	@When("user search mobile by one dim map")
	public void user_search_mobile_by_one_dim_map(DataTable dataTable) {
	    
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		
		WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys(asMap.get("1"),Keys.ENTER);
		   
		   mobileName = asMap.get("1");
		
	}


	@When("user search mobile {string}")
	public void user_search_mobile(String mobile) {
		
		WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys(mobile,Keys.ENTER);
		   
		   mobileName = mobile;
	    
	}

}
