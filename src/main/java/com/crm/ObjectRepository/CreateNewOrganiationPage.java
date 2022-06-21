package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricsUtilities.WebDriverUtility;

public class CreateNewOrganiationPage extends WebDriverUtility{
	// declaration
	@FindBy(name = "accountname") private WebElement OrganazationTextEdit;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement savaButon;
	
    @FindBy(name = "industry") private WebElement IndustryDropdown;
    
    @FindBy(name = "accounttype") private WebElement typeDropDown;
    
    // inialization
    public CreateNewOrganiationPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    //utilization

	public WebElement getOrganazationTextEdit() {
		return OrganazationTextEdit;
		
	}

	public WebElement getSavaButon() {
		return savaButon;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

    public void selectIndustry() {
    	SelectDropdownBYvText(IndustryDropdown, "Banking");
   }
    public void selectType() {
    	SelectDropdownBYvText(typeDropDown, "Customer");
    	
    }   	
	
	public void CreateNewOrg() {
		getOrganazationTextEdit().sendKeys("ram");
		
	}
	public void Savebuton() {
		savaButon.click();
	}
	
}
