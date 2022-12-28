package test;

import org.testng.annotations.Test;

import generics.Base_Test;
import pom.HomePage;

public class Day8 extends Base_Test{
	@Test
	public void day8() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.day8();	
	}

}
