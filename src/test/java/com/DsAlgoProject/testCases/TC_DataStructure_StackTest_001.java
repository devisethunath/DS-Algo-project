package com.DsAlgoProject.testCases;

import org.testng.annotations.Test;

import com.DsAlgoProject.pageObjects.DataStructures_Stack;

public class TC_DataStructure_StackTest_001 extends BaseClass{
	
	@Test
	public void StackTest() throws InterruptedException
	{
		driver.get(baseurl);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logger.info("Uri is open");
		
		DataStructures_Stack ds=new DataStructures_Stack(driver);
		
		ds.clickGetStartButton();
		Thread.sleep(5000);
		logger.info("Clicked Get Started Button");

		ds.clickSignInButton();
		Thread.sleep(5000);
		logger.info("Clicked SignIn Button");

		ds.setUsername(registered_username);
		Thread.sleep(5000);
		logger.info("Username given");

		ds.setPassword(registered_password);
		Thread.sleep(5000);
		logger.info("Password is Given");

		ds.clickLoginButton();
		Thread.sleep(5000);
		logger.info("Clicked Login button");
		
		ds.clickDataStructure();
		Thread.sleep(5000);
		logger.info("Clicked Data Structure button");
		
		ds.ClickStack();
		Thread.sleep(5000);
		logger.info("Clicked Stack Link in DataStructure");
		
		ds.Click_OperationsInStack();
		Thread.sleep(5000);
		logger.info("Clicked Operations in Stack ");
		
		ds.Click_Tryhere();
		Thread.sleep(5000);
		logger.info("Clicked try here ");
		
		ds.textArea_operationsTest();
		Thread.sleep(5000);
		logger.info("Entered sample code in textArea ");
		
		ds.Click_Run();
		Thread.sleep(3000);
		logger.info("Clicked run button");
		
		String text=ds.get_outputText();
		Thread.sleep(3000);
		logger.info("Output is "+text);
		
		driver.navigate().back();
		
		ds.Click_Implementation();
		Thread.sleep(3000);
		logger.info("Clicked Implementation Link");
		
		ds.Click_Tryhere1();
		Thread.sleep(3000);
		logger.info("Clicked Try here");
		
		ds.textArea_ImplementationTest();
		Thread.sleep(5000);
		logger.info("Entered sample code in textArea Implementation ");
		
		ds.Click_Run1();
		Thread.sleep(3000);
		logger.info("Clicked run button");
		
		String text1=ds.get_outputText1();
		Thread.sleep(3000);
		logger.info("Output is "+text1);
		
		driver.navigate().back();
		
		ds.click_Applications();
		Thread.sleep(5000);
		logger.info("Clicked Applications in Stack ");
		
		ds.Click_Tryhere2();
		Thread.sleep(5000);
		logger.info("Clicked Try here");
		
		ds.textArea_ApplicationTest();
		Thread.sleep(5000);
		logger.info("Entered sample code in textArea Applications ");
		
		ds.Click_Run2();
		Thread.sleep(3000);
		logger.info("Clicked run button");
		
		String text2=ds.get_outputText2();
		Thread.sleep(3000);
		logger.info("Output is "+text2);
		
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
