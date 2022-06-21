 package genaricsUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     
	
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	
	/**
	 * Connect the database
	 */
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void Dbconfig() {
		dLib.Dbconnectin();
	}
	//@Parameters("BROWSER")
@BeforeClass(groups= {"smokeTest","regressionTest"})
public void launchTheBrowser() throws Throwable {
	String BROWSER = fLib.getProperKeyValue("browser");
  String URL = fLib.getProperKeyValue("url");
  if(BROWSER.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
  }else if (BROWSER.equalsIgnoreCase("firefox")) {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
  }else {
	  driver=new ChromeDriver();
  }
  // imlicitwait 
  sdriver=driver;
  wLib.WaitForPageLoad(driver);
  // enter the URL of the Application
  sdriver.get(URL);
  //maximize the broser
  driver.manage().window().maximize();
}
/**
 * login to application
 * @throws Throwable 
 */
@BeforeMethod(groups= {"smokeTest","regressionTest"})
public void logintoapplin() throws Throwable {
	String USERNAME = fLib.getProperKeyValue("username");
	String PASSWORD = fLib.getProperKeyValue("password");
	LoginPage lapge =new LoginPage(driver);
	lapge.LoginToapplication(USERNAME, PASSWORD);
}
/**
 * Logout from the Applictin 
 */
@AfterMethod(groups= {"smokeTest","regressionTest"})
public void logoutFromApp() {
	HomePage hpage=new HomePage(driver);
	hpage.logout(driver);
}
/**
 * close the browser
 */
@AfterClass(groups= {"smokeTest","regressionTest"})
public void CloseTheBrowser() {
	driver.quit();
}
/**
 * close the database
 */
@AfterSuite(groups= {"smokeTest","regressionTest"})
public void CloseTheConfig()
{
	
}
}