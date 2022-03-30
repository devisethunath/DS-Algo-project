package com.DsAlgoProject.testCases;

import org.testng.annotations.Test;

import com.DsAlgoProject.pageObjects.DataStructures_Graph;


public class TC_DataStructure_GraphTest_001 extends BaseClass{
	
	@Test
	public void Graph_Test() throws InterruptedException
	{
		driver.get(baseurl);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logger.info("Uri is open");
		
		DataStructures_Graph dg=new DataStructures_Graph(driver);
		
		dg.clickGetStartButton();
		Thread.sleep(3000);
		logger.info("Clicked Get Started Button");
		
		dg.clickSignInButton();
		Thread.sleep(5000);
		logger.info("Clicked SignIn Button");

		dg.setUsername(registered_username);
		Thread.sleep(5000);
		logger.info("Username given");

		dg.setPassword(registered_password);
		Thread.sleep(5000);
		logger.info("Password is Given");

		dg.clickLoginButton();
		Thread.sleep(5000);
		logger.info("Clicked Login button");
		
		dg.clickDataStructure();
		Thread.sleep(5000);
		logger.info("Clicked Data Structure button");
		
		dg.click_Graph();
		Thread.sleep(5000);
		logger.info("Clicked Graph button");
		
		dg.Click_graph1();
		Thread.sleep(5000);
		logger.info("Clicked second Graph button");
		
		dg.Click_Tryhere();
		Thread.sleep(5000);
		logger.info("Clicked Try here button");
		
		dg.TextArea_graph();
		Thread.sleep(5000);
		logger.info("Entered sample python code in textarea");
		
		dg.Click_Run();
		Thread.sleep(5000);
		logger.info("Clicked Run button");
		
		String text=dg.text_output();
		Thread.sleep(3000);
		logger.info("Output is "+text);
		
		driver.navigate().back();
		
		
		dg.Click_graphRep();
		Thread.sleep(3000);
		logger.info("Clicked Graph Representation");
		
		dg.Click_Tryhere1();
		Thread.sleep(3000);
		logger.info("Clicked Try Here");
		
		dg.TextArea_graph1();
		Thread.sleep(5000);
		logger.info("Entered sample python code in textarea for graph Representation");
		
		dg.Click_Run1();
		Thread.sleep(5000);
		logger.info("Clicked Run button");
		
		String text1=dg.text_output1();
		Thread.sleep(3000);
		logger.info("Output is "+text1);
		
		driver.navigate().back();
		
		
	}


}
