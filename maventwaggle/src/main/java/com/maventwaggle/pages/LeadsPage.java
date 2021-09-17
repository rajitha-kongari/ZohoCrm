package com.maventwaggle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maventwaggle.genericlibraries.basetest;

public class LeadsPage {
	
	
	
	@FindBy(xpath = "//input[@value='New Lead']") private WebElement NewLeadButton;
	
	
	
	
	public LeadsPage()
	{
		PageFactory.initElements(basetest.driver, this);
	}
	
	public void ClickOnNewLeadButton()
	{
		NewLeadButton.click();
	}
	

}
