package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeltaPOM {

	WebDriver driver;
	
	public DeltaPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@data-qaid=\"TrueBlue\"]")
	WebElement click_TrueBlue;
	public WebElement TrueBlue() {
		return click_TrueBlue;
	}
	
	@FindBy (xpath="//a[@data-qaid=\"Join today\"]")
	WebElement click_Jointoday;
	public WebElement Jointoday() {
		return click_Jointoday;
		
	}
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement enter_text;
	public WebElement text() {
		return enter_text;
	}
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement click_submit;
	public WebElement submit() {
		return click_submit;
	}
	
	
	@FindBy( xpath="///a[@class=\"call\"]") 
	WebElement click_call;
	public WebElement call() {
		return click_call;
		
	}
	

}
