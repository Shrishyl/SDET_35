package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactHomePage {
	//declarisation
	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']") private WebElement ContactLnkText;
	
	@FindBy (name = "selected_id") private WebElement Selectchechbox;
	
	@FindBy(xpath = "//input[@value='Send Mail']") private WebElement SendMailbuton;
	
// initialisation
	public ContactHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public WebElement getContactLnkText() {
		return ContactLnkText;
	}
	
	public WebElement getSelectchechbox() {
		return Selectchechbox;
	}
	public WebElement getSendMailbuton() {
		return SendMailbuton;
	}
	
	public void ClickonContactPage() {
		ContactLnkText.click();
	}
}