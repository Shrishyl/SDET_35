package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage 
{
@FindBy(name="productname")
private WebElement proName;

@FindBy(name="button")
private WebElement savebtn;

public CreateNewProductPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getProName() {
	return proName;
}

public WebElement getSavebtn() {
	return savebtn;
}


}
