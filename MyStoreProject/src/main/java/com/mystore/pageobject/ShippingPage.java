package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class ShippingPage extends BaseClass {

	@FindBy(xpath="//*[@id='cgv']")
	WebElement terms;
	
	@FindBy(xpath="//*[@id='cgv']")
	WebElement proceedToCheckoutBtn;
	
	public  ShippingPage() {
		PageFactory.initElements(driver, this);
}
	public PaymentPage clickOnProceedtoCheckOut() {
		Action.click(driver, proceedToCheckoutBtn);
		return new PaymentPage();
	}
	
	public void checkTheTerms() throws Throwable{
		Action.click(driver, terms);
	}
}
