package test;

import org.testng.annotations.Test;

import generics.AutoConstant;
import generics.Base_Test;
import pom.HomePage;

public class Day3 extends Base_Test implements AutoConstant {
	@Test
	public void day3() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.mobile();
		h.day3();
		
	}

}
