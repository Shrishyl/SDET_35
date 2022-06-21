package genaricsUtilities;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * contains all reusable Actions of Webdriver
 * @author DELL
 *
 */
public class WebDriverUtility {
	/**
	 * its an implicitly wait Always wait for Element in DOM document & release the control if element is Available 
	 *@param driver
	 */
	public void WaitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * it will wait for is Elements 
	 * @param driver
	 */
	public void WaitForPageToLoadForJSElement(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}
	/**
	 * it will check for the Element in GUI for polling time of500ms
	 * @param driver
	 * @param Element 
	 */
	public void WaitForElementToClickble(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * it will check for the title in GUI for polling time of 500ms
	 * @param driver
	 * @param title
	 */
	public void WaitForTitleContains(WebDriver driver,String title) {
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
	}
	/**
	 * here we can change polling time from default 500ms to any polling time
	 * @param driver
	 * @param polling
	 * @param element 
	 */
	public void WaitForElementCustom( WebDriver driver,int pollingTime,WebElement element) {
		FluentWait wait= new FluentWait(driver);
		wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * here we are giving custom timeout
	 * @param driver
	 * throws InterruptedExecption
	 */
	public void waitAndClick(WebElement element) throws InterruptedException {
		int count=0;
		while(count<10)
		{  
		
			
			try {
				element.click();
			}catch (Exception e) {
				Thread.sleep(5000);
				count++;
			}
		}
	}
	/**
	 * here used to switch from one window to another window 
	 * @param driver
	 * @param parrtialwindow
	 */
	public void SwitchWindow(WebDriver driver, String patialWindow) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String Wtle = it.next();
			driver.switchTo().window(Wtle);
			String currentwindow = driver.getTitle();
			if (currentwindow.contains(patialWindow)) {
				break;
			}
		}               
	}
	/**
	 * switch to one frame to another frame by using index
	 * @param driver
	 * @param index

	 *
	 */
	public void SwitchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);	
	}
	/**
	 * switch from one frame to another frame by using id_attribute
	 * @param driver
	 * @param id_attribute
	 */
	public void SwitchToFrame(WebDriver driver,String id_attribute) {
		driver.switchTo().frame(id_attribute);
	}
	/**
	 * switch one frame to another frame by using absolute_path
	 * @param driver
	 * @param element
	 */
	public void SwitchToAlertPopUpAndAccept(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * it is used to switch back from one child frame to parent frame
	 * @param driver
	 */
	public void SwitchBackMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * it used to switch alert pop up and accept
	 * @param driver
	 */
	public void SwitchToAleretPopAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * its used switch to alert pop up and dismiss
	 * @param driver
	 */
	public void SwitchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * it is used to switch to select dropdown by using index
	 * @param element
	 * @param index
	 */
	public void SelcectDropdown(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * it is used to switch to select dropdown by using value
	 * @param element
	 * @param value
	 */
	public void SelectDropdown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	/** 
	 * it is used to switch to select by using VisableText
	 * @param element
	 * @param visible_text
	 */
	public void SelectDropdownBYvText(WebElement element, String visible_text) {
		Select select =new Select(element);
		select.selectByVisibleText(visible_text);
	}
	
	
	
	/**
	 * it is use Mouse over an element
	 * @param driver
	 * @param element 
	 */
	public void MouseOveranElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	/**
	 * its used to right click on element
	 * @param driver
	 * @param element
	 */
	public void RghtClickAnElement(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick().perform();
	}
	/**
	 * it is used to click on Enter button by using keyboard actions
	 * @param driver
	 */
	public void ClickOnEnterButton(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER);
	}
	/**
	 * it is used to TakeScreenshot
	 * @param driver
	 * @param screenShotname
	 * @throws Throwable
	 */
	public void TakeScreenShot(WebDriver driver, String errorshotName)throws Throwable{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./errorshot/"+errorshotName+".png");
		Files.copy(src, dst);
	}
	/**
	 * it is used scroll bar Actions
	 * @param driver
	 */
	public void ScrollBarAcction(WebDriver driver) {
		JavascriptExecutor jvsp=(JavascriptExecutor)driver;
		jvsp.executeScript("window.scrollBy(0.500)");
	}




}	