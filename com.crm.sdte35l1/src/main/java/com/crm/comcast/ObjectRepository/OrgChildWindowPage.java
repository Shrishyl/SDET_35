package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgChildWindowPage
{
	@FindBy(linkText = "Nike212")
	private WebElement Lnk;
	
	

public OrgChildWindowPage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}

public void getAdidasLnk()
{
	Lnk.click();
	}

}