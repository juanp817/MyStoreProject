package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath= "//span[contains(text(),'My wishlists')]")
			WebElement myWishList;
	@FindBy(xpath = "//span[contains(text(),'Order history and details')]" )
			WebElement orderHistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validateMyWishList() {
	return Action.isDisplayed(driver, myWishList);
		
	}
	public void validateOrderHistory() {
		Action.isDisplayed(driver, orderHistory);
		
	}
	
	
}
