package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
@FindBy(name="salutationtype")
private WebElement fnameDD;

@FindBy(name="firstname")
private WebElement firstname;

@FindBy(name="lastname")
private WebElement lastname;

@FindBy(name="button")
private WebElement savebtn;


public CreateNewContactPage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getFnameDD() {
	return fnameDD;
}


public WebElement getFirstname() {
	return firstname;
}


public WebElement getLastname() {
	return lastname;
}


public WebElement getSavebtn() {
	return savebtn;
}






}
