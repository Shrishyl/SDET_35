package com.crm.Contact;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.ContactPage;
import com.crm.ObjectRepository.Contactinfopage;
import com.crm.ObjectRepository.CreatingNewContactingPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

import genaricsUtilities.BaseClass;

public class CreateContactTest extends BaseClass {

	@Test
	public void CreateContact() throws Throwable {
		int randum = jLib.getRandomNUmber();

		// say hello hi hello
		HomePage hpage =new HomePage(driver);
		hpage.getContactsLnk().click();

		// click on new contact lookupimage
		ContactPage cpage =new ContactPage(driver);
		cpage.getContactlookupimg().click();


		//fetching data from excel sheet
		String fname = eLib.getExcel("Organisation", 1, 3)+randum;
		String lname = eLib.getExcel("Organisation", 2, 3)+randum;

		//enter the firstname &last name contact select the Leedsource dropdown and click on the save button
		CreatingNewContactingPage cnpage=new CreatingNewContactingPage(driver);
		
		cnpage.getFirstNameTextEdit().sendKeys(fname) ;
		cnpage.getLastNameTextEdit().sendKeys(lname);
		cnpage.Leaddropdown();
		cnpage.CreateContact();
	}
	// to verify is contact creted or not
	//Contactinfopage in=new Contactinfopage(sdriver);
	
	
	
	
	
}
