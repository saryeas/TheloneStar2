package com.nexttech.stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tddformet {
	
	public void clickdropdown() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		   
		  // WebDriver driver =new ChromeDriver();
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://mrbool.com/");
		 
		  Actions act=new Actions(driver); // creating object
		  
		  act.moveToElement(driver.findElement(By.className("//a[@class=\"menulink\"]"))).build().perform();
		 
		 // act.moveToElement(driver.findElement(By.className("//a[@class=\"menulink\"]"))).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")) .click();
		  
		 }
}
