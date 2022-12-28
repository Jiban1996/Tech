package test;

import org.testng.annotations.Test;

import generics.Base_Test;
import pom.HomePage;

public class Day2 extends Base_Test {
	@Test
	public void day2() {
	HomePage home=new HomePage(driver);
	home.mobile();
	home.getPrice();
	}
}
