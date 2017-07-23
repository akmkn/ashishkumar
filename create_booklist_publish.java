package chillco;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class create_booklist_publish {
	public WebDriver driver;
	
	@BeforeClass
	public void htart() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void ktart(){
		driver.get( "http://play2.dev.chillco.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edit-name")).sendKeys("SmartGoldImpala");
		driver.findElement(By.id("edit-pass")).sendKeys("dhasa!23");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.className("close")).click();
		driver.findElement(By.xpath("html/body/div[2]/header/section/div[2]/section[1]/ul/li[5]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("html/body/div[2]/main/aside/div/section[1]/div[2]/ul/li/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("html/body/div[2]/main/aside/div/section[2]/p[2]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='edit-field-booklist-title-und-0-value']")).sendKeys("Test Booklist");
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-actions-ief-add']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-form-title']")).sendKeys("Test Title");
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-form-field-author-first-name-und-0-value']")).sendKeys("Test author name");
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-form-field-author-last-name-und-0-value']")).sendKeys("Test author last name");
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-form-field-catalog-link-und-0-url']")).sendKeys("Test catalog link");
		driver.findElement(By.xpath(".//*[@id='edit-field-book-und-form-actions-ief-add-save']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='views-form-admin-views-node-system-1']/div/table[2]/tbody/tr[2]/td[7]/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='booklist-node-form']/div/div[5]/ul/li[5]/a/strong")).click();
		driver.findElement(By.xpath(".//*[@id='edit-status']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		driver.findElement(By.xpath(".//*[@id='admin-menu-icon']/li/a/span")).click();
		driver.findElement(By.xpath("html/body/div[2]/header/section/div[2]/section[1]/ul/li[5]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("html/body/div[2]/main/aside/div/section[1]/div[2]/ul/li/a")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@id='views-form-admin-views-node-system-1']/div/table[2]/tbody/tr[2]/td[2]/a")).click();
	}
	
	@AfterClass
	public void end_session(){
			driver.quit();
		
	}



}

