package com.nexttech.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelproductPOM {
	WebDriver driver;
	
	public  DelproductPOM  (WebDriver driver) {
	       this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"l3\"]")
	WebElement act_Services;
	public WebElement Services() {
	return act_Services;
		}
		
	 @FindBy(xpath="//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[3]/ul/li[2]/a")
	WebElement click_WarrentyExtention;
	public WebElement WarrentyExtention() {
	return click_WarrentyExtention;
		}
	 

}
