package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Base_page;
;

public class Admin_Login_portal extends Base_page {
	
	public Admin_Login_portal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[.='close']")
	private WebElement Close;
	@FindBy(xpath = "//span[.='close']")
	private WebElement Close1;
	@FindBy(xpath = "//input[@name='login[username]']")
	private  WebElement Un;
	@FindBy(xpath="//input[@name='login[password]']")
	private WebElement Pwd;
	@FindBy(xpath="//input[@title='Login']")
	private WebElement LogIn_Button;
	@FindBy(xpath ="//span[text()='Sales']")
	private WebElement Sales;
	@FindBy(xpath = "//a[@href='http://live.techpanda.org/index.php/backendlogin/sales_order/index/key/dcce032f0fa6dd7f3fc5bd9ff604e68f/']")
	private WebElement Order;
	
	
	
	
	public void day10() throws InterruptedException {
		sendkey_to_element(Un, id);
		sendkey_to_element(Pwd, pass);
		click_to_element(LogIn_Button);
		Thread.sleep(synchronize);
		click_to_element(Close);
		Thread.sleep(synchronize);
		movetoelement(Sales);
		click_to_element(Order);
		
		
	}
	

}
