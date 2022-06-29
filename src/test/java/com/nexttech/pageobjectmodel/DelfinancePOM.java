package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelfinancePOM {
	WebDriver driver;
	 public   DelfinancePOM (WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"l6\"]")
	 WebElement act_Financing;
	 public WebElement Financing() { 
	  return act_Financing;
	  }
	 @FindBy(xpath="//*[@id=\"l6_2\"]/span")
	 WebElement act_ForBussiness;
	 public WebElement ForBusiness() { 
	  return act_ForBussiness;
	  } 
	 @FindBy(xpath="//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[6]/ul/li[2]/ul/li[3]/a")
	 WebElement click_MediumBusinessLarge;
	 public WebElement MediumBusinessLarge() { 
	  return click_MediumBusinessLarge;
	  } 
	 
	 
	 
}
