package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.nexttech.pageobjectmodel.facebookPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook {
	WebDriver driver;//global variable
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	    //how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
		
		//soft wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  //how to open url      driver.get method
	 driver.get("https://www.facebook.com/r.php");
	       
	      //how to maximize the browser
	 driver.manage().window().maximize();
			 }

@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    
		 
	facebookPom  sel = new  facebookPom (driver);
			
	sel.firstname().sendKeys(arg1);	 
			sel.lastname().sendKeys(arg2);
			sel.email().sendKeys(arg3);
			sel.password().sendKeys(arg4);
			}

@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	
	            facebookPom obj = new facebookPom(driver);
    
		    
				Select dropdown = new Select (obj.click_month);
				dropdown.selectByIndex(5);
			
		    
		    	Select dropdown1 = new Select (obj.click_day);
				dropdown1.selectByValue("6");
			
		    			
		        //Select dropdown2 = new Select (obj.click_year);
				//dropdown2.selectByVisibleText("1999");
				
		  			
					
		
				
				
			
				
				
				
			
				
				
				
				
				
				
				
				
				//	obj.Selectyear().click();
				//heard wait
				// Thread.sleep(2000);
				driver.quit();
			
			}
		
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	}
