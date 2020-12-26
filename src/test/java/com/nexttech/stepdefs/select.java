package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class select {
	WebDriver driver;
	
	@Given("^user visiting Amazon home page$")
	public void user_visiting_Amazon_home_page() throws Throwable {
		
		//how to open browser
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		        driver = new ChromeDriver();
				
			//soft wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				  
		    //how to open url  / driver.get method
	 driver.get("https://www.amazon.com");
			       
			 //how to maximize the browser
	 driver.manage().window().maximize();
					
				    //heard wait
				   Thread.sleep(2000);
				  }

	
	@When("^user select Apps & Games and click search button$")
	public void user_select_Apps_Games_and_click_search_button() throws Throwable {
	
		Select object = new Select (driver.findElement(By.id("search")));
	    object.selectByVisibleText("Apps & Games");
		
		
	//	Select set = new Select (click_searchDropdown);
	// set.selectByIndex(arg0);
	
	
	}

		
@Then("^user will redirect to  Apps & Games page$")
	public void user_will_redirect_to_Apps_Games_page() throws Throwable {

}
}