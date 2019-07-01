package gw.qa.guidewirepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gw.qa.guidewirebase.TestBase;

public class FNOLPolicySearchPage extends TestBase{
	
	@FindBy(xpath="//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//span[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Search_link']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate']")
	WebElement lossDate;
	
	@FindBy(xpath="//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_lossTime']")
	WebElement lossTime;
	
	@FindBy(xpath="//span[text()='Next >']")
	WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Step 1: Search or Create Policy']")
	WebElement policysearchtitle;
	
	public FNOLPolicySearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validatePolSearchTitle() {	
		return policysearchtitle.isDisplayed();
	}
	
	public BasicInfoPage validateSearch(){
		try {
		lastName.sendKeys("d");
		search.click();
		lossDate.clear();
		lossDate.sendKeys("05/23/2019");		
		lossTime.clear();
		Thread.sleep(5000);
		lossTime.sendKeys("10:25 AM");
		nextButton.click();		
		}
		catch(Exception exception) {
			
		}
		return new BasicInfoPage();	
	}
	
	
	

}
