package com.DsAlgoProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructures_Arrays {


	WebDriver ldriver;

	public DataStructures_Arrays (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//button[@class='btn']")
	@CacheLookup
	WebElement getStartedButton;

	@FindBy(linkText="Sign in")
	@CacheLookup
	WebElement btnSignIn;

	@FindBy(name="username")
	@CacheLookup
	WebElement txtusername;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath="//input[@value='Login']")
	@CacheLookup
	WebElement btnlogin;


	@FindBy(linkText="Data Structures")
	@CacheLookup
	WebElement btndataStructure;

	@FindBy(linkText="Data Structures")
	@CacheLookup
	WebElement btndataStructure1;


	@FindBy(linkText="Arrays")
	@CacheLookup
	WebElement btnArrays;

	@FindBy(linkText="Arrays in Python")
	@CacheLookup
	WebElement btnarraysPython;

	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btnTryhere;

	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btnTryhere1;

	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btnTryhere2;

	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btnTryhere3;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	public WebElement txtTextArea;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	public WebElement txtTextArea1;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	public WebElement txtTextArea2;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	public WebElement txtTextArea3;

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun;

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun1;

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun2;

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun3;

	@FindBy(linkText="Arrays Using List")
	@CacheLookup
	WebElement btnArrays_List;

	@FindBy(linkText="Basic Operations in Lists")
	@CacheLookup
	WebElement basicOperationsList;

	@FindBy(linkText="Applications of Array")
	@CacheLookup
	WebElement btnapplicationsArray;

	@FindBy(linkText="Practice Questions")
	@CacheLookup
	WebElement btnpracticeQuestions;

	@FindBy(linkText="Search the array")
	@CacheLookup
	WebElement btnSearchTheArray;

	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textarea_practiceQuestions;


	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textarea_practiceQuestions1;
	

	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textarea_practiceQuestions2;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textarea_practiceQuestions3;

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun_PracticeQuestions;
	

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun_PracticeQuestions1;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun_PracticeQuestions2;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btnRun_PracticeQuestions3;

	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit_PracticeQuestions;
	

	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit_PracticeQuestions1;
	

	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit_PracticeQuestions2;
	

	@FindBy(xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit_PracticeQuestions3;

	@FindBy(id="output")
	@CacheLookup
	WebElement btnSubmit_output;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement btnSubmit_output1;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement btnSubmit_output2;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement btnSubmit_output3;
	
	

	@FindBy(linkText="Max Consecutive Ones")
	@CacheLookup
	WebElement btn_Max_ConsOnes;
	
	@FindBy(linkText="Find Numbers with Even Number of Digits")
	@CacheLookup
	WebElement btn_Numbers_withEvendigits;
	
	@FindBy(linkText="Squares of a Sorted Array")
	@CacheLookup
	WebElement btn_squresofSortedArray;



	public void clickSignInButton()
	{
		btnSignIn.click();
	}
	public void clickGetStartButton()

	{
		getStartedButton.click();
	}

	public void setUsername(String uname)
	{
		txtusername.clear();
		txtusername.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		btnlogin.click();
	}


	public void clickDataStructure()


	{	btndataStructure.click();



	}
	public void clickDataStructure1()

	{	btndataStructure1.click();

	}

	public void clickArrays()
	{
		btnArrays.click();
	}

	public void clickArraysPython()
	{
		btnarraysPython.click();
	}

	public void clickTryHere()
	{
		btnTryhere.click();
	}

	public void clickTryHere1()
	{
		btnTryhere1.click();
	}

	public void clickTryHere2()
	{
		btnTryhere2.click();
	}

	public void clickTryHere3()
	{
		btnTryhere3.click();
	}

	public void textArea()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",txtTextArea);
		txtTextArea.sendKeys("print "+"Hello World");
	}


	public void textArea1()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",txtTextArea1);
		txtTextArea1.sendKeys("print "+"Hello to  World of Python");
	}

	public void textArea2()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",txtTextArea2);
		txtTextArea2.sendKeys("print "+"Hello World of Testing");
	}
	public void textArea3()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",txtTextArea3);
		txtTextArea3.sendKeys("print "+"Hello World of Java");
	}
	
	
	


	public void clickRun()
	{
		btnRun.click();

	}

	public void clickRun1()
	{
		btnRun1.click();

	}

	public void clickRun2()
	{
		btnRun2.click();}

	public void clickRun3()
	{
		btnRun3.click();

	}


	public  String getAlert()
	{
		String alert_text=ldriver.switchTo().alert().getText();
		ldriver.switchTo().alert().accept();
		return  alert_text;
	}

	public void arraysListTest()
	{
		btnArrays_List.click();
	}
	public void clickBasicOperationsInList()
	{
		basicOperationsList.click();
	}

	public void clickapplicationsArray()
	{
		btnapplicationsArray.click();
	}

	public void clickPracticeQuestions()
	{
		btnpracticeQuestions.click();
	}
	public void clicksearchtheArray()
	{
		btnSearchTheArray.click();
	}

	public void textAreaPracticeQuestions()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textarea_practiceQuestions);
		textarea_practiceQuestions.sendKeys("print "+"Hello python sample code testing");
	}
	public void textAreaPracticeQuestions1()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textarea_practiceQuestions1);
		textarea_practiceQuestions1.sendKeys("print "+"Hello python sample code testing");
	}
	
	public void textAreaPracticeQuestions2()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textarea_practiceQuestions2);
		textarea_practiceQuestions2.sendKeys("print "+"Hello python sample code testing");
	}
	

	public void textAreaPracticeQuestions3()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textarea_practiceQuestions3);
		textarea_practiceQuestions3.sendKeys("print "+"Hello python sample code testing");
	}

	public void clickRun_PracticeQuestions()
	{
		btnRun_PracticeQuestions.click();
	}
	
	public void clickRun_PracticeQuestions1()
	{
		btnRun_PracticeQuestions1.click();
	}
	

	public void clickRun_PracticeQuestions2()
	{
		btnRun_PracticeQuestions2.click();
	}
	
	public void clickRun_PracticeQuestions3()
	{
		btnRun_PracticeQuestions3.click();
	}
	public void ClickSubmit_PracticeQuestions()
	{
		btnSubmit_PracticeQuestions.click();
	}
	
	public void ClickSubmit_PracticeQuestions1()
	{
		btnSubmit_PracticeQuestions1.click();
	}
	
	public void ClickSubmit_PracticeQuestions2()
	{
		btnSubmit_PracticeQuestions2.click();
	}
	
	public void ClickSubmit_PracticeQuestions3()
	{
		btnSubmit_PracticeQuestions3.click();
	}



	public String Output_submitButton()
	{String output_text=btnSubmit_output.getText();
	return output_text;

	}
	
	public String Output_submitButton1()
	{String output_text1=btnSubmit_output1.getText();
	return output_text1;

	}
	
	public String Output_submitButton2()
	{String output_text2=btnSubmit_output2.getText();
	return output_text2;
	}
	public String Output_submitButton3()
	{String output_text3=btnSubmit_output3.getText();
	return output_text3;
	}

	public void Click_Max_ConsOnes()
	{
		btn_Max_ConsOnes.click();
	}
	
	public void click_FindNumbers_EvenDigits()
	{
		btn_Numbers_withEvendigits.click();
	}
	
	public void Click_SquresofSortedArray()
	{
		btn_squresofSortedArray.click();
	}
}
