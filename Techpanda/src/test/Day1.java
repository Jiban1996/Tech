package test;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generics.Base_Test;
import pom.HomePage;

public class Day1 extends Base_Test {
	
	@Test
	public void day1() throws InterruptedException {
		System.out.println("Executing");
		String title;
		title=driver.getTitle();
		if(title.contains("THIS IS DEMO SITE")) {
			System.out.println("VERIFIED");
		}else {
			System.out.println("Not Verified");
		}
		HomePage home=new HomePage(driver);
		home.mobile();
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.contains("Mobile")) {
			System.out.println("VERIFIED");
		}else {
			System.out.println("Not Verified");
		}
		ArrayList a1=new ArrayList();
	//	
		Select s=new Select(HomePage.Sort_By);
		
		for(int i=1;i<HomePage.Product_Name.size();i++) {
			String sb=HomePage.Product_Name.get(i).getText();
			a1.add(sb);
		}
		System.out.println(a1);
		
		
		s.selectByVisibleText("Name");
		ArrayList a2=new ArrayList();
		Thread.sleep(3000);
		for(int i=0;i<HomePage.Product_Name.size();i++) {
			String sb=HomePage.Product_Name.get(i).getText();
			a2.add(sb);
		}
          System.out.println(a2);
			/*
			 * File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * String png =
			 * ("C:\\Guru99 eCommerce Live Project\\Day01_TestCase1\\Mobile Products are sorted"
			 * + scc + ".png"); FileUtils.copyFile(scrFile, new File(png));
			 */
          
          
		
	for(int i=0;i<2;i++) {
		if(a1.get(i).equals(a2.get(i))) {
			System.out.println("not sorted");
		}else {
			System.out.println("sorted");
		}
	}

}}
