package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amardeshpom {
	
		 //global driver
		     WebDriver driver;
		                                //local driver
			 public  amardeshpom(WebDriver driver) {
			  this.driver=driver;
			 PageFactory.initElements(driver, this);
			 }
			 
			 @FindBy(id="twotabsearchtextbox")
			 WebElement edit_searchtextbox;
			 public WebElement searchtextbox() {
			 return edit_searchtextbox;
			 }
			 @FindBy(id="nav-search-submit-button")
			 WebElement edit_searchbutton;
			 public WebElement searchbutton() {
			 return edit_searchbutton;
	}
	}

