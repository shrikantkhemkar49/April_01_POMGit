package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class TestClass extends BaseClass{

	@BeforeClass
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateLoginPageFunctinality() {
		LoginPage lp = new LoginPage();
		lp.loginFunctionality("Admin", "admin123");
		
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
