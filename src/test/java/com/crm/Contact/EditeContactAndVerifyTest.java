package com.crm.Contact;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.ContactHomePage;
import com.crm.ObjectRepository.ContactPage;
import com.crm.ObjectRepository.EditContactInformationPage;

import genaricsUtilities.BaseClass;

public class EditeContactAndVerifyTest extends BaseClass {
	
	
	@Test(groups="regressionTest")
	public void EditContact() {
		


		// 2 click on contact page 
		ContactHomePage cpage=new ContactHomePage(driver);
		cpage.ClickonContactPage();

		//3 click on the edit button and navigate next page
		ContactPage copage=new ContactPage(driver);
		copage.clionContactlink();

		// Edit the name and enter piyush click on save button
		EditContactInformationPage epage=new  EditContactInformationPage(driver);
		epage.LastNameEdit();
 
	
	
	}

}


