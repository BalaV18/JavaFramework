package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class Base {
	
public	static WebDriver driver;
public	static Properties prop;
	
	
	
public Base() {
	
	try {
		prop=new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\Bala Venkatesh\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
		prop.load(ip);
	}
	
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	catch(IOException e) {
		e.printStackTrace();
	}
	
}

public static void initialization() {
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala Venkatesh\\eclipse-workspace\\FreeCRMTest\\src\\main\\resources\\Chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	
	else if(browserName.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bala Venkatesh\\Downloads\\geckodriver");	
	
		driver=new FirefoxDriver();
}

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_TIMEOUT,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    
    
	
}
}

