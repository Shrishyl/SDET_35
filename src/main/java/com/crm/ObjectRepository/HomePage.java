package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricsUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{


// Declaration
@FindBy(linkText = "Organizations")
private WebElement OrganizationsLnk;

@FindBy(linkText = "Contacts")
private WebElement ContactsLnk;

@FindBy(linkText = "Products")
private WebElement ProductsLnk;
	
@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
private WebElement moreLnk;

@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement AdministatorLnk;

@FindBy(linkText = "Sign Out")
private WebElement SingoutLnk;
//initialization
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public WebElement getOrganizationsLnk() {
	return OrganizationsLnk;
}
public WebElement getContactsLnk() {
	return ContactsLnk;
}
public WebElement getProductsLnk() {
	return ProductsLnk;
}
public WebElement getMoreLnk() {
	return moreLnk;
}
public WebElement getAdministatorLnk() {
	return AdministatorLnk;
}
public WebElement getSingoutLnk() {
	return SingoutLnk;
}
//utilization
public void logout(WebDriver driver) {
	MouseOveranElement(driver, AdministatorLnk);
	SingoutLnk.click();
}
}