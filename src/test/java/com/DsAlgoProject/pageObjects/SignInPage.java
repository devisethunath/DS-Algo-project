package com.DsAlgoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DsAlgoProject.testCases.BaseClass;

public class SignInPage extends BaseClass{

	WebDriver ldriver;
	
	public SignInPage(WebDriver rdriver)
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
	
	@FindBy(linkText="Sign out")
	@CacheLookup
	WebElement btnsignout;
	
	
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
	
	public void clickSignout()
	{
		btnsignout.click();
	}
	
	
}
