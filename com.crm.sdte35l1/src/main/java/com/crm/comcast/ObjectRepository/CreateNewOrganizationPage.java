package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility
{
	
	@FindBy(name="accountname")
	private WebElement accName;
	
	@FindBy(name="industry")
	private WebElement industry;
	
	@FindBy(name="accounttype")
	private WebElement accType;
	
	@FindBy(xpath="//input[title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectMember;
	
	public CreateNewOrganizationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccName() {
		return accName;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getAccType() {
		return accType;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSelectMember() {
		return selectMember;
	}
	
	public void selectMember()
	{
		getSelectMember().click();
	}
	
	
}
