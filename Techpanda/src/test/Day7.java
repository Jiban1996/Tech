package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generics.Base_Test;
import pom.HomePage;

public class Day7 extends Base_Test{
	@Test
	public void day7() throws AWTException, InterruptedException {
		HomePage Home=new HomePage(driver);
		Home.day7();
	}

}
