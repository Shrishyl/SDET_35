package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility
{
	WebDriver driver;
	
	//declaration
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement orgLnk;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLnk;

	@FindBy(linkText = "Products")
	private WebElement productsLnk;
	
	@FindBy(linkText = "Documents")
	private WebElement Doclnk;
	
	@FindBy(linkText = "Opportunities")
	private WebElement Opportunities;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreLnk;
	
	/*@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorimg;
	
	@FindBy(xpath="//a[.='Sign Out']")
	//@FindBys({@FindBy(linkText = "Sign Out"),@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")})
	private WebElement signOutLnk;*/
	
	@FindBy(name = "Campaigns")
	private WebElement Campaignslnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreimg;
	
	//initializaztion
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public WebElement getOrgLnk() 	
		{
		return orgLnk;
	}

		public WebElement getProductsLnk() {
			return productsLnk;
		}
		
		

		public WebElement getDoclnk() {
			return Doclnk;
		}

		public WebElement getContactsLnk() {
			return contactsLnk;
		}

		public WebElement getMoreLnk() {
			return moreLnk;
		}

		/*public WebElement getAdministratorimg() {
			return administratorimg;
		}

		public WebElement getSignOutLnk() {
			return signOutLnk;
		}*/
		
		public WebElement getCampaignslnk() {
			return Campaignslnk;
			
			
		}

		public WebElement getMorelnk() {
			return moreimg;
		}
		
		

		/* void SignOut(WebDriver driver)
		{
			mouseOverAnElement(driver, administratorimg);
			signOutLnk.click();
			
		}*/
		
		
		
		
		
	}
