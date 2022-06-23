package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage {
	// declarisation
@FindBy(id = "id=\"dtlview_Organization Name\"") private WebElement OrgheaderTextEdt;

// initializaton
public OrganisationInfoPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getOrgheaderTextEdt() {
	return OrgheaderTextEdt;
}
public void checkorganame() {
	OrgheaderTextEdt.isEnabled();
}
}
