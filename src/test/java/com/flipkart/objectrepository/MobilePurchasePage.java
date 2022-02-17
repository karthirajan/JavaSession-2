package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobilePurchasePage extends Commonactions{
	
	public MobilePurchasePage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement loginButton;
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBys({
		@FindBy(name = "q"),
		@FindBy(id = "search")
	})
	private WebElement searchAndOperator;
	
	
	@FindAll({
		@FindBy(name = "q"),
		@FindBy(id = "search")
	})
	private WebElement searchOrOperator;
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	
	
}
