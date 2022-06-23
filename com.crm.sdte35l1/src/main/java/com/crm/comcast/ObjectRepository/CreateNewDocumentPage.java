package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewDocumentPage 
{
	@FindBy(name="notes_title")
	private WebElement titlename;

	@FindBy(name="button")
	private WebElement savebtn;
	
	public CreateNewDocumentPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTitlename() {
		return titlename;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
}
