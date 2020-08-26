package baselibrary;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class Utility extends BaseLibrary{

	
	public void click(WebElement ele, String elementname) throws Throwable
	{
		try {
			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			System.out.println("Clicked on element " + elementname);
			logger.log(LogStatus.PASS, "Should click on element " + elementname, "Clicked on element " + elementname + logger.addScreenCapture(takeScreenShot(driver)));
		} catch (Exception e) {
			System.out.println("Not Clicked on element " + elementname);
			System.out.println(e);
			logger.log(LogStatus.FAIL, "Should click on element " + elementname, "Not Clicked on element " + elementname + "Due to" +e +"<br>" + logger.addScreenCapture(takeScreenShot(driver)));
		}
		
	}
	
	public void verifyelement(WebElement ele, String elementname) throws Throwable
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.isDisplayed();
			System.out.println(elementname + " Element is Displayed");
			logger.log(LogStatus.PASS, "Should Display the element " + elementname, "Element is Diplayed " + elementname + logger.addScreenCapture(takeScreenShot(driver)));
		}catch (Exception e) {
			System.out.println(elementname + " Element not Displayed");
			System.out.println(e);
			logger.log(LogStatus.FAIL, "Should Display the element " + elementname, "Element is not Diplayed " + elementname + "Due to" +e + logger.addScreenCapture(takeScreenShot(driver)));
		}
		
	}
	
	public void entertext(WebElement ele, String elementname) throws Throwable
	{
		try {
			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.clear();
			ele.sendKeys(elementname);
			System.out.println("Entered Value is " + elementname);
			logger.log(LogStatus.PASS, "Should enter any value " + elementname, "Entered the value " + elementname + logger.addScreenCapture(takeScreenShot(driver)));
		} catch (Exception e) {
			System.out.println("Not Entered any Value is " + elementname);
			System.out.println(e);
			logger.log(LogStatus.FAIL, "Should enter any value " + elementname, "Not Entered the value " + elementname + "Due to" +e +"<br>" + logger.addScreenCapture(takeScreenShot(driver)));
		}
		
	}
	
		public void xpathclick(String xpath)
		{
			driver.findElement(By.xpath(xpath)).click();
		
		}
	
		public void xpathentervalue(String xpath, String text)
		{
			try {
				driver.findElement(By.xpath(xpath)).sendKeys(text);
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
		
		}
	
	
	
}

