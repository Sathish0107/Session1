package com.testNG;

import org.testng.annotations.Test;

public class FacebookLogin {

	@Test(groups = {"smoketesting"})
	public void WebLogin() {

		System.out.println("facebook web login");
	}

	@Test
	public void MobileLogin() {

		System.out.println("facebook mobile login");
	}
	

}
