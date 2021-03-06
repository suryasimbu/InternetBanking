package com.internetbanking.testCases;

import org.testng.annotations.Test;

import com.internetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	}
}
