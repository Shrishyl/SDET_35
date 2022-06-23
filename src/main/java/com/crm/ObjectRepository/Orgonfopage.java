package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgonfopage {
	@FindBy(xpath = "//span[@class='dvHeaderText']") private WebElement Orginfoname;
	
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']") private WebElement FirstnameTexedit;

	public Orgonfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTexedit() {
		return FirstnameTexedit;
	}

	public WebElement getOrginfoname() {
		return Orginfoname;
	}
	public String Orginfoname() {
		return FirstnameTexedit.getText();
	}
}
