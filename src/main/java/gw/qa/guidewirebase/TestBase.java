package gw.qa.guidewirebase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public Properties props;

	public TestBase() {
		System.out.println("in test base constructor ");
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\Soori\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe")
		 * ; DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 * caps.setCapability("ignoreZoomSetting", true); //driver = new
		 * InternetExplorerDriver(caps); driver = new InternetExplorerDriver(caps);
		 */
		try {
			props = new Properties();
			File file = new File(
					"C:\\Coding\\DataProvider\\" + "globaldata.properties");

			FileInputStream fileIS = new FileInputStream(file);

			props.load(fileIS);
			// System.out.println(props.getProperty("browser")+ " browser is is");
		} catch (Exception exception) {

		}

	}

	public void launchBrowser() {
		// String browsername = props.getProperty("browser");
		// String str="chrome";
		// System.out.println("browser is " + browsername +
		// ""+str.equals(props.getProperty("browser")));
		// if(browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Coding\\chromedriver_version74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/cc");
	}

}
