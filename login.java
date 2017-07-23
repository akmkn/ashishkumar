package chillco;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class login {

public WebDriver driver;

@BeforeTest
public void htart() {
	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get( "http:\\play2.dev.chillco.com");
}
@Test(priority=1)
public void loginone() {
driver.findElement(By.id("edit-name")).sendKeys("SmartGoldImpala"); 
driver.findElement(By.id("edit-pass")).sendKeys("dhasa!23");
driver.getClass();
driver.getCurrentUrl();

	
}
@AfterTest
public void hftertest(){
	driver.close();
}
}