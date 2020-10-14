package com.mystore.basepackage;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;

	
	//loadconfig method will read before the test runs and will load the configuration file 
	//System.getProperty   ("user.dir") + 
	@BeforeTest
	public void LoadConfig() {
		try {
			prop = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip= new FileInputStream("C:\\Users\\jpereyra\\git\\MyStoreProject\\MyStoreProject\\Configuration\\Config.properties");
			prop.load(ip);
			System.out.println("driver" + driver);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
	public static void LaunchApp() {
	// we set up chrome driver using wbedriver manager to 
		WebDriverManager.chromedriver().setup();
		//getting browser from properties file - storing string in variable called Browsername
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {	
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));

	}

}