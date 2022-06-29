package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class BaseClass {
	WebDriver driver;//global variable

	
	@Given("^User visit FB homepage$")
	public void user_visit_FB_homepage() throws Throwable {
		//how to open browser
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
	                    //how to open url      driver.get method
	    driver.get("https://www.facebook.com/");
	   }
}
