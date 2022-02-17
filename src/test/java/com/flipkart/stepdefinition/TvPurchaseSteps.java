  
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

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvPurchaseSteps extends Commonactions{
     
	Commonactions ca = new Commonactions();
	
      static String mobileName;
	@Given("user launces the flipkart appctn")
	public void user_launces_the_flipkart_appctn() {
		
		
		
	}

	@Given("user login by enter valid credentials")
	public void user_login_by_enter_valid_credentials() {
		
		  try {
				
				WebElement a = driver.findElement(By.xpath("//button[text()='✕']"));
				a.isDisplayed();
				ca.button(a);
			} catch (Exception e) {
				System.out.println("Login popup is closed");
			}
	}

	@When("user search the Tv")
	public void user_search_the_Tv() throws InterruptedException {

		mobileName="SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV";
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys("SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV", Keys.ENTER);
		
	}

	@When("user click on the Tv name")
	public void user_click_on_the_Tv_name() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement q = driver.findElement(By.xpath("(//div[contains(text(),'"+mobileName+"')])[1]"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", q);
		//q.click();
		String c = driver.getWindowHandle();
		Set<String> d = driver.getWindowHandles();
		for (String e : d) {
			if (!c.equals(e)) {
				driver.switchTo().window(e);
			}

		}
	}
		

	@Then("user click on add tocart")
	public void user_click_on_add_tocart() {
		WebElement t = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", t);
		j.executeScript("arguments[0].click()", t);
			t.click();
			//driver.quit();
	}
	
	@When("user searching the Tv by one dim list")
	public void user_searching_the_Tv_by_one_dim_list(DataTable dataTable) {
		List<String> aslist = dataTable.asList(String.class);
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys(aslist.get(1), Keys.ENTER);
		
		mobileName=aslist.get(1);
	   
	}


	@When("user searching the Tv by one dim map")
	public void user_searching_the_Tv_by_one_dim_map(DataTable dataTable) {
	   
		Map<String, String> asmap = dataTable.asMap(String.class, String.class);
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys(asmap.get("3"), Keys.ENTER);
	   
		mobileName=asmap.get("3");
		
	}


	@When("user search the Tv {string}")
	public void user_search_the_Tv(String tv) {
	  
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys(tv, Keys.ENTER);
	   
		mobileName=tv;
	}
}


