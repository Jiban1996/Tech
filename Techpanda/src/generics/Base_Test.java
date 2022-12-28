package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_Test implements AutoConstant {
	public static WebDriver driver;
	@BeforeSuite
	public void start() {
		System.out.println("Execution Start");
	}
	@AfterSuite
	public void end() {
		System.out.println("Execution Ends");
	}
	@BeforeClass
	public void setup() {
		System.setProperty(gecko_key,gecko_value);
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		//System.setProperty(chrome_key,chrome_value);
		//System.setProperty("webdriver.chrome.silentOutput","true");
	}
	@BeforeMethod
	public void  openBrowser() {
   driver=new FirefoxDriver();
   //driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   driver.navigate().to(url1);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	
	}
	

}
