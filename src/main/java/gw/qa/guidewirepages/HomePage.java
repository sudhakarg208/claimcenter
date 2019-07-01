package gw.qa.guidewirepages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gw.qa.guidewirebase.TestBase;

public class HomePage extends TestBase{
	
	static int count = 10;
	LoginPage loginpage;
	HomePage homepage;
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement logo;
	
	@FindBy(xpath="//a[@id='TabBar:ClaimTab_arrow']")//(xpath="//span[@class='menu_arrow_tab_on']")
	WebElement newClaimPicker;
	
	@FindBy(xpath="//a[@id='TabBar:ClaimTab:ClaimTab_FNOLWizard']")
	WebElement newClaimlink;
	
	public HomePage(){	
		count = 20;
		PageFactory.initElements(driver, this);	
		loginpage = new LoginPage();
	}
	
	public boolean homeLogo() {	
		count = 20;
		//loginpage.validateLogin();
		return logo.isDisplayed();
	}
	
	public FNOLPolicySearchPage navPolicySearch() {
		
		//WebDriverWait driverWait = new WebDriverWait(driver, 10);
		//driverWait.wai
		//newClaimPicker.
		//Actions actions = new Actions(driver);
		//actions.moveToElement(newClaimPicker).click().build().perform();
		
		//WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(newClaimPicker));
		newClaimPicker.click();
		newClaimlink.click();
		
		return new FNOLPolicySearchPage();
	}
	
	
	
	

}
