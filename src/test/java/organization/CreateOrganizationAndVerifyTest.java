package organization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.CreateNewOrganiationPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.OrganisationInfoPage;
import com.crm.ObjectRepository.OrganizationPage;
import com.crm.ObjectRepository.Orgonfopage;

import genaricsUtilities.BaseClass;
import genaricsUtilities.ExcelUtility;
import genaricsUtilities.FileUtility;
import genaricsUtilities.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationAndVerifyTest extends BaseClass {
	@Test
	public void CreateOrgTest() {
		//hi
		// random number 
		int ranNum = jLib.getRandomNUmber();
		
		// click enter the username &password and click on login button
		HomePage hpage=new HomePage(driver);
		hpage.getOrganizationsLnk().click();

		// click on the organization lookupimage
		OrganizationPage opage=new OrganizationPage(driver);
		opage.ClickonCreateOrgLkp();

       // enter the orgnizaton name select Industry dropdown &type dropdown click on save buton
		CreateNewOrganiationPage cnpage=new CreateNewOrganiationPage(driver);
		cnpage.CreateNewOrg();
		cnpage.selectIndustry();
		cnpage.selectType();
		cnpage.getSavaButon().click();
		
		// to verify ogrInfo page 
		Orgonfopage onpage=new Orgonfopage(driver);
		String a = onpage.Orginfoname();
		
		Assert.assertTrue(a.contains(cnpage.getOrganazationTextEdit().getText()));
		
	
	}
}
