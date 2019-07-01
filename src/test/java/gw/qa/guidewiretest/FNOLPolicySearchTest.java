package gw.qa.guidewiretest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gw.qa.guidewirebase.TestBase;
import gw.qa.guidewirepages.FNOLPolicySearchPage;
import gw.qa.guidewirepages.HomePage;
import gw.qa.guidewirepages.LoginPage;

public class FNOLPolicySearchTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	FNOLPolicySearchPage polsearchpage;
	
	public FNOLPolicySearchTest() {
		// TODO Auto-generated constructor stub
		super();		
	}
	
	/*@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginpage = new LoginPage();
	}*/
	
	@Test(groups= {"maingroup"})
	public void Test0() {
		System.out.println("This is Test0 Test method");
	}
	
	@Test(groups= {"optionalgroup"},dependsOnGroups= {"maingroup"})
	public void Test2() {
		System.out.println("This is Test2 Test method");
	}
	
	/*@Test(groups= {"optionalgroup","maingroup"})
	public void Test1() {
		System.out.println("This is Test1 optional Test method");
	}
	
	@Test(dependsOnMethods = {"Test1"})
	public void Test3() {
		System.out.println("This is Test3 optional Test method");
	}*/
	
	
	/*@Test(dependsOnGroups = {"optionalgroup"})
	public void loginTest() {
		System.out.println("In loginTest");
		//Assert.assertEquals(true, false);
		homepage = loginpage.validateLogin();
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPolicyTest() {
		System.out.println("In searchpolicytest method");
		homepage = loginpage.validateLogin();
		polsearchpage = homepage.navPolicySearch();
		polsearchpage.validateSearch();
		System.out.println("Succesfully executed policy search");
	}
	*/
	
	/*@AfterMethod
	public void quit() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}*/
	
	

}
