package gw.qa.guidewiretest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gw.qa.guidewirebase.TestBase;
import gw.qa.guidewirepages.FNOLPolicySearchPage;
import gw.qa.guidewirepages.HomePage;
import gw.qa.guidewirepages.LoginPage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	FNOLPolicySearchPage fnolSearchPage;
	
	/*@Test(groups= {"maingroup"})
	public void Test0() {
		System.out.println("This is Test0 Test method in HomePageTest class");
		Assert.assertEquals(true, false);
		
	}*/
	
	/*public HomePageTest(){
		
		super();
		System.out.println("in home page test constructor");
		
	}
	
	@BeforeMethod
	public void setUp(){
	   launchBrowser();	
		loginpage = new LoginPage();
	}
	
	@Test
	public void homePageTitleTest(){	
		homepage = loginpage.validateLogin();	
		//Assert.assertEquals(homepage.homeLogo(), true);
		fnolSearchPage = homepage.navPolicySearch();
		
	}
	
	
	
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}*/
	
	
	

}
