package smoketestDemoPurposes;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class IDEI {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest logger;
	
	
	
	@Test
	public void idei_title_verify(){
		System.setProperty("webdriver.chrome.driver", 
				"C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		
		reports = new ExtentReports("c:\\Reports\\idei.html");
		
		logger = reports.startTest("idei_title_verify");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser Started");
		
		driver.get("http://dev-idei.gailabs.com");
		
		String title = driver.getTitle();
		
		logger.log(LogStatus.INFO, "Site is up and running");
		
		Assert.assertTrue(title.contains("xyz"));
		logger.log(LogStatus.PASS, "Title verified");
		
	}
	@AfterMethod
	
	public void teardown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			String screenshot_path = Utility.captureScreenshot(driver, result.getName());
			String image = logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, "verification failed", image);
			
		
	}
		
		reports.endTest(logger);
		reports.flush();
		driver.get("c:\\Reports\\idei.html");
}
}