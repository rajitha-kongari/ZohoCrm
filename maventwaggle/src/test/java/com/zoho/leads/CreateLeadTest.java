package com.zoho.leads;

import org.testng.annotations.Test;

import com.maventwaggle.genericlibraries.Filelibraries;
import com.maventwaggle.genericlibraries.Webdrivercommonlibraries;
import com.maventwaggle.genericlibraries.basetest;
import com.maventwaggle.pages.CreateLeadPage;
import com.maventwaggle.pages.HomePage;
import com.maventwaggle.pages.LeadsPage;
import com.maventwaggle.pages.LoginPage;

public class CreateLeadTest extends basetest {
	
	
	@Test
	public void CreatenewLead() throws Throwable
	{
		
		LoginPage lp = new LoginPage();
		
		Webdrivercommonlibraries wlib = new Webdrivercommonlibraries();
		Filelibraries flib = new Filelibraries();
		lp.LoginTOApp(flib.getpropdata("username", PROP_PATH),flib.getpropdata("password", PROP_PATH));
		HomePage hp = new HomePage();
		hp.clickOnLeads();
		LeadsPage lead=new LeadsPage();
		lead.ClickOnNewLeadButton();
		CreateLeadPage clp = new CreateLeadPage();
		clp.CreateLead(flib.readExcelData(EXECL_PATH, "Sheet1", 0, 1), flib.readExcelData(EXECL_PATH, "Sheet1", 1, 1));
		
	
		
		
		
		
		
		
		
	}
	
	

}
