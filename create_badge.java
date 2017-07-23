package chillco;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class create_badge {
	public WebDriver driver;
	
	@BeforeClass 
public void doThis(){
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
@Test
public void dothis_one(){
	driver.get( "http://play2.dev.chillco.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("SmartGoldImpala");
	driver.findElement(By.id("edit-pass")).sendKeys("dhasa!23");
	driver.findElement(By.id("edit-submit")).click();
	driver.findElement(By.className("close")).click();
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/a"));
	action.moveToElement(we).build().perform();
	driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div[1]/div[1]/div/div/div[2]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='edit-title']")).sendKeys("Test Badge");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-actions-ief-add']")).click();
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-title']")).sendKeys("Testing Badge");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-field-badge-image-und-0-upload']")).sendKeys("D:\\seleniumIDE\\sticker_soccer_1.png");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-field-badge-image-und-0-upload-button']")).click();
	//driver.findElement(By.xpath(".//*[@id='tinymce']/p")).sendKeys("Test Badge for Automation Testing");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-description-und-0-value']")).sendKeys("Test badge for creating badges and testing it for automation testing.");
	
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-field-badge-alt-txt-und-0-value']")).sendKeys("testing purpose");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-field-badge-description-und-0-value']")).sendKeys("Test badge description");
	driver.findElement(By.xpath(".//*[@id='edit-field-reward-badge-und-form-field-badge-category-und-62']")).click();
	driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
	driver.findElement(By.xpath("html/body/div[2]/main/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
	driver.findElement(By.xpath(".//*[@id='admin-menu-account']/li[1]/a")).click();
}
}
