package com.nexttech.stepdefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttech.pageobjectmodel.LoginPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
	
	       //how to open browser
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
			
			//soft wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  
			  //how to open url      driver.get method
	 driver.get("https://demo.oscommerce.com");
		       
		      //how to maximize the browser
	driver.manage().window().maximize();
				
			    //heard wait
			   Thread.sleep(2000);
			   }
	
	
	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
		//create object parent class
		LoginPOM obj = new LoginPOM(driver);
		obj.MyAccount().click();
		}
	
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		//create object parent class
				LoginPOM obj = new LoginPOM(driver);
			   obj.emailadress().sendKeys(arg1);
				obj.password().sendKeys(arg2);
				
	}
	 @When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
			//create object parent class
			LoginPOM obj = new LoginPOM(driver);
			obj.signIn().click();
	  
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	    
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	  
	}

}
