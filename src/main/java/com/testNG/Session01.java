package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Session01 {

	@Test
	public void test1() {

		System.out.println("Test case 1");

	}

	@Test
	public void test2() {

		System.out.println("Test case 2");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
}
