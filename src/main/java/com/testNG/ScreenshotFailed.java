package com.testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotFailed {
	
	static WebDriver driver;
	
	@Test
	public static void captureScreen() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbo']"));
	}
	
	@AfterMethod
	public void screenshot(ITestResult Result) {
		
		if(ITestResult.FAILURE == Result.getStatus()) {
			try {
				
				TakesScreenshot tks = (TakesScreenshot)driver;
				File src = tks.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\DELL\\eclipse-workspace\\com.testNG\\Screenshot" +Result.getName()+".png"));
				System.out.println("Successfully saved the screenshot");
			}
			
			catch (Exception e) {
				System.out.println("Exception is" + e.getMessage());
			}
			
			
		}
		
		driver.close();
	}
	

}
