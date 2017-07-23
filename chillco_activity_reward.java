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

	public class chillco_activity_reward {
		public WebDriver driver;
		
		@BeforeClass 
	public void doThis(){
			System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	
		}
	@Test
	public void dothis_one(){
		driver.get("http://play2.dev.chillco.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edit-name")).sendKeys("SmartGoldImpala");
		driver.findElement(By.id("edit-pass")).sendKeys("dhasa!23");
		driver.findElement(By.id("edit-submit")).click();
		//driver.findElement(By.className("close")).click();
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/a"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div[1]/div[1]/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-title']")).sendKeys("Test Activity");
		driver.findElement(By.xpath(".//*[@id='edit-field-activity-points-und-0-value']")).clear();
		driver.findElement(By.xpath(".//*[@id='edit-field-activity-points-und-0-value']")).sendKeys("1");
		driver.findElement(By.xpath(".//*[@id='edit_field_activity_fired_hook_und_0_value_chosen']/a/div/b")).click();
		driver.findElement(By.xpath(".//*[@id='edit_field_activity_fired_hook_und_0_value_chosen']/div/ul/li[7]")).click();
		driver.findElement(By.xpath(".//*[@id='edit_field_activity_time_limit_und_chosen']/a/div/b")).click();
		driver.findElement(By.xpath(".//*[@id='edit_field_activity_time_limit_und_chosen']/div/ul/li[3]")).click();
		driver.findElement(By.xpath(".//*[@id='edit-field-activity-description-und-0-value']")).sendKeys("Test Activity Description");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		WebElement weq = driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/a"));
		action.moveToElement(weq).build().perform();
		driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div[1]/div[1]/div/div/div[2]/ul/li[7]/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-title']")).sendKeys("Test Activity Connection");
		driver.findElement(By.xpath(".//*[@id='edit-field-reward-criteria-repeatable-und-1']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-field-reward-role-limits-und-6']")).click();
		driver.findElement(By.xpath(".//*[@id='edit_field_reward_criteria_activity_und_chosen']/ul/li/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='edit_field_reward_criteria_activity_und_chosen']/div/ul/li[6]")).click();
		
		driver.findElement(By.xpath(".//*[@id='edit_field_reward_criteria_reward_und_chosen']/ul")).click();
		driver.findElement(By.xpath(".//*[@id='edit_field_reward_criteria_reward_und_chosen']/div/ul/li[3]")).click();
		driver.findElement(By.xpath(".//*[@id='edit-field-send-message-to-user-und-yes']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-field-start-age-und-0-value']")).sendKeys("7");
		driver.findElement(By.xpath(".//*[@id='edit-field-end-age-und-0-value']")).sendKeys("15");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.xpath("html/body/div[2]/main/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.xpath(".//*[@id='admin-menu-account']/li[1]/a")).click();
	}
	/*
		@AfterClass
		public void endsession(){
			driver.close();
			driver.quit();
	
		}
		*/
	}