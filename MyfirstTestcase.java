package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersDemo.TestNGListeners.class)
public class MyfirstTestcase {
	WebDriver driver;
	@Test
 public void googleTitleVerify(){
	 //WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		 
 }
	
	
	
	
	
	
	
	
}
