package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttech.pageobjectmodel.DatawithoutPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datawithout {
	WebDriver driver;//global variable
	@Given("^USER VISITS AMAZON HOMEPAGE$")
	public void user_VISITS_AMAZON_HOMEPAGE() throws Throwable {
		//how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		
		//soft wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  //how to open url      driver.get method
		    driver.get("https://www.amazon.com");
	       
	      //how to maximize the browser
		   driver.manage().window().maximize();
			
		    //heard wait
		   Thread.sleep(2000);
		  }

	   @When("^USER CLICKS ON BEST SELLERS BUTTON$")
	public void user_CLICKS_ON_BEST_SELLERS_BUTTON() throws Throwable {
		   
		   //driver.findElement( By.link text ("My Account")).(click);
		   DatawithoutPOM obj=new DatawithoutPOM (driver);
		   obj.bestsellers().click();
	}

	@Then("^USER REDERECT TO BEST SELLER PAGE$")
	public void user_REDERECT_TO_BEST_SELLER_PAGE() throws Throwable {
}
}