package gw.qa.guidewiretest;

import gw.qa.guidewirebase.TestBase;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import gw.qa.guidewirepages.BasicInfoPage;
import gw.qa.guidewirepages.FNOLPolicySearchPage;
import gw.qa.guidewirepages.HomePage;
import gw.qa.guidewirepages.LoginPage;
import gw.qa.guidewirepages.LossDetailsPage;
import gw.qa.util.GWCustomeListener;
import gw.qa.util.GetLoginData;
import gw.qa.util.GetWitnessData;
import gw.qa.util.RetryAnalyzer;
import junit.framework.Assert;

@Listeners(GWCustomeListener.class)
public class LossDetailsTest extends TestBase{

		LoginPage loginpage;
		HomePage homepage;
		FNOLPolicySearchPage polsearchpage;
		BasicInfoPage basicinfopage;
		LossDetailsPage lossdetailspage;
		
		public LossDetailsTest() {
			super();
		}
		
		@BeforeTest
		public void setUp() {
			launchBrowser();
			//Assert.assertEquals(true, false);
			loginpage = new LoginPage();
			homepage = loginpage.validateLogin("su","gw");
			polsearchpage = homepage.navPolicySearch();
			basicinfopage = polsearchpage.validateSearch();
			lossdetailspage = basicinfopage.validateBasicInfo();
			//homepage = new HomePage();
			//polsearchpage = new FNOLPolicySearchPage();
		}
		@DataProvider
		public Iterator<Object[]> getMydata() {
			ArrayList<Object[]> logindata = GetLoginData.getData();
			return logindata.iterator();
		}
		
		@DataProvider
		public Iterator<Object[]> getWitnessData(){
			ArrayList<Object[]> witnessData = GetWitnessData.getData();
			return witnessData.iterator();
		}
		
		
		@Test(dataProvider="getWitnessData")
		public void claimTest(String lastName, String perspective) throws InterruptedException {
			//Assert.assertEquals(true, false);
			/*homepage = loginpage.validateLogin("su","gw");
			polsearchpage = homepage.navPolicySearch();
			basicinfopage = polsearchpage.validateSearch();
			lossdetailspage = basicinfopage.validateBasicInfo();*/
			lossdetailspage.validateLossDetails(lastName,perspective);
			Thread.sleep(5000);
			Actions act = new Actions(driver);
			act.build().perform();
			
			
			System.out.println("Succesfully executed BasicInfo page");
		}
			
		@AfterTest
		public void quit() throws InterruptedException{
			/*@FindBy(xpath="//a[@id='FNOLWizard:Finish']")
			WebElement finishclaim;*/
			//driver.findElement(By.xpath("//a[@id='FNOLWizard:Finish']")).click();
			//finishclaim.click();
			//Thread.sleep(5000);
			//driver.quit();
		}

	}

