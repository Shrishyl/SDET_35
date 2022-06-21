package com.crm.Contact;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.ContactHomePage;
import com.crm.ObjectRepository.ContactInformationPage;
import com.crm.ObjectRepository.ContactPage;
import com.crm.ObjectRepository.DuplicatingPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

import genaricsUtilities.BaseClass;
import genaricsUtilities.ExcelUtility;
import genaricsUtilities.FileUtility;
import genaricsUtilities.JavaUtility;
import genaricsUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewContact17Test extends BaseClass {
	@Test(groups="smokeTest")
	public void View17() {
		
		// click on the Contact link
		 ContactHomePage chpage=new ContactHomePage(driver);
		 chpage.ClickonContactPage();
		 // select one contact and click the contactname
		 ContactPage cpage=new ContactPage(driver);
		 cpage.getContactname().click();
       //  navigate contact inapage and Click on the Duplicate button
		 
	      ContactInformationPage cinfopage =new ContactInformationPage(driver);
	      cinfopage.ClickDuplictbton();
	      
	      // click save duplicate 
	      DuplicatingPage dpage =new DuplicatingPage(driver);
	      dpage.ClickonSavebtn();
       
	      
		
		

	}
}