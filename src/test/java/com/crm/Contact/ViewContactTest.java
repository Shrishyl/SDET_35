package com.crm.Contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.ContactHomePage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LastViewPage;
import com.crm.ObjectRepository.LoginPage;

import genaricsUtilities.BaseClass;
import genaricsUtilities.ExcelUtility;
import genaricsUtilities.FileUtility;
import genaricsUtilities.JavaUtility;
import genaricsUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewContactTest extends BaseClass {

	@Test(groups="regressionTest")
	public void ViewTest() {


		// To get randum Number
		int randamNum = jLib.getRandomNUmber();
		

			//	click on contack link
			ContactHomePage cpage=new ContactHomePage(driver);
			cpage.ClickonContactPage();
			// click on the Lastview image and close dropown
			LastViewPage lapage=new LastViewPage(driver);
			lapage.ClickonLastviewImg();
			


		}
	}
