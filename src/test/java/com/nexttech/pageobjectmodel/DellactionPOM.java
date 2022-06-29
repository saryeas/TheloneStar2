package com.nexttech.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {

	 WebDriver driver;
	 public   DellactionPOM(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"l2\"]")
	 WebElement act_Solutions;
	 public WebElement Solutions() { 
	 return act_Solutions;
	  }
	
    @FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/ul/li[1]/a")
    WebElement click_AllSolutions;
    public WebElement AllSolutions() { 
    return click_AllSolutions;
    }
    }


//@FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/button")

///html/body/main/header/div[3]/nav/ul/li[1]/button       full xpath
////*[@id="l2"]
