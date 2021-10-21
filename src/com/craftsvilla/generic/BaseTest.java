package com.craftsvilla.generic;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest implements AutoConstant {
	
	public WebDriver driver=null;
	public WebDriverWait wait = null;
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser value");
			System.exit(0);
		}
		wait =new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(APP_URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
