package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;


public class ContactsPage extends Base {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement contactstext;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement createButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement firstName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement lastName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement saveButton;
	
	public ContactsPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	

	public boolean verifyContactstext() {
		
	 return	contactstext.isDisplayed();
		
		
	}
	
	public void createContact(String firstname,String lastname) {
		createButton.click();
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		saveButton.click();	
		
	}
	
	
	
	
	
}
