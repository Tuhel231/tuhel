package com.ActionPage.Demo;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.LocatorPage.Demo.homepageLocator;
import com.TestUtil.Demo.testBase;

public class homePageAction extends testBase {
	
	 homepageLocator HomePageLocator= new  homepageLocator();
	
	
		
	public void mouse_over_to_financing_link () {
		Actions ac = new Actions(driver);
		
		ac.moveToElement(HomePageLocator.MouseOver).build().perform();
		
	}
	public void click_on_For_Business_Purchases()  {
		
		HomePageLocator.BusinessPurchases.click();
	}
	public void Click_on_Apply_For_Dell_Business_Credit() {
		
		HomePageLocator.BusinessCredit.click();
	}
	public void verify_the_page()  {
		
		boolean verifyPage =HomePageLocator.VerifyPage.isDisplayed();
		
		Assert.assertTrue(verifyPage);
	}
	
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	public void Click_on_Sign_in() {
		
		HomePageLocator.Signin2.click();
	}
	public void Click_on_Create_Account () {
		HomePageLocator.CreateAccount.click();
	}
	
	public void UserCredentials (String FN,String LN,String EM,String PW) {
		HomePageLocator.FirstName.sendKeys(FN);
		HomePageLocator.LastName.sendKeys(LN);
		HomePageLocator.EMAILADDRESS.sendKeys(EM);
		HomePageLocator.NEWPASSWORD.sendKeys(PW);
		HomePageLocator.ClickYES.click();
	}
	
	
	public void  Click_create_AccountTwo() {
		
		HomePageLocator.CreateAccountTwo.click();
		
	}
	
	
public void verify_title() {
		
		String expected ="Computers, Monitors & Technology Solutions | Dell USA";
		
		String actual= "";
		
		actual = driver.getTitle();
		
		if(actual.equalsIgnoreCase(expected)) {
			
			System.out.println("Test case pass");
		}
		
		else {
			
			System.out.println("Test case Failled");
		}

		}
	
	
	

}
