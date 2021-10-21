package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInstance implements AutoConstant {

	public static void main(String[] args) {
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		WebDriver driver = new FirefoxDriver();
	System.out.println(driver instanceof FirefoxDriver);
	}

}
