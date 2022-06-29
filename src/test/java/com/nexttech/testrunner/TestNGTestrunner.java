package com.nexttech.testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	
        @CucumberOptions (
				   features = {"C:\\Users\\NEXTTECH\\eclipse-workspace\\SELENIUM072020\\Config\\Features"},
				   glue = {"com.nexttech.stepdefs"},
				   tags= {"@delta"}
				   
				   )
		 public class TestRunner extends AbstractTestNGCucumberTests{}

}


