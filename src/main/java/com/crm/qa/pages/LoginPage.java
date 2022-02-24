package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;


public class LoginPage extends Base {
   
	LoginPage loginpage;
	HomePage homepage;
	
	
	
	// Object Repository for LoginPage
	
	
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginButton;
	
	//@FindBy(xpath="//input[@type='submit']")
	//WebElement loginButton;
	
	//@FindBy(xpath="//button[contains(text(),'Login')]")
	//WebElement loginButton;

	
// Initializing the objects present in the page	
public LoginPage() {
	
	PageFactory.initElements(driver,this);
	
}

public HomePage login(String un,String pwd)  {
	email.sendKeys(un);
	password.sendKeys(pwd);
	System.out.println("User creds Entered");
	loginButton.click();
	
	return new HomePage();
	
	
}


}


