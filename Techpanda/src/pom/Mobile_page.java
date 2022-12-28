package pom;




import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Base_page;

public class Mobile_page extends Base_page {
	public Mobile_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='link-compare'])[1]")
	private WebElement AddToCompare_Sony;
	@FindBy(xpath = "(//a[@class='link-compare'])[1]")
	private WebElement AddToCompare_Iphone;
	@FindBy(xpath = "//span[.='Compare']")
	private WebElement Compare;
	@FindBy(xpath = "//span[.='Close Window']")
	private WebElement CloseCompare;
	
	
	
	
	public void day4() throws InterruptedException {
		click_to_element(AddToCompare_Iphone);
		click_to_element(AddToCompare_Sony);
		click_to_element(Compare);
		Thread.sleep(3000);
		
	} 
	public void switchToComapre() {
		Set<String> S=driver.getWindowHandles();
		ArrayList<String> H=new ArrayList(S);
		
		for(int  i=0;i<=H.size();i++) {
			driver.switchTo().window(H.get(i));
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Products Comparison List - Magento Commerce")) {
				break;
			}
		}	
		click_to_element(CloseCompare);
		for(int  i=0;i<=H.size();i++) {
			driver.switchTo().window(H.get(i));
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("Mobile")) {
				break;
			}
		}	
	}
	
	
	

}
