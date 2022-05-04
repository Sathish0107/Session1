package com.testNG;

import org.testng.annotations.Test;

public class Netbanking {
	
	@Test
	public void WebLoginBanking() {

		System.out.println("Netbanking web login");
	}

	@Test(groups = {"smoketesting"})
	public void MobileLoginBanking() {

		System.out.println("Netbanking mobile login");
	}

}
