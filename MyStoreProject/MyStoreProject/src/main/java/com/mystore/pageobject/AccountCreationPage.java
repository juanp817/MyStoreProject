package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='customer_firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//h1[contains(text(),'Create an account')]")
			WebElement createAnAccount;
	
	@FindBy(xpath = "//*[@id=\'customer_lastname\']")
	WebElement lastName;
	
	@FindBy(xpath= "//*[@id=\"email\"]")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Pswrd;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validatAccountCreationPage() throws Throwable {
		return Action.isDisplayed(driver, createAnAccount);
		
		
		
	}
		
}
