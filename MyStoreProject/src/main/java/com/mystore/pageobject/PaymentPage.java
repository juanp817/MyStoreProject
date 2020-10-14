package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath="//a[contains(text(),'Pay by bank wire')]")
	WebElement bankWireMethod;
	

	@FindBy(xpath="//a[contains(text(),'Pay by check')]")
	WebElement payByCheckMethod;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}


public OrderSummary clickOnPaymentMethod() throws Throwable {
	Action.click(driver, bankWireMethod);
	return new OrderSummary();
}

	

}