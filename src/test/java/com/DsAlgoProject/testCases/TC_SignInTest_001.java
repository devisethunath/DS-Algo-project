package com.DsAlgoProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DsAlgoProject.pageObjects.SignInPage;
import com.DsAlgoProject.utilities.XLUtils;

public class TC_SignInTest_001 extends BaseClass{

	@Test(dataProvider="LoginData")

	public void SignInTest(String user,String Pwd) throws InterruptedException
	{
		driver.get(baseurl);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logger.info("Uri is open");

		SignInPage sp=new SignInPage(driver);

		sp.clickGetStartButton();
		Thread.sleep(5000);
		logger.info("Clicked Get Started Button");

		sp.clickSignInButton();
		Thread.sleep(5000);
		logger.info("Clicked SignIn Button");

	/*	sp.setUsername(registered_username);
		Thread.sleep(5000);
		logger.info("Username given");*/
		
		sp.setUsername(user);
		Thread.sleep(5000);
		logger.info("Username given");

		/*sp.setPassword(registered_password);
		Thread.sleep(5000);
		logger.info("Password is Given");*/
		
		sp.setPassword(Pwd);
		Thread.sleep(5000);
		logger.info("Password is Given");

		sp.clickLoginButton();
		Thread.sleep(5000);
		logger.info("Clicked Login button");

		String pageTitle=driver.getTitle();
		Thread.sleep(5000);
		logger.info("Caught Title");

		Assert.assertEquals(pageTitle, "NumpyNinja");

//		sp.clickSignout();
//		Thread.sleep(3000);
//		logger.info("SignOut button Clicked");




	}
	
	@DataProvider(name="LoginData")
	public String[][]getData() throws IOException
	{
		String path="C:\\Users\\sethu\\eclipse-workspace\\DsAlgoProject\\src\\test\\java\\com\\DsAlgoProject\\testData\\New Microsoft Excel Worksheet.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
			return logindata;
	
		
	}



}
