package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuplicatingPage {
@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]") private WebElement Savebuton;

public DuplicatingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSavebuton() {
	return Savebuton;
}
public void ClickonSavebtn() {
	Savebuton.click();
}
}
