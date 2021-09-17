package com.maventwaggle.genericlibraries;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Webdrivercommonlibraries extends basetest{
	
	
	public String getpagetitle()
	{
		String pagetitle = basetest.driver.getTitle();
		return pagetitle;
	}
	
	public void waitpage(String title)
	{
		WebDriverWait wait = new WebDriverWait(basetest.driver,20);
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public void selectOptions(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		
	}
	public void selectOptions(String value,WebElement element)
	{
		Select sel = new Select(element);
		
		sel.selectByValue(value);
	}
	public void selectOptions(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void mouseHover(WebElement element)
	{
	Actions ac = new Actions(basetest.driver);
	ac.moveToElement(element).perform();
	}
	
	public void verify(String actual, String expected, String page)
	{
		if(actual.equals(expected))
		{
			System.out.println(page+" is displayed, pass");
		}
		else
		{
			System.out.println(page+" is not displayed, fail");
		}
	}
	
	public void getpagescreeenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot)basetest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	public void getelementscreenshot(WebElement element,String path)
	{
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void switchToFrame(int index)
	{
		basetest.driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		basetest.driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		basetest.driver.switchTo().frame(element);
	}
	
	public void dropdownenabled(WebElement element, String elementname)
	{
		if(element.isEnabled())
		{
			Assert.assertTrue(true);
			Reporter.log(elementname+" is Enabled",true);
		}
		else
		{
			Assert.assertTrue(false);
			Reporter.log(elementname+" is Disabled",true);
		}
	}
	
	
	
	

}
