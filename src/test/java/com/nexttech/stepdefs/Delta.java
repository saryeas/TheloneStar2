package com.nexttech.stepdefs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.DeltaPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Delta {
	   WebDriver driver;
	
	@Given("^user launch URL$")
	public void user_launch_URL() throws Throwable {
	    WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (4)\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.jetblue.com/");
	    
	    
	   /* driver.findElement(By.ByCssSelector()).click();
	   Set<Cookie>cookies=driver.manage().getCookies();
	   System.out.println("Size of cookies:"  + cookies.size());
	   
	   for(Cookie cookie : cookies) {
		   System.out.println(cookie.getName()+":" +cookie.getValue());
		   
	   }*/
	   
	   
	   
	   driver.manage().window().maximize();
	    }

	@When("^click TureBlue And click join today and enter valid  \"([^\"]*)\" and click next$")
	public void click_TureBlue_And_click_join_today_and_enter_valid_and_click_next(String arg1) throws Throwable {
		
		DeltaPOM obj = new DeltaPOM (driver);
		obj.call().click();
		
		obj.TrueBlue().click();
		obj.Jointoday().click();
		obj.text().sendKeys(arg1);
		obj.submit().click();
	
	}

	@Then("^able to see sing up$")
	public void able_to_see_sing_up() throws Throwable {
		
		Thread.sleep(2000);
	    
	}


	
	
	
	
	
	
	
	
	
}
