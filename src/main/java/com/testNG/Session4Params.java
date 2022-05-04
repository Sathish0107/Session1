package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session4Params {
	
	@Test
	@Parameters({"username", "password"})
	public void getData(String uname, String pwd) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		
		/*
		 * driver.findElement(By.id("pass")).sendKeys("");
		 * 
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */

		Thread.sleep(4000);

		driver.close();
	}

}
