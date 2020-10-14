package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signINBtn;
	
	@FindBy(xpath = " //header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement mystorelogo;
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")
	WebElement searchButton;


public IndexPage() {
	PageFactory.initElements(driver, this);
}

public LoginPage clickOnSignIn() throws Throwable {
 Action.click(driver, signINBtn);
 return new LoginPage();
}

public boolean validateLogo() throws Throwable {
	return Action.isDisplayed(driver, mystorelogo);
			
}
public String getMyStoreTitle() {
	String mystoreTitle = driver.getTitle();
	return mystoreTitle;
}

public SearchResultPage searchProduct(String productName) throws Throwable {
	Action.type(searchProductBox, productName);
	Action.click(driver, searchProductBox);
	return new SearchResultPage();
}
}