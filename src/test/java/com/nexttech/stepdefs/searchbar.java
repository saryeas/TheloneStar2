package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttech.pageobjectmodel.SearchPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchbar {
	
	WebDriver driver;
	//global variable
	@Given("^User goes to to Dell HomePage$")
	public void user_goes_to_to_Dell_HomePage() throws Throwable {
		
			//how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
			
			//soft wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  
			  //how to open url      driver.get method
	driver.get("https://www.dell.com");
		       
		      //how to maximize the browser
	driver.manage().window().maximize();
				
			   //heard wait
	Thread.sleep(2000);
			  }

	   
	@When("^User enter goes to search bar and enters \"([^\"]*)\"$")
	public void user_enter_goes_to_search_bar_and_enters(String arg1) throws Throwable {
		
		SearchPom obj= new SearchPom (driver);
		obj.search().sendKeys(arg1);
		obj.searchbutton().click();
		}

	@Then("^User rederects to the xps search page$")
	public void user_rederects_to_the_xps_search_page() throws Throwable {
		

		//heard wait
		 Thread.sleep(2000);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,1500)", ""); 

		driver.quit();
}
}