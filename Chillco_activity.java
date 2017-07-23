package chillco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Chillco_activity {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get( "http:\\play2.dev.chillco.com");
		driver.findElement(By.id("edit-name")).sendKeys("SmartGoldImpala");
		driver.findElement(By.id("edit-pass")).sendKeys("dhasa!23");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.className("close")).click();  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
