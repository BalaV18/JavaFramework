package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;



public class HomePage extends Base {
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement homeLogo;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/a[1]/span[1]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),Deals)]")
	WebElement dealsLink;
	
	public HomePage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	public String verifyHomeTitle() {
	 return	driver.getTitle();
	}
	 
	 public ContactsPage clickOnContacts() {
		 
		 contactsLink.click();
		 
		 return new ContactsPage();
		 
	 }
		 
	}
	
	
	


