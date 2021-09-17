package com.maventwaggle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maventwaggle.genericlibraries.basetest;

public class LoginPage {
	
	
	@FindBy(xpath = "//input[@id='userName']") private WebElement UserNameTextBox;
	@FindBy(id = "passWord") private WebElement PasswordTextBox;
	@FindBy(xpath = "//input[@title='Sign In']") private WebElement SingIn;
	
	public LoginPage()
	{
		PageFactory.initElements(basetest.driver, this);
	}
	
	public void LoginTOApp(String UserName,String Password)
	{
		
		UserNameTextBox.sendKeys(UserName);
		PasswordTextBox.sendKeys(Password);
		SingIn.click();
		
		
	}
	

}
