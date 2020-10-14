package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.basepackage.BaseClass;
import com.mystore.pageobject.IndexPage;

public class IndexPageTest extends BaseClass {
	IndexPage indexPage;
	
	@BeforeMethod
	public void setup() {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	public void verifyLogo() throws Throwable {
		 indexPage = new IndexPage();
	boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void verifyTitle()  throws Throwable {
		String actualtitle = indexPage.getMyStoreTitle();
		//Assert.assertEquals(actualtitle, "My Store");
		System.out.println(actualtitle);
	}
}
