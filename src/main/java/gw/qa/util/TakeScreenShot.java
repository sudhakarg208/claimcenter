package gw.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import gw.qa.guidewirebase.TestBase;

public class TakeScreenShot extends TestBase{
	
	public static void screenShot(String filepath,String filename) throws IOException {	
		//File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		WebElement source = driver.findElement(By.id("FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:ttlBar"));
		WebElement destination = driver.findElement(By.xpath("//span[text()='Special Claim Permission']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		//FileUtils.copyFile(srcfile, new File(filepath+filename+".jpg"));
		
	}

}
