package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	
	@FindBy(xpath = "//input[@name=\"Duplicate\"]") private WebElement Duplicatebuton;
	
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDuplicatebuton() {
		return Duplicatebuton;
	}
	public void ClickDuplictbton() {
		Duplicatebuton.click();
	}
	
}

