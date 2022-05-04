package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsTest {
	
	@Test()
	public void Signin() {
		
		System.out.println(" user has signed in successfully");
	}
	
	@Test
	public void OpenBrowser() {
		
		System.out.println("browser is opned");
		
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"OpenBrowser", "Signin"})
	public void Logout() {
		
		System.out.println("logged out successfully");
	}

}
