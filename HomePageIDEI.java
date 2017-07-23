import java.util.concurrent.TimeUnit;

//import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class HomePageIDEI {
WebDriver driver;


@Test

public void Home_Page_IDEI(){
 System.setProperty("webdriver.chrome.driver",
		 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
 
 driver = new ChromeDriver();
 driver.manage().window().maximize();

 driver.get("http://dev-idei.gailabs.com");
 
 driver.findElement(By.linkText("IMPACT")).click();	
 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 /*Actions action = new Actions(driver);
 WebElement we = driver.findElement(By.xpath(".//*[@id='anchor1']"));
 action.moveToElement(we).build().perform();*/
 driver.findElement(By.xpath(".//*[@id='block-idei-custom-home-custom-menu']/ul/li[3]")).click();
}
@AfterMethod

public void teardown(){

	
	
	
}}
