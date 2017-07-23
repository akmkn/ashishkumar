package smoketestDemoPurposes;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class verifypagetitle {

	ExtentReports reports;
	
	ExtentTest logger;
	
	WebDriver driver;

@Test
public void verifytitle(){
	reports = new ExtentReports("c:\\Reports\\learnautomation.html");
	
	logger= reports.startTest("verifytitle");
	
	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	logger.log(LogStatus.INFO,"Browser Started");
	
	driver.get("http://www.learn-automation.com");
	
	logger.log(LogStatus.INFO, "Application is up and running");
	
	String title = driver.getTitle();
	
	Assert.assertTrue(title.contains("Selenium"));
	
	logger.log(LogStatus.PASS, "Title Verified");
}
@AfterMethod 

public void teardown(ITestResult result){
	if(result.getStatus()==ITestResult.FAILURE){
		
		String screenshot_path= Utility.captureScreenshot(driver, result.getName());
		
		String image = logger.addScreenCapture(screenshot_path);
		
		logger.log(LogStatus.FAIL, "verification failed",image);
		
	}
	
	reports.endTest(logger);
	
	reports.flush();
	
	driver.get("C:\\Reports\\LearnAutomation.html");
}
}
