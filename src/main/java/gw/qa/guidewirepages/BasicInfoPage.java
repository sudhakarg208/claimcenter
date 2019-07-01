package gw.qa.guidewirepages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import gw.qa.guidewirebase.TestBase;

public class BasicInfoPage extends TestBase{
	
	@FindBy(xpath="//select[@name='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name']")
	WebElement reportedname;
	
	@FindBy(xpath="//select[@name='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_ReportedByType']")
	WebElement relationtoinsured;
	
	@FindBy(xpath="//span[text()='Next >']")
	WebElement next;
	
	/*@FindBy(xpath="//a[@id='NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton']")
	WebElement close;*/
	
	
	public BasicInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LossDetailsPage validateBasicInfo() {	
		Select reportername = new Select(reportedname);
		reportername.selectByIndex(2);
		Select insuredrelation = new Select(relationtoinsured);
		insuredrelation.selectByIndex(3);
		next.click();
		
		try {
			boolean closeelement = driver.findElement(By.xpath("//a[@id='NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton']")).isDisplayed();
			System.out.println("in try blockkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
			if(closeelement) {
				WebElement element = driver.findElement(By.xpath("//a[@id='NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton']"));			
				element.click();
				
		}}catch(NoSuchElementException ex) {
			System.out.println("Element not found");
		}
		Actions actions = new Actions(driver);
		
		
		actions.contextClick(driver.findElement(By.xpath("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_homephone']")));
		next.click();
		return new LossDetailsPage();
	}
}
