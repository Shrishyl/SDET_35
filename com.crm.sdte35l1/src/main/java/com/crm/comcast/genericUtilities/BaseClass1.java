package com.crm.comcast.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.comcast.ObjectRepository.HomePage;
import com.crm.comcast.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
public static WebDriver sdriver;

public WebDriver driver;
	
	public WebDriverUtility WLib=new WebDriverUtility();
	public ExcelUtility ELib=new ExcelUtility();
	public JavaUtility JLib=new JavaUtility();
	public FileUtility FLib=new FileUtility();
	public DataBaseUtility DLib=new DataBaseUtility();
	
	/**
	 * data base connection
	 */	
@BeforeSuite

public void dbconfig()
{
	DLib.ConnectToDb();
	
}

/**
 * Launching the browser
 * @throws Throwable 
 */


@BeforeClass

public void launchTheBrowser() throws Throwable
{
	String BROWSER = FLib.getPropertyKeyValue("browser");
	String URL = FLib.getPropertyKeyValue("url");
	if (BROWSER.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	sdriver=driver;
	WLib.waitForPageToLoad(driver);
	//WLib.waitForPageToLoadJSElement(driver);
	
	driver.get(URL);
	
	driver.manage().window().maximize();
	
}

/**
 * Login to application
 * @throws Throwable 
 */
@BeforeMethod

public void LoginToApp() throws Throwable

{
	String USERNAME = FLib.getPropertyKeyValue("username");
	String PASSWORD = FLib.getPropertyKeyValue("password");
	
	LoginPage lp=new LoginPage(driver);
	lp.LoginToApp(USERNAME, PASSWORD);
	
}

/**
 * Logout to application
 */

@AfterMethod

public void LogoutToApp() throws Throwable

{

/*HomePage hp=new HomePage(driver);
hp.SignOut(driver);*/
}

/**
 * Close the browser
 */

@AfterClass

public void CloseTheBrowser() throws Throwable

{

driver.quit();

}

/**
 * close db connection
 */

@AfterSuite

public void CloseDb()
{
	DLib.CloseDb();
	
}

}
