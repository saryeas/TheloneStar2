package com.nexttech.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class facebookPom {
		WebDriver driver;
		 public  facebookPom (WebDriver driver) {
		       this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }

		
		@FindBy(xpath="//*[@name=\"firstname\"]")
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
		//*[@id="nav-xshop"]/a[5]
	
		@FindBy(id="password_step_input")
		 WebElement edit_password;
		 public WebElement password() {
		 return  edit_password;
							}
							
	    @FindBy(xpath="//*[@id=\"month\"]")
		public WebElement click_month;
							
							 
		 @FindBy(id="day")
		public WebElement click_day;
										
											
		 @FindBy(id="year")
		public WebElement click_year;
										
		 
		
								 
		
		 
		 
		 
		 
		 
		 // @FindBy(id="year")
		// WebElement Select_year;
		// public WebElement Selectyear() {
		// Select sec = new Select(Select_year);
		// sec.selectByVisibleText("1999");
			//return Select_year;
				}
											
								 
								 
										 		 
								 
