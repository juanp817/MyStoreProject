package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.basepackage.BaseClass;

public class OrderConfirmation extends BaseClass {
	
	@FindBy(xpath=("//strong[contains(text(),'Your order on My Store is complete.')]"))
	 WebElement confirmMessage;
	
	public OrderConfirmation() {
		PageFactory.initElements(driver, this);


}
	public String validateConfirmMessage() {
		String confirmMsg = confirmMessage.getText();
		return confirmMsg;
	}
	
	
}

