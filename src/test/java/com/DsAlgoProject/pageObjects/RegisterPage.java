package com.DsAlgoProject.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//button[@class='btn']")
	@CacheLookup
	WebElement getStartedButton;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	@CacheLookup
	WebElement registerButton;
	
	@FindBy(id="id_username")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="id_password1")
	@CacheLookup
	WebElement txtpassword;
	
	
	@FindBy(id="id_password2")
	@CacheLookup
	WebElement txtpasswordconfirm;
	
	@FindBy(xpath="//input[@value='Register']")
	@CacheLookup
	WebElement registerconfirm;
	
	@FindBy(linkText="Sign out")
	@CacheLookup
	WebElement btnsignout;
	
	
	public void clickgetStarted()
	{
		 getStartedButton.click();
	}
	
	public void clickRegister()
	{
		registerButton.click();	
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
	
	public void confirmPassword(String confirm_pwd)
	{
		txtpasswordconfirm.clear();
		txtpasswordconfirm.sendKeys(confirm_pwd);
	}
	
	public void confirmRegister()
	{
		registerconfirm.click();
	}
	
	public void clickSignout()
	{
		btnsignout.click();
	}
	

	
}
