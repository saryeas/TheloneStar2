package com.nexttech.stepdefs;

import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.FBloginPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBlogin extends BaseClass {

	
@When("^user type valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_type_valid_and_valid(String arg1, String arg2) throws Throwable {
		//create object
		FBloginPOM obj = new 	FBloginPOM (driver);
		obj.name().sendKeys(arg1);
		obj.password().sendKeys(arg2);
		}

	@When("^click login button$")
	public void click_login_button() throws Throwable {
		FBloginPOM obj1 = new FBloginPOM (driver);
		obj1.login().click();
		
	//FBloginPOM obj1 = new 	FBloginPOM (driver);
	//obj1.login().click();
	   
	}

	@Then("^user should be able to enter$")
	public void user_should_be_able_to_enter() throws Throwable {
    driver.quit();
}
}