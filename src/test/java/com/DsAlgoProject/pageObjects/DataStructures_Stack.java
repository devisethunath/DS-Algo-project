package com.DsAlgoProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructures_Stack {
	
	WebDriver ldriver;
	
	public DataStructures_Stack(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
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
	
	@FindBy(xpath="//a[normalize-space()='Stack']")
	@CacheLookup
	WebElement btnStack;
	
	@FindBy(linkText="Operations in Stack")
	@CacheLookup
	WebElement btn_OperationsStack;
	
	@FindBy(linkText="Implementation")
	@CacheLookup
	WebElement btn_Implementation;
	
	@FindBy(linkText="Applications")
	@CacheLookup
	WebElement btn_Applications;
	
	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btn_tryhere;
	
	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btn_tryhere1;
	
	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btn_tryhere2;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textArea_Operations;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textArea_Implementation;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement textArea_Applications;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement click_Run;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement click_Run1;
	

	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement click_Run2;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement output_text;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement output_text1;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement output_text2;
	
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
	
	public void ClickStack()
	{
		btnStack.click();
	}
	
	public void Click_OperationsInStack()
	{
		btn_OperationsStack.click();
	}
	
	public void Click_Implementation()
	{ 
		btn_Implementation.click();
		
	}
	
	public void Click_Applications()
	{
		btn_Applications.click();
	}
	
	public void Click_Tryhere()
	{
		btn_tryhere.click();
	}
	
	public void Click_Tryhere1()
	{
		btn_tryhere1.click();
	}
	
	public void Click_Tryhere2()
	{
		btn_tryhere2.click();
	}
	public void textArea_operationsTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textArea_Operations);
		textArea_Operations.sendKeys("print "+"10");
	}
	public void textArea_ImplementationTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textArea_Implementation);
		textArea_Implementation.sendKeys("print "+"10");
	}
	
	public void textArea_ApplicationTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",textArea_Applications);
		textArea_Applications.sendKeys("print "+"10");
	}
	public void Click_Run()
	{
		click_Run.click();
	}
	public void Click_Run1()
	{
		click_Run1.click();
	}
	
	public void Click_Run2()
	{
		click_Run2.click();
	}
	
	public String get_outputText()
	{
		String message=output_text.getText();
		return message;
	}

	public String get_outputText1()
	{
		String message1=output_text1.getText();
		return message1;
	}
	public String get_outputText2()
	{
		String message2=output_text2.getText();
		return message2;
	}
	public void click_Applications()
	{
		btn_Applications.click();
	}
}
