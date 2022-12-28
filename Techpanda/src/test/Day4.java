package test;

import org.testng.annotations.Test;

import generics.Base_Test;
import pom.HomePage;
import pom.Mobile_page;

public class Day4 extends Base_Test{
	@Test
	public void day4() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.mobile();
		Mobile_page M=new Mobile_page(driver);
		M.day4();
		M.switchToComapre();
	}

}
