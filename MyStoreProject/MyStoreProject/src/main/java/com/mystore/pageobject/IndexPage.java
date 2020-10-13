package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class IndexPage extends BaseClass 

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