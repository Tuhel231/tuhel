package com.LocatorPage.Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestUtil.Demo.testBase;

public class homepageLocator extends testBase {
	
	public homepageLocator() {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='dell-masthead']/div[1]/div[2]/div[2]/div/div/div[2]/a[1]")   
	public WebElement SigninLink;
	
	@FindBy(how=How.XPATH, using="/html/body/main/header/div[1]/div[2]/div[2]/div/button/span[2]/span")   
	public WebElement SigninButton;
	
	@FindBy(how=How.ID, using="EmailAddress")   
	public WebElement Username;
	
	@FindBy(how=How.ID, using="Password")   
	public WebElement Password;
	
	@FindBy(how=How.XPATH, using="//button[text()='Sign In']")   
	public WebElement LoginBotton ;
	
	@FindBy(how=How.XPATH, using="//span[text()='Fahmida Nahar']")   
	public WebElement VeryfyLogin ;
	
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE

	@FindBy(how=How.ID, using="l6")   
	public WebElement MouseOver;
	
	@FindBy(how=How.XPATH, using="//span[text()=' For Business Purchases']")   
	public WebElement BusinessPurchases;
	
	@FindBy(how=How.XPATH, using="//a[text()='Apply for Dell Business Credit']")   
	public WebElement BusinessCredit;
	
	@FindBy(how=How.XPATH, using="//span[text()='Application for Dell Business Credit']")   
	public WebElement VerifyPage ;
	
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	@FindBy(how=How.ID, using="l6")   
	public WebElement VerifyTitle;
	
	//DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")   
	public WebElement Signin2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"dell-masthead\"]/div[1]/div[2]/div[2]/div/div/div[2]/a[2]")   
	public WebElement CreateAccount;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"FirstName\"]")   
	public WebElement FirstName;
	
	@FindBy(how=How.ID, using="LastName")   
	public WebElement LastName ;
	
	@FindBy(how=How.ID, using="CreateAccountEmailAddress")   
	public WebElement EMAILADDRESS;
	
	@FindBy(how=How.ID, using="NewPassword")   
	public WebElement NEWPASSWORD;
	
	@FindBy(how=How.ID, using="DellAdvantageOptInCheckbox")   
	public WebElement ClickYES;
	
	@FindBy(how=How.ID, using="create-account-button")   
	public WebElement CreateAccountTwo ;
	
	

}







