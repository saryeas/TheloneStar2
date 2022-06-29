package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginPOM {
	 WebDriver driver;
	 public   FBloginPOM(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 // @FindBy(xpath="//input[@name=\"email\"]")
	// WebElement edit_email;
	// public WebElement email() { 
	//  return edit_email;  }
	
	 
	 @FindBy(xpath="//input[@name=\"pass\"]")
	
	 WebElement edit_password;
	 public WebElement password() { 
	  return edit_password;
	  }
	 @FindBy(xpath="//*[@name=\"login\"]")
	 WebElement click_login;
	 public WebElement login() { 
	  return  click_login;
	  }
	 
	 
	 @FindBy (xpath= "//input[@name=\"email\"]")
	 WebElement click_name;
	 public WebElement name () {
		 return click_name;
	 }
	 
	 
	 
	 
	 
}
