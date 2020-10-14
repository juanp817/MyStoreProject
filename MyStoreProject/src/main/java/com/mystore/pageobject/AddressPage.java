package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class AddressPage extends BaseClass {

	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
		WebElement proceedToCheckout;		

	
	public  AddressPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	public ShippingPage clickOnCheckOut() {
		Action.click(driver, proceedToCheckout);
		return new ShippingPage();
		
	}
	
	
	
}

