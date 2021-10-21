package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	public WebDriver driver=null;
public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
			
	}
	
	
	@FindBy(xpath ="//div/a[@href=\"/account/login?ret=/\"]")
	private WebElement BTN_Login;
	
	@FindBy(xpath ="//div[@class='_2hriZF _2rbIyg']//input[@type='text']")
	private WebElement Input_EmailID;
	
	@FindBy(xpath ="//div[@class='_2hriZF _2rbIyg']//input[@type='password']")
	private WebElement Input_Password;
	
	@FindBy(xpath ="//a/span[text()='Forgot?']")
	private WebElement Forgot_password;
	
	@FindBy(xpath ="/div//button[@type='submit']//span[text()='Login']")
	private WebElement Clik_Login_Button;
	
	@FindBy(xpath ="//input[@id='email']")
	 WebElement Facebook_Email;
	
	@FindBy(xpath="//input[@id='pass']")
	 WebElement Facebook_Password;
	
	@FindBy(linkText ="menu_login_show_link uiButton uiButtonConfirm")
	 WebElement facebook_login_button;
	
	
	
	
	
	  public void doLogin()
	  {
		  BTN_Login.click(); Input_EmailID.click();
	  Input_EmailID.sendKeys("himanshukumar9210@gmail.com");
	  Input_Password.click(); Input_Password.sendKeys("himanshu9980774417");
	  Clik_Login_Button.click();
	  
	  }
	 
	
	public void doFacebookLogin(String userName, String password) throws InterruptedException
	{
		try {
			Thread.sleep(1000);
			Facebook_Email.sendKeys(userName);
			Thread.sleep(10000);
			Facebook_Password.sendKeys(password);
			Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println(e);
			return;
		}
		
	}
	

}
