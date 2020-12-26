package com.nexttech.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class facebookPom {
		WebDriver driver;
		 
		
		public  facebookPom (WebDriver driver) {
		  this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }

		 @FindBy(name="firstname")
		WebElement edit_firstname;
		public WebElement firstname() {
		return edit_firstname;
				}
	
		 @FindBy(name="lastname")
		WebElement edit_lastname;
		public WebElement lastname() {
		return  edit_lastname;
					}
		 @FindBy(name="reg_email__")
		WebElement edit_email;
		public WebElement email() {
		return  edit_email;
		}
		
	
		@FindBy(id="password_step_input")
		 WebElement edit_password;
		 public WebElement password() {
		 return  edit_password;
							}
							
		 @FindBy(id="month")
		public WebElement click_month;
							
							 
		 @FindBy(id="day")
		public WebElement click_day;
										
											
		 @FindBy(id="year")
		public WebElement click_year;
										
								 
								 
								 
								 
										 }			 
								 
