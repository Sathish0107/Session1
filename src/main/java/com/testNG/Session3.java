package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session3 {

	/*
	 * @DataProvider(name = "Test Data") public Object[] getInfo() {
	 * 
	 * return new Object[] {"abc@gmail.com", "123@gmail.com", "dcr@gmail.com"};
	 * 
	 * }
	 */
	@Test(dataProvider = "dataprovider", dataProviderClass = DataPro.class)
	public void getData(String uname, String pass) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys(uname);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.close();
	}

}
