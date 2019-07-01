package gw.qa.guidewiretest;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import gw.qa.guidewirebase.TestBase;
import gw.qa.guidewirepages.LoginPage;
import gw.qa.util.GetLoginData;

public class LoginPageTest extends TestBase{
	LoginPage login;
	public LoginPageTest(){	
		super();
		System.out.println(" in LoginPageTest constructor ");
	}
	
	@BeforeMethod
	public void setUp() {
		launchBrowser();
		login = new LoginPage();
		//homepage = new HomePage();
		//polsearchpage = new FNOLPolicySearchPage();
	}
	
//	@Test(priority=1)
//	public void loginTitleTest() {
//		System.out.println("in loginTitleTest method" +  login.validateGWTitle());
//		Assert.assertEquals(login.validateGWTitle(), "[DEV mode - 6.0.0.103] Guidewire ClaimCenter");	
//	}
	
	@DataProvider
	public Iterator<Object[]> getMydata() {
		ArrayList<Object[]> logindata = GetLoginData.getData();
		return logindata.iterator();
	}
	
	@Test(dataProvider = "getMydata")
	public void loginTest(String username,String password) {
		System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiii" + login);
		login.validateLogin(username,password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		//homepage = new HomePage();
		//polsearchpage = new FNOLPolicySearchPage();
	}

}
