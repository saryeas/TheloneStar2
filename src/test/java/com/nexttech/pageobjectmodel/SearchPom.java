package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPom {
	WebDriver driver;
	 public  SearchPom(WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//input[@class=\"mh-search-input\"]")
	WebElement edit_search;
	 public WebElement search() {
			return edit_search;
			}
	 
	 
	 
	 @FindBy(xpath="//span[@class=\"mh-search-button-label\"]")
	 WebElement click_searchbutton;
	public WebElement searchbutton() {
	return click_searchbutton;
	
	
	}


}