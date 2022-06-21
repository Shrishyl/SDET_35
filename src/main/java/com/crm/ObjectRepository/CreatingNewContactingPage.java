package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricsUtilities.WebDriverUtility;

public class CreatingNewContactingPage extends WebDriverUtility {
	
	@FindBy(name = "firstname") private WebElement FirstNameTextEdit;
	
	@FindBy(name = "lastname") private WebElement LastNameTextEdit;
	
	@FindBy(name = "leadsource") private WebElement Leaddropdown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement Savebuton;
	
	public CreatingNewContactingPage(WebDriver driver) {
	 
		PageFactory.initElements(driver, this);
  
}

	public WebElement getFirstNameTextEdit() {
		return FirstNameTextEdit;
	}

	public WebElement getLastNameTextEdit() {
		return LastNameTextEdit;
	}

	public WebElement getLeaddropdown() {
		return Leaddropdown;
	}

	public WebElement getSavebuton() {
		return Savebuton;
	}
	public String firstname() {
		return FirstNameTextEdit.getText();
		
	}
	
	public void Leaddropdown() {
		SelectDropdownBYvText(Leaddropdown, "Employee");
	}
	
	public void CreateContact() {
		Savebuton.click();
	}
}