package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.nexttech.pageobjectmodel.DellactionPOM;
import com.nexttech.pageobjectmodel.DelproductPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Delproduct {
	WebDriver driver;//global variable
	
	@Given("^USER VISIT DELL HOMEPAGE$")
	public void user_VISIT_DELL_HOMEPAGE() throws Throwable {
		
			//how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
      //soft wait
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		  
					
			//how to open url      driver.get method
		driver.get("https://www.dell.com/en-us");
		  //how to maximize the browser
		 driver.manage().window().maximize();
					       }

	@When("^USER GO TO SERVICES  DROPDOWN MENU AND ABLE TO SEE WARRANTY EXTENTION$")
	public void user_GO_TO_SERVICES_DROPDOWN_MENU_AND_ABLE_TO_SEE_WARRANTY_EXTENTION() throws Throwable {
		
		Actions act =new Actions (driver);
		DelproductPOM  warrenty =new DelproductPOM (driver);
		act.moveToElement(warrenty.Services()).build().perform();         
		warrenty.WarrentyExtention().click();
		
		 //heard wait
		// Thread.sleep(2000);
	}

	@Then("^USER REDERECT TO SERVICES PORTFOLIO$")
	public void user_REDERECT_TO_SERVICES_PORTFOLIO() throws Throwable {
	driver.quit();    
	}



}
