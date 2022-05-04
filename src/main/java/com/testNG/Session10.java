package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session10 {

	@Test
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		SoftAssert softassert = new SoftAssert();

		String title = driver.getTitle();

		String expected = "Google1";
		
		Assert.fail();

		softassert.assertEquals(title, expected);

		// Assert.assertEquals(title, expected, "Validating the title of the home
		// page");

		driver.close();

		softassert.assertAll();

	}

}
