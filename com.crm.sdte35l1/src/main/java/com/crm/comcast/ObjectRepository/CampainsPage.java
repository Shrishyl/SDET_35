package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampainsPage
{
	@FindBy(partialLinkText="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateNewCampImg;

public  CampainsPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public WebElement getCreateNewCampImg() {
	return CreateNewCampImg;
}
public void getnewcampBtn()
{
	CreateNewCampImg.click();
}

}
