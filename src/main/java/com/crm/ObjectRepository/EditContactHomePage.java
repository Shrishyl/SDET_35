package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContactHomePage {
	@FindBy(linkText = "Contacts") private WebElement ContactsLnk;
	
	public EditContactHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactsLnk() {
		return ContactsLnk;
	}
	public void ClickonContactLn() {
		ContactsLnk.click();
	}
	
}
