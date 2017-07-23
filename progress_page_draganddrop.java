package chillco;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class progress_page_draganddrop {
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
		
		driver.findElement(By.xpath("html/body/div[2]/header/section/div[2]/section[1]/ul/li[1]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("html/body/div[2]/main/div/div[3]/div[2]/div[1]/div/div/img")).click();
		WebElement dragme = driver.findElement(By.xpath("html/body/div[2]/main/div/div[3]/div[2]/div[1]/div/div/img"));
		WebElement dropme = driver.findElement(By.xpath(".//*[@id='calendar']/div/div/table/tbody/tr[4]/td[6]"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragme, dropme).perform();
	
	}
	@AfterClass
	public void end_session(){
		driver.quit();
		driver.close();
		
	}
	
}
