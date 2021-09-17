package com.maventwaggle.genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class basetest implements Iautoconstant{
	
	public static WebDriver driver;
	@BeforeClass
	public  void openbrowser() throws Throwable
	{
		Filelibraries fl = new Filelibraries();
		String browser = fl.getpropdata("browser",PROP_PATH);
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, Chrome_VALUE);
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		String url = fl.getpropdata("url", PROP_PATH);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//System.out.println(url);
		
//		String actualtitle = driver.getTitle();
//		String expectedtitle = fl.getpropdata("title", PROP_PATH);
//		WebDriverCommonLib w = new WebDriverCommonLib();
//		//w.verify(actualtitle, expectedtitle, "Online Hotel Booking ");
	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//	}

}
