package com.crm.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	//declaristion
	@FindBy(xpath = "//a[@href=\"index.php?module=Contacts&action=index\"]") private WebElement ContactLnk;
    
	@FindBy(xpath = "//a[text()='edit']") private WebElement Editbuton;
	
	@FindBy (linkText = "Piyush") private WebElement contactname;
	
	@FindBy(xpath = "//img[@title='Create Contact...']") private WebElement Contactlookupimg;
	

	//intialisation
	public ContactPage(WebDriver driver) {
      PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getContactLnk() {
		return ContactLnk;
	}
	public WebElement getEditbuton() {
		return Editbuton;
	}

	public WebElement getContactname() {
		return contactname;
	}
	

	public WebElement getContactlookupimg() {
		return Contactlookupimg;
	}

	public void clionContactlink() {
		
		Editbuton.click();
	}
	}

