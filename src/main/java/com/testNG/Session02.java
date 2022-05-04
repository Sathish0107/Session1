package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session02 {

	public WebDriver driver;

	@Test
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}
	
	@Test(invocationCount = 5)
	public void launchGoogle() {

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

	}

	@Test
	public void searchText() {
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cricket" + Keys.ENTER);

	}

	@Test
	public void verifypageTitle() {
		
		Assert.assertEquals(driver.getTitle().contains("cricket - Google Search"), true);
		
		driver.close();

	}


}