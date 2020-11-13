package StepDep;

import com.ActionPage.Demo.homePageAction;
import com.TestUtil.Demo.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageStepDep extends testBase {
	
	homePageAction HomePageAction= new homePageAction();

	    
//}
	@Given("^Lanuch \"([^\"]*)\"$")
	public void lanuch(String URL) throws Throwable {
	    getURL(URL);
	}
	
	@Then("^mouse over to financing link$")
	public void mouse_over_to_financing_link() throws Throwable {
		HomePageAction.mouse_over_to_financing_link();
	}

	@Then("^click on For Business Purchases$")
	public void click_on_For_Business_Purchases() throws Throwable {
		HomePageAction.click_on_For_Business_Purchases();
	}

	@Then("^Click on Apply For Dell Business Credit$")
	public void click_on_Apply_For_Dell_Business_Credit() throws Throwable {
		HomePageAction.Click_on_Apply_For_Dell_Business_Credit();
	}

	@Then("^verify the page$")
	public void verify_the_page() throws Throwable {
		HomePageAction.verify_the_page();
	}
	
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
		
	@Then("^Click on Sign in$")
	public void click_on_Sign_in() throws Throwable {
		HomePageAction.Click_on_Sign_in();
	}

	@Then("^Click on Create Account$")
	public void click_on_Create_Account() throws Throwable {
		HomePageAction.Click_on_Create_Account();
	}

	@Then("^Enter \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void enter(String FN, String LN, String EM, String PW) throws Throwable {
		
		HomePageAction.UserCredentials(FN, LN, EM, PW);
	    
	}

	@Then("^Click create AccountTwo$")
	public void click_create_AccountTwo() throws Throwable {
		HomePageAction.Click_create_AccountTwo();
	}
//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	@Then("^verify title$")
	public void verify_title() throws Throwable {
		HomePageAction.verify_title();
	}
	
	
	
}
