package com.craftsvilla.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.HomePage;

public class SignInModuleScript extends BaseTest {
	
	
	
	HomePage homepage = new HomePage(driver);
	BaseTest basetest = new BaseTest();
	@Test
	public void tc_01_LoginTest()
	{
		homepage = new HomePage(driver);
		try {
			PageFactory.initElements(driver, homepage);
		//	launchBrowser("chrome");
			Thread.sleep(5000);
			homepage.doLogin();
			
		}
		
		catch (Exception e) {
		}
		
	}
//	@Test
//	public void tc_02_FaceBookLogin() throws InterruptedException
//	{
//		PageFactory.initElements(driver, homepage);
//		//basetest.launchBrowser("chrome");
//		System.out.println("Driver value is " +driver);
//		homepage.doFacebookLogin("himanshu", "test@123");
//		Thread.sleep(20000);
//		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("himanshu");
//	}
}
