package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class LoginPageTest extends Base {
	
	LoginPage loginpage;
	HomePage homepage;
	

	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		
		 loginpage=new LoginPage();
		
		
	}
	
	@Test
	
	public void loginTest() {
		
		
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}

}
