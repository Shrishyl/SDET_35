package com.crm.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastViewPage {
	@FindBy(xpath = "//img[@title='Last Viewed']") private WebElement LastViewLokupimg;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]") private WebElement ClosedLastview;
	
	
	public LastViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastViewLokupimg() {
		return LastViewLokupimg;
	}
	
	public WebElement getClosedLastview() {
		return ClosedLastview;
	}

	public void ClickonLastviewImg() {
		LastViewLokupimg.click();
		ClosedLastview.click();
	}

}
	