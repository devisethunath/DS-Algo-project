package com.DsAlgoProject.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DsAlgoProject.pageObjects.RegisterPage;

public class TC_RegisterTest_001 extends BaseClass{


	@Test
	public void Registertest() throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logger.info("Uri is open");

		RegisterPage rp= new  RegisterPage(driver);
		rp.clickgetStarted();
		Thread.sleep(5000);
		logger.info("Clicked Get Started Button");

		rp.clickRegister();
		Thread.sleep(5000);
		logger.info("Register Button Clicked");

		rp.setUsername(username);
		Thread.sleep(5000);
		logger.info("Username given");

		rp.setPassword(password);
		Thread.sleep(5000);
		logger.info("Password is Given");

		rp.confirmPassword(password);
		Thread.sleep(5000);
		logger.info("Password confirmed");

		rp.confirmRegister();
		Thread.sleep(5000);
		logger.info("Register button Clicked Again");


		String pageTitle=driver.getTitle();
		Thread.sleep(5000);
		logger.info("Caught Title");

		Assert.assertEquals(pageTitle, "NumpyNinja");
		
		rp.clickSignout();
		Thread.sleep(3000);
		logger.info("SignOut button Clicked");


	}


}
