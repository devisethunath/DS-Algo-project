package com.DsAlgoProject.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import com.DsAlgoProject.pageObjects.DataStructures_Arrays;

public class TC_DataStructure_ArraysTest_001 extends BaseClass {


	@Test
	public void dataStructureArraysTest() throws InterruptedException
	{
		driver.get(baseurl);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logger.info("Uri is open");

		DataStructures_Arrays ds=new DataStructures_Arrays(driver);

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

		//Arrays-ArraysPython

		ds.clickDataStructure();
		Thread.sleep(5000);
		logger.info("Data Structure clicked");

		ds.clickArrays();
		Thread.sleep(5000);
		logger.info("Arrays clicked");

		ds.clickArraysPython();
		Thread.sleep(5000);
		logger.info("Arrays in python Clicked");

		ds.clickTryHere();
		Thread.sleep(5000);
		logger.info("Try here Clicked");

		ds.textArea();
		Thread.sleep(5000);
		logger.info("Entered text in textArea");

		ds.clickRun();
		logger.info("Run Button Clicked");
		Thread.sleep(5000);

		String message=ds.getAlert();
		System.out.println(message);
		logger.info("Alert message is: "+message);

		//Arays-arraysList

		driver.navigate().back();
		Thread.sleep(10000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0)");


		Thread.sleep(5000);
		ds.arraysListTest();
		Thread.sleep(5000);
		logger.info("Arrys List Button Clicked");

		ds.clickTryHere1();
		Thread.sleep(5000);
		logger.info("Try  here Clicked");

		ds.textArea1();
		Thread.sleep(5000);
		logger.info("Entered text in textArea");

		ds.clickRun1();
		logger.info("Run Button Clicked");
		Thread.sleep(5000);

		String message1=ds.getAlert();
		System.out.println(message1);
		logger.info("Alert message is: "+message1);

		//Arrays-Basic Operationsin LIst

		driver.navigate().back();


		ds.clickBasicOperationsInList();
		logger.info("Clicked basic Operations in List");

		ds.clickTryHere2();
		Thread.sleep(5000);
		logger.info("Try here Clicked");

		ds.textArea2();
		Thread.sleep(5000);
		logger.info("Entered text in textArea");

		ds.clickRun2();
		logger.info("Run Button Clicked");
		Thread.sleep(5000);

		String message2=ds.getAlert();
		System.out.println(message2);
		logger.info("Alert message is: "+message2);

		//Arrays-ApplicationsArray

		driver.navigate().back();



		ds.clickapplicationsArray();
		logger.info("Clicked Applications Array");

		ds.clickTryHere3();
		Thread.sleep(5000);
		logger.info("Try here Clicked");

		ds.textArea3();
		Thread.sleep(5000);
		logger.info("Entered text in textArea");

		ds.clickRun3();
		logger.info("Run Button Clicked");
		Thread.sleep(5000);

		String message3=ds.getAlert();
		System.out.println(message3);
		logger.info("Alert message is: "+message3);

		driver.navigate().back();

		//Practice Questions
		
		ds.clickPracticeQuestions();
		logger.info("Practice questions  Button Clicked");
		Thread.sleep(5000);
		
		ds.clicksearchtheArray();
		logger.info("Search the Array  Button Clicked");
		Thread.sleep(5000);
		
		ds.textAreaPracticeQuestions();
		Thread.sleep(3000);
		logger.info("Entered text in textArea Pracice questions");
		
		ds.clickRun_PracticeQuestions();
		Thread.sleep(3000);
		logger.info("Clicked Run Button for Practice Questions textArea");
		
		String message4=ds.getAlert();
		System.out.println(message4);
		logger.info("Alert message is: "+message4);
		
		ds.ClickSubmit_PracticeQuestions();
		Thread.sleep(3000);
		logger.info("Clicked Submit for Practice Questions textArea");
		
		String text=ds.Output_submitButton();
		logger.info("Output text is " +text);
		
		driver.navigate().back();
		
		ds.Click_Max_ConsOnes();
		Thread.sleep(3000);
		logger.info("Clicked Max Consecutive Ones Button");
		
		ds.clickRun_PracticeQuestions1();
		Thread.sleep(3000);
		logger.info("Clicked Run button for Max consecutive ones textarea");
		
		String message5=ds.getAlert();
		System.out.println(message5);
		logger.info("Alert message is: "+message5);
		
		ds.ClickSubmit_PracticeQuestions1();
		Thread.sleep(3000);
		logger.info("Clicked Submit button for Max consecutive ones textarea");
		
		String text1=ds.Output_submitButton1();
		logger.info("Output text is " +text1);
		
		driver.navigate().back();
		
		ds.click_FindNumbers_EvenDigits();
		Thread.sleep(3000);
		logger.info("Clicked button Find Numbers with Even Digits");
		
		ds.textAreaPracticeQuestions2();
		Thread.sleep(3000);
		logger.info("Entered Text in Text area Find nubers with even digits");
		

		ds.clickRun_PracticeQuestions2();
		Thread.sleep(3000);
		logger.info("Clicked Run button for Find number with even digits  textarea");
		
		String message6=ds.getAlert();
		System.out.println(message6);
		logger.info("Alert message is: "+message6);
		
		ds.ClickSubmit_PracticeQuestions2();
		Thread.sleep(3000);
		logger.info("Clicked Submit button for Find number with even digits  textarea");
		
		String text2=ds.Output_submitButton2();
		logger.info("Output text is " +text2);
		
		driver.navigate().back();
		
		
		ds.Click_SquresofSortedArray();
		Thread.sleep(3000);
		logger.info("Clicked Squres of Sorted Array  button ");
		
		ds.textAreaPracticeQuestions3();
		Thread.sleep(3000);
		logger.info("Entered Text in Text area Find nubers with even digits");
		
		ds.clickRun_PracticeQuestions3();
		Thread.sleep(3000);
		logger.info("Clicked Run button for Squres of Sorted Array ");
		
		String message7=ds.getAlert();
		System.out.println(message7);
		logger.info("Alert message is: "+message7);
		
		ds.ClickSubmit_PracticeQuestions3();
		Thread.sleep(3000);
		logger.info("Clicked Submit button for Squares of Sorted Array ");
		

		String text3=ds.Output_submitButton3();
		logger.info("Output text is " +text3);
		
		driver.navigate().back();
		
		
		
		
		
		

		
		
		
		
		
		
		





	}

}
