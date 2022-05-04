package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session5Cross {

	WebDriver driver;

	@Test(groups = { "session1" })
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Test(groups = { "session2" })
	public void getTit() {

		String title = driver.getTitle();

		System.out.println(title);
	}
	
	@Test(groups = {"session1", "session2"})
	public void getCUrl() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
	}

}
