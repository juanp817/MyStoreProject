/**
 * 
 */
package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.basepackage.BaseClass;

/**
 * @author jpereyra
 *
 */
public class LoginPage extends BaseClass {
	@FindBy(xpath="//*[@id=\'email\']")
	WebElement userName;
	
	@FindBy(xpath="//*[@id=\'passwd\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'SubmitLogin\']/span")
	WebElement Submit;
	
	@FindBy(xpath="	//*[@id=\'email_create\']\r\n")
	WebElement emailForNewAccount;

	@FindBy(xpath="	//*[@id=\'SubmitCreate\']/span\r\n")
	WebElement CreateAccount;
		
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pswd) throws Throwable {
		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(driver, Submit);
		return new HomePage();
	}
	
	public AddressPage login1(String uname, String pswd) throws Throwable {
		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(driver, Submit);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		Action.type(emailForNewAccount, newEmail);
		return new AccountCreationPage();
	}

	
}
