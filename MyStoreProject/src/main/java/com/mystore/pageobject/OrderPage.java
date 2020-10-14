package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class OrderPage extends BaseClass {
	
	
	@FindBy(xpath="//td[@class='cart_unit']/span/span")
		WebElement unitPrice;
	
	@FindBy(xpath="\"//span[@id='total_price']")
	WebElement totalPrice;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedtoCheckoout;
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
		String totalPrice1=unitPrice.getText();
		String tot=totalPrice1.replaceAll("[^a-zA-z0-9]", "");
		double finalTotalPrice=Double.parseDouble(tot);
		return finalTotalPrice/100;
	}
	public double getTotalPrice() {
		String totalprice1=unitPrice.getText();
		String tot=totalprice1.replaceAll("[^a-zA-z0-9]", "");
		double finalTotalPrice=Double.parseDouble(tot);
		return finalTotalPrice/100;
		
		//41:11 https://www.youtube.com/watch?v=XNxeuHArBpc&t=1364s
		
	}
	public LoginPage clickOnCheckout() {
		Action.click(driver, proceedtoCheckoout);
		return new LoginPage();
	}
	
	
}


