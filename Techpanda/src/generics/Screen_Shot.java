package generics;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screen_Shot implements ITestListener{
	
	public void onTestSkipped(ITestResult result) {
		TakesScreenshot ts= (TakesScreenshot)Base_Test.driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=(Date) Calendar.getInstance().getTime();	
		String date=today.toString().replaceAll(":", "-");
		
		File destfile=new File("./Screenshot/"+name+date+".png");
		
		try {
			FileUtils.copyFile(source_file, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	

	}

}
