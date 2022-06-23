package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContactInformationPage {
@FindBy(name = "lastname") private WebElement LastnmeTextEdt;
@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]") private WebElement SaveButon;

public WebElement getSaveButon() {
	return SaveButon;
}

public EditContactInformationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLastnmeTextEdt() {
	return LastnmeTextEdt;
}

public void LastNameEdit() {
	LastnmeTextEdt.clear();
	LastnmeTextEdt.sendKeys("Piyush");
	SaveButon.click();
}
}