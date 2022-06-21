package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricsUtilities.WebDriverUtility;

public class Contactinfopage extends WebDriverUtility{
	@FindBy(xpath = "//span[@class=\"dvHeaderText\"]") private WebElement ContactInfoName;
	

	public Contactinfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getContactInfoName() {
		return ContactInfoName;
	}
	public String Infoname() {
		return ContactInfoName.getText();
		
	}
}
