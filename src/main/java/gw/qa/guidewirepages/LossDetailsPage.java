package gw.qa.guidewirepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import gw.qa.guidewirebase.TestBase;

public class LossDetailsPage extends TestBase{
	
	@FindBy(xpath="//select[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:NewLossDetailsHomeownersDV:Claim_LossCause']")
	WebElement losscause;
	
	@FindBy(xpath="//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:NewLossDetailsHomeownersDV:Status_IncidentReport_true']")
	WebElement incidentonly;
	
	@FindBy(xpath="//a[@id='FNOLWizard:Finish']")
	WebElement finishclaim;
	
	@FindBy(xpath="//a[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV_tb:Add']//child::span[text()='Add']")
	WebElement addWitness;
	
	/*@FindBy(xpath="//select[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:0:EditableWitnesses_WitnessStatementInd']")
	WebElement selectStatement;*/
	
	@FindBy(xpath="//select[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:0:Contact']")
	WebElement selectName;
	
	@FindBy(xpath="//select[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:0:EditableWitnesses_WitnessPosition']")
	WebElement selectWitness;
	
	@FindBy(xpath="//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:0:EditableWitnesses_WitnessPerspective']")
	WebElement perspective;
	
	@FindBy(xpath="//a[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:0:Contact:ContactMenuIcon']")
	WebElement namePicker;
	
	@FindBy(xpath="//input[@id='NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:LastName']")
	WebElement lastName;
	
	
	
	
	@FindBy(xpath="//a[@id='NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:Update']")
	WebElement ok;
	
	static int count = 1;
	static int newpersonCount = 0;
	
	public 	LossDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ClaimCreatedPage validateLossDetails(String lastNam,String perspectiv){
		
		Select selectloss = new Select(losscause);
		selectloss.selectByIndex(2);
		addWitness.click();
		count++;
		System.out.println("count is " + count);
			
		WebElement pickerName = driver.findElement(By.xpath("//table[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV']//tr["+count+"]//a[1]"));
		WebElement newPerson = driver.findElement(By.xpath("//a[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV:"+newpersonCount+":Contact:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson']"));
		newpersonCount++;
		System.out.println("newpersonCount is " + newpersonCount);
		pickerName.click();
		newPerson.click();
		lastName.sendKeys(lastNam);
		
		ok.click();
		WebElement selectStatement = driver.findElement(By.xpath("//table[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV']//tr["+count+"]//td[1]//following-sibling::td[2]//select"));
		
		Select selectStmt = new Select(selectStatement);
		selectStmt.selectByIndex(1);
		
		WebElement selectperspect = driver.findElement(By.xpath("//table[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsPanel:FNOLWizard_NewLossDetailsPanelSet:WitnessLV:EditableWitnessesLV']//tr["+count+"]//td[1]//following-sibling::td[4]//input"));
		selectperspect.sendKeys(perspectiv);
		//incidentonly.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 30).until(ExpectedConditions.ele)
		
		
		return new ClaimCreatedPage();
		
	}
}
