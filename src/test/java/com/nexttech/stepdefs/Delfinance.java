package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.nexttech.pageobjectmodel.DelfinancePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Delfinance {
	WebDriver driver;
	
	@Given("^user visit DELL url$")
	public void user_visit_DELL_url() throws Throwable {
				      
				        //how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (2)\\chromedriver.exe");
				                 driver = new ChromeDriver();
				       //soft wait
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				     
				       //how to maximize the browser
		 driver.manage().window().maximize();
						 
					  //how to open url      driver.get method
		 driver.get("https://www.dell.com/en-us");
						   
					 //heard wait
		 Thread.sleep(2000);
		}

	@When("^user GO TO Financing  dropdown menu AND ABLE TO MOUSE HOVER For Bussiness Purcheses$")
	public void user_GO_TO_Financing_dropdown_menu_AND_ABLE_TO_MOUSE_HOVER_For_Bussiness_Purcheses() throws Throwable {
		
		Actions act =new Actions (driver);
		DelfinancePOM  obj =new DelfinancePOM (driver);
		act.moveToElement(obj.Financing()).build().perform();
		act.moveToElement(obj.ForBusiness()).build().perform();
		}

	@Then("^user able to click Medium Bussiness & Large enterprise$")
	public void user_able_to_click_Medium_Bussiness_Large_enterprise() throws Throwable {
		DelfinancePOM  obj =new DelfinancePOM (driver);
		obj.MediumBusinessLarge().click();
	  }

	@Then("^user rederect TO  FINANCING  PORTFOLIO$")
	public void user_rederect_TO_FINANCING_PORTFOLIO() throws Throwable {
	driver.quit();    
	}

}
