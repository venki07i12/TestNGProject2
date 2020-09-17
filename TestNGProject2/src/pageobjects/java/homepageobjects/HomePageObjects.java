package homepageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class HomePageObjects extends BaseLibrary {
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using = "//a[contains(.,'REGISTER')]")
	public WebElement Register;
	

	@FindBy(how=How.XPATH, using = "//input[contains(@name,'lastName')]")
	public WebElement lastname;
	
	@FindBy(how=How.XPATH, using = "//input[contains(@name,'phone')]")
	public WebElement phone;
	
	@FindBy(how=How.XPATH, using = "//input[contains(@name,'address1')]")
	public WebElement Address;
	
	@FindBy(how=How.XPATH, using = "//input[@name='city']")
	public WebElement city;
	
	@FindBy(how=How.XPATH, using = "//input[contains(@name,'state')]")
	public WebElement state;
	
	@FindBy(how=How.XPATH, using = "//input[contains(@name,'postalCode')]")
	public WebElement postalcode;
	
	@FindBy(how=How.XPATH, using = "//input[@id='email']")
	public WebElement username;
	
	@FindBy(how=How.XPATH, using = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using = "//input[@name='confirmPassword']")
	public WebElement confirmpwd;
	
	@FindBy(how=How.XPATH, using = "//input[contains(@name,'submit')]")
	public WebElement submit;
}
