package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//no return type
public class DatawithoutPOM {
	     //global driver
	WebDriver driver;
	                                //local driver
		 public  DatawithoutPOM(WebDriver driver) {
		  this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
		// 3 way we can indentify constructor
		// no return type
				 //its not a method but special type method
				 //constructor method name same as class name

		 @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
		 WebElement click_bestsellers;
		public WebElement bestsellers() {
		return click_bestsellers;
		}
		
		 
		
}
