package com.DsAlgoProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructures_Graph {
	
	WebDriver ldriver;
	
	public DataStructures_Graph(WebDriver rdriver)
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
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Graph']")
	@CacheLookup
	WebElement btn_graph;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Graph']")
	@CacheLookup
	WebElement btn_Graph1;
	
	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btn_Tryhere;
	
	@FindBy(linkText="Try here>>>")
	@CacheLookup
	WebElement btn_Tryhere1;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement TextArea_Graph;
	
	@FindBy(xpath="//textarea[@autocorrect='off']")
	@CacheLookup
	WebElement TextArea_Graph1;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btn_Run;
	
	@FindBy(xpath="//button[@type='button']")
	@CacheLookup
	WebElement btn_Run1;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement text_ouput;
	
	@FindBy(id="output")
	@CacheLookup
	WebElement text_ouput1;
	
	@FindBy(linkText="Graph Representations")
	@CacheLookup
	WebElement btn_graphRep;
	
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
	
	public void click_Graph()
	{
		btn_graph.click();
	}
	public void Click_graph1()
	{btn_Graph1.click();
		
	}
	public void Click_Tryhere()
	{
		btn_Tryhere.click();
	}
	public void Click_Tryhere1()
	{
		btn_Tryhere1.click();
	}
	
	public void TextArea_graph()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",TextArea_Graph);
		TextArea_Graph.sendKeys("print "+"10");
	}
	
	public void TextArea_graph1()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].style.display='block';",TextArea_Graph1);
		TextArea_Graph1.sendKeys("print "+"10");
	}
	
	public void Click_Run()
	{
		btn_Run.click();
	}
	
	public void Click_Run1()
	{
		btn_Run1.click();
	}
	
	public String text_output()
	{
		String message=text_ouput.getText();
		return message;
	}
	
	public String text_output1()
	{
		String message=text_ouput1.getText();
		return message;
	}
	
	public void Click_graphRep()
	{
		btn_graphRep.click();
	}
}
