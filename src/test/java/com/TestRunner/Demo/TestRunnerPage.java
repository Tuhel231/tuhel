package com.TestRunner.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.TestUtil.Demo.testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , format = {"html:target/site/cucumber-pretty"},
glue = "StepDep" ,tags= {"@T"})


public class TestRunnerPage extends AbstractTestNGCucumberTests  {
	
@BeforeTest	
public void setUP () {
	
	testBase test = new testBase();
	test.initil();
	
}
@AfterTest
public void tearDown() {
	
	testBase test = new testBase();
	test.driver.quit();
	
	
}

}
