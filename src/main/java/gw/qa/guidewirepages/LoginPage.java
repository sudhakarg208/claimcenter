package gw.qa.guidewirepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gw.qa.guidewirebase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id='Login:LoginScreen:LoginDV:username']")
	WebElement username;
	

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//span[text()='Log In']")
	WebElement loginButton;
	
	public LoginPage(){
		System.out.println("In Login Page constructor");
		PageFactory.initElements(driver, this);
	}

	public String validateGWTitle() {	
		String title = driver.getTitle();
		return title;

	}

	public HomePage validateLogin(String uname,String pwd) {
		System.out.println("username is +++++ " + username + " driver is " + driver);
		driver.switchTo().frame("top_frame");
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();

		return new HomePage();
	}

}
