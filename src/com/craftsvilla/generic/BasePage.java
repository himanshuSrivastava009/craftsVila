package com.craftsvilla.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	
	
	public static WebDriver driver = null;
	public Logger log = Logger.getLogger(BasePage.class);
	public WebDriverWait w;
	
	
	/**
	 * Base Page Class Constructor
	 * @param browser
	 */
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyTitle(String expectedTitle, String actualTitle)
	{
		w = new WebDriverWait(driver, 10);
		try {
			w.until(ExpectedConditions.titleIs(expectedTitle));
			actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			log.info(actualTitle +"is Actual Title and Expected Title is " +expectedTitle);
			
		} catch (Exception e) {
			
			log.error(e);
			
		}
		
	}
	
	
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		 w = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			log.info("Mouse hovered on "+ele);
		}
		catch(Exception e)
		{
			log.error("Unable to mouse hover on "+ele);
		}
		
	}

}
