package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

public class OrderSummary extends BaseClass {
 
		@FindBy(xpath=("//span[contains(text(),'I confirm my order')]"))
		 WebElement confirmBtn;
		
		public OrderSummary() {
			PageFactory.initElements(driver, this);
 
}
		
		 public OrderConfirmation confrimOrder() throws Throwable{
			 Action.click(driver, confirmBtn);
			 return new OrderConfirmation();
		 }
		
}
