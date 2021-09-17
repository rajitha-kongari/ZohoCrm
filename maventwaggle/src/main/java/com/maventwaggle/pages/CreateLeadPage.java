package com.maventwaggle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maventwaggle.genericlibraries.basetest;

public class CreateLeadPage {
	@FindBy(xpath = "//input[@name='property(Company)']") private WebElement SubjectTextBox;
	@FindBy(name = "property(Last Name)") private WebElement LastNameTextBox;
	@FindBy(xpath = "(//input[@value='Save'])[2]") private WebElement SaveButton;
	
	
	public CreateLeadPage() 
	{
		PageFactory.initElements(basetest.driver, this);
	}
	
	public void CreateLead(String subject,String lastname)
	{
		SubjectTextBox.sendKeys(subject);
		LastNameTextBox.sendKeys(lastname);
		SaveButton.click();
	}

}
