package testpackage;



import org.testng.annotations.Test;


import baselibrary.Utility;
import homepageobjects.HomePageObjects;


public class Testclass extends Utility {

	@Test
	public void register1() throws Throwable
	{
		StartTest("Verify chrome Register page");
		HomePageObjects hm = new HomePageObjects(driver);
		click(hm.Register, "Register");
		verifyelement(hm.Register, "Register");
		endTest();
	}
	
	
	@Test
	public void signup() throws Throwable
	{
		StartTest("Fill the registartion form");
		HomePageObjects hm = new HomePageObjects(driver);
		xpathentervalue("//input[contains(@name,'xyz')]", "welcome");
		entertext(hm.lastname, "ippa");
		entertext(hm.phone, "9553440104");
		entertext(hm.city, "Hyderabad");
		entertext(hm.state, "Telangana");
		entertext(hm.postalcode, "500091");
		entertext(hm.username, "venkat");
		entertext(hm.password, "venkat");
		entertext(hm.confirmpwd, "venkat");
		click(hm.submit, "submit");
		endTest();
	}
	
	
}
