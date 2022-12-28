package pom;




import java.awt.AWTException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Base_page;



public class HomePage extends Base_page {
	
	
	
	@FindBy(xpath = "//a[@href='http://live.techpanda.org/index.php/mobile.html']")
	private WebElement Mobile;
	@FindBy(xpath = "(//select[@onchange='setLocation(this.value)'])[1]")
	public  static WebElement Sort_By;
	@FindBy(xpath = "//h2[@class='product-name']")
	public  static List<WebElement>  Product_Name;
	@FindBy(xpath = "//a[@title='Sony Xperia']/../..//span[@class='price']")
	private WebElement SonyExpiraPrice;
	@FindBy(xpath = "//a[@title='Sony Xperia']/../..//span[.='Add to Cart']")
	private WebElement SonyExpira_Add_to_cart;
	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement Quantity;
	@FindBy(xpath = "//span[.='Update']")
	private WebElement Update;
	@FindBy(xpath = "//p[@class='item-msg error']")
	private WebElement Error_Msg;
	@FindBy(xpath = "(//span[.='Account'])[1]")
	private WebElement Account;
	@FindBy(xpath = "//a[@title='Log In']")
	private WebElement Login;
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private WebElement Email;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Login_button;
	@FindBy(xpath = "//a[text()='View Order']")
	private WebElement ViewOrder;
	@FindBy(xpath = "//a[text()='Print Order']")
	private WebElement PrintOrder;
	@FindBy(xpath = "//a[@href='http://live.techpanda.org/index.php/sales/order/reorder/order_id/17337/']")
	private WebElement ReOrder;
	@FindBy(xpath = "//input[@id='coupon_code']")
	private WebElement CoupenCode;
	@FindBy(xpath = "(//span[@class='price'])[6]")
	private WebElement Price;
	@FindBy(xpath="//span[.='Apply']")
	private WebElement Apply;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void mobile() {
		click_to_element(Mobile);
	}
	public void sortBy() throws InterruptedException {
		
	click_to_element(Sort_By);
	Thread.sleep(3000);
	}
	public void getPrice() {
		String price=SonyExpiraPrice.getText().toString().substring(1);
		System.out.println(price);	
	}
	public void day3() throws InterruptedException {
	   click_to_element(SonyExpira_Add_to_cart);
	   click_to_element(Quantity);
	
	   click_to_element(Update);
	   String actual=getText(Error_Msg);
	   System.out.println(actual);
	   Thread.sleep(3000);
	   verifyResults(actual);   
	}
	public void day7() throws AWTException, InterruptedException {
		Thread.sleep(synchronize);
		click_to_element(Account);
		click_to_element(Login);
		sendkey_to_element(Email, Un);
		sendkey_to_element(Password, Pwd);
		click_to_element(Login_button);
		click_to_element(ViewOrder);
		click_to_element(PrintOrder);
		Set<String> Handles=driver.getWindowHandles();
		ArrayList<String> H=new ArrayList<String>(Handles);
		
		for(int  i=0;i<=H.size();i++) {
			driver.switchTo().window(H.get(i));
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Prin")) {
				break;
			}
		}
		Thread.sleep(synchronize);
		enterRobot();
		Thread.sleep(synchronize);		
	}
	public void verifyDownload() {
		File file_Location=new File("C:\\Users\\User\\Desktop\\MANUAL TESTING");
		File [] filelist=file_Location.listFiles();
		for(File file:filelist) {
			if(file.getName().contains("Print Order")) {
				System.out.println("Downloaded");
		}
	}}
	public void day8() throws InterruptedException {
		Thread.sleep(synchronize);
		click_to_element(Account);
		click_to_element(Login);
		Thread.sleep(synchronize);
		Thread.sleep(synchronize);
		sendkey_to_element(Email, Un);
		sendkey_to_element(Password, Pwd);
		click_to_element(Login_button);
		javascriptclick(ReOrder);
		Thread.sleep(synchronize);
		Thread.sleep(synchronize);
		String Before=getText(Price);
		double Before_price=Double.parseDouble(Before.replace("$",""));
		System.out.println(Before_price);
		
		sendkey_to_element(CoupenCode, Coupen);
		click_to_element(Apply);
		String After=getText(Price);
		double After_Price=Double.parseDouble(After.replace("$",""));
		System.out.println(After_Price);
		if(Before_price!=After_Price) {
			System.out.println("Applied");
	}

}}
