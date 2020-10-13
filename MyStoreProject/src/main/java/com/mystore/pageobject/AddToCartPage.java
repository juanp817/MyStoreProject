package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='quantity_wanted']")
	WebElement quantity;
	
	//product succesfully added to cart
	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[1]/h2/text()")
	WebElement addToCartMessage;
	
	@FindBy(xpath = "//span[contains(text(),'proceed to checkout')]")
	WebElement proceedToCheckout;
	
	@FindBy(name="group_1")
	WebElement size;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addToCart;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	
}
	public void enterQuantity(String quantity1) throws Throwable {
		Action.type(quantity, quantity1);
	}
	
	public void selectSize(String size1)throws Throwable  {
			Action.selectByVisibleText(size1, size);
			
	}
	
	public void clickOnAddtoCart()  {
		Action.click(driver, addToCart);
		
	}
	public void validateAddToCart() {
		Action.isDisplayed(driver, addToCartMessage );
	}
	
	public OrderPage clickOnCheckOut() throws Throwable {
		Action.JSClick(driver, proceedToCheckout);
		return new OrderPage();
		
	}
	}
