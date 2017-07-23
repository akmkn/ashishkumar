package CaptureScreenshots;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookscreenshot {
	public WebDriver driver;
@Test
	public void capturescreenshot() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	Utility.captureScreenshot(driver,"browserstarted");
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ashishnirmohi");
	Utility.captureScreenshot(driver,"typeuname1");
	
	driver.quit();
}
}
