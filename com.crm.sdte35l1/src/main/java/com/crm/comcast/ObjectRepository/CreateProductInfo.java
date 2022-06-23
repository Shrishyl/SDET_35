package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductInfo {
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement infopage;
	
	public CreateProductInfo(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getInfopage() {
		return infopage;
		
		
		
	}
	
	

}
