package test;

import org.testng.annotations.Test;

import generics.Base_Test;
import pom.Admin_Login_portal;

public class Day10 extends Base_Test{
	@Test
	public void day10() throws InterruptedException {
	Admin_Login_portal A=new Admin_Login_portal(driver);
	A.day10();
	}
}