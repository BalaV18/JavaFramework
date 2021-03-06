package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends Base {
	
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;

	public HomePageTest() {
		super();
	}
	
@BeforeMethod
	
	public void setup() {
		initialization();
		
		 loginpage=new LoginPage();
		 contactspage=new ContactsPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
		
		}

@Test(priority=1)

public void verifyHomePageTitleTest() {
	
String homePageTitle=homepage.verifyHomeTitle();

Assert.assertEquals(homePageTitle,"Cogmento CRM","Home Page Title not matched");
	
}

@Test(priority=2)

public void contactsLinkTest() {
contactspage=homepage.clickOnContacts();
	
}


@AfterMethod

public void tearDown() {
	driver.quit();
}

}
