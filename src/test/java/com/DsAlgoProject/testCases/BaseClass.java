package com.DsAlgoProject.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {



	public String baseurl="https://dsportalapp.herokuapp.com/";
	public String username="devisethu@123";
	public String password="Aditya@2006";
	public String conf_password="Aditya@2006";

	public String registered_username="devisethunath@gmail.com";
	public String registered_password="Sethu@1975";

	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		logger=Logger.getLogger("DsAlgo");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", "C://Users/sethu/Downloads/chromedriver_win32New/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://Users/sethu/Downloads/geckodriver-v0.30.0-win64/geckodriver.exe");
			driver= new FirefoxDriver();
		}



	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}