package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;

public class Utility {

	public static String captureScreenshot(WebDriver driver,String screenshotName){
		
		try{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest ="C:\\Users\\sony\\workspace\\IDEI\\screenshot\\"+screenshotName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source,destination); 
		System.out.println("Screenshots Taken");
		return dest;
	}
	 catch (Exception e) {
			System.out.println("Exception while taking screenshots: " +e.getMessage());
		return e.getMessage();
	}
		
	}}
