package com.TestUtil.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	
	public static WebDriver driver; 
	public static Properties pro;
	
	
	public testBase() {
		
		pro = new Properties();
		
   try {
	FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\NewProject\\Demo\\config.properties");
					
			pro.load(fls);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
		
		
		
	}
	
	public  void initil() {
		
		String browserName= pro.getProperty("browser2");
		
		if(browserName.equals("Chrome"))   {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(utility.page_LoadT_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utility.imlicity_Wait, TimeUnit.SECONDS);
			
		}
		
		else if (browserName.equals("browser1"));
			
			
		}
	public static void getURL(String URL) {
		
		driver.get(pro.getProperty("QAurl"));
		
	
		
	
		
	}
	
	
	
	
	
	
	
	

}
