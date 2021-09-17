package com.maventwaggle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maventwaggle.genericlibraries.basetest;

public class HomePage {
	
	
	@FindBy(xpath = "//a[text()='Leads']") private WebElement LeadsButton;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(basetest.driver, this);
	}
	
	public void clickOnLeads()
	{
		LeadsButton.click();
	}
	

}
