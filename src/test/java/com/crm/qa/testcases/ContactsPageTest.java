package com.crm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
    String sheetname="CONTACTS";
	public ContactsPageTest() {
		super();
	}
	
@BeforeMethod
	
	public void setup() {
		
	     initialization();
		
		 loginpage=new LoginPage();
		 contactspage=new ContactsPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage=homepage.clickOnContacts();
		
		}

@Test(priority=1)

public void verifyContactsTextTest() {
	
	Assert.assertTrue(contactspage.verifyContactstext(),"Contacts page is not displayed");
	
}

@DataProvider

public Object[][] getContactsTestData() throws InvalidFormatException {
Object data[][]=TestUtil.getTestData(sheetname);
return data;}


@Test(priority=2,dataProvider="getContactsTestData")
public void createContactTest(String firstname,String lastname ) {
	//contactspage.createContact(prop.getProperty("fname"), prop.getProperty("lname"));
	contactspage.createContact(firstname,lastname);
	
}

@AfterMethod

public void tearDown() {
	driver.quit();
}
	
	
}
