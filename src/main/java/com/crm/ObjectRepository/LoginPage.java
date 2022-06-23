package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	
	@FindBy(name="user_name")
	private WebElement usernameTxtEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordTxtEdt;
	
	@FindBy(id = "submitButton")
	private WebElement submitBtn;
	
	// initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// business libraries
          
	public WebElement getUsernameTxtEdt() {
		return usernameTxtEdt;
	}

	public WebElement getPasswordTxtEdt() {
		return passwordTxtEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	// utilization
	public void LoginToapplication ( String username,String password) {
		usernameTxtEdt.sendKeys(username);
		passwordTxtEdt.sendKeys(password);
		submitBtn.click();
	}
}