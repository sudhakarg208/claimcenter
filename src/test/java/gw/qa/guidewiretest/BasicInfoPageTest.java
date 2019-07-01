package gw.qa.guidewiretest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import gw.qa.guidewirebase.TestBase;
import gw.qa.guidewirepages.BasicInfoPage;
import gw.qa.guidewirepages.FNOLPolicySearchPage;
import gw.qa.guidewirepages.HomePage;
import gw.qa.guidewirepages.LoginPage;

public class BasicInfoPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	FNOLPolicySearchPage polsearchpage;
	BasicInfoPage basicinfopage;
	
	public BasicInfoPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginpage = new LoginPage();
		//homepage = new HomePage();
		//polsearchpage = new FNOLPolicySearchPage();
	}
	
	@Test
	public void searchPolicyTest() {
		//homepage = loginpage.validateLogin();
		polsearchpage = homepage.navPolicySearch();
		basicinfopage = polsearchpage.validateSearch();
		basicinfopage.validateBasicInfo();
		
		System.out.println("Succesfully executed BasicInfo page");
	}
		
	@AfterMethod
	public void quit() throws InterruptedException{
		Thread.sleep(5000);
		//driver.quit();
	}

}
