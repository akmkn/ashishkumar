package chillco;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Create_Account {
	public WebDriver driver;

	@BeforeClass
	public void htart() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "http:\\play2.dev.chillco.com");
	}
	@Test
	public void test_create_account(){
		driver.findElement(By.xpath(".//*[@id='user-login-form']/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-mail']")).sendKeys("ashish.k@gai.co.in");
		driver.findElement(By.xpath(".//*[@id='edit-pass-pass1']")).sendKeys("test123");
		driver.findElement(By.xpath(".//*[@id='edit-pass-pass2']")).sendKeys("test123");
		driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-user-birthday-und-0-value-datepicker-popup-0']")).sendKeys("March 12 2007");
		driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-user-avatar-und-3']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-user-first-name-und-0-value']")).sendKeys("Ashish");
		driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-user-last-name-und-0-value']")).sendKeys("Kumar");
		driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-user-phone-und-0-value']")).sendKeys("(255)444-9999");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		//driver.findElement(By.id("")).sendKeys("");
		
		}
	/*
	@AfterClass
	public void endsession(){
		driver.close();
		driver.quit();
	}*/
}
