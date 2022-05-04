package com.testNG;

import org.testng.annotations.DataProvider;

public class DataPro {
	
	@DataProvider(name = "dataprovider")
	public Object[][] getCredentials(){
		
		return new Object[][] {{"abc@gmail.com", "12345"}, {"123@gmail.com", "45566"}, {"dcf@gmail.com", "gfdsdf"}};
	}

}
