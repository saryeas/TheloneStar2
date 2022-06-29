package com.nexttech.stepdefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttech.pageobjectmodel.amardeshpom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class amardesh {
	WebDriver driver;//global variable
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		
		//how to open browser
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
				
			  //how to open url      driver.get method
			  driver.get("https://www.amazon.com/");
				       
		
	} 

		
	@Given("^user write text on serch box$")
	public void user_write_text_on_serch_box() throws Throwable {
		amardeshpom obj= new amardeshpom (driver);
		obj.searchtextbox().click();
		
	  
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {

		amardeshpom obj1= new amardeshpom (driver);
		obj1.searchbutton().click();
		
	
	
	
	
	
	
	
	
	
	
	
	}
}