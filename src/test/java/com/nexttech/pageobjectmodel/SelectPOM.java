package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPOM {
	     WebDriver driver;
		
	     public  SelectPOM (WebDriver driver) {
			  this.driver=driver;
			 PageFactory.initElements(driver, this);
			 }
		 
		
		 @FindBy(xpath="//input[@value=\"Go\"]")
		
		 public WebElement click_search;
		

	}

