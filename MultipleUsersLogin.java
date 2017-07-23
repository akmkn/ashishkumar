package AdminCreateAccount;
import java.io.FileInputStream;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleUsersLogin {
		jxl.Sheet s;
		WebDriver driver;

		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
			driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		}
	
		@Test
		public void multipleusers() throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\sony\\Desktop\\user.xls");
		Workbook w = Workbook.getWorkbook(fi);
		s = w.getSheet(0);
		for (int row = 1; row < s.getRows(); row++) {
		driver.get("http://worxogo-innoxogo.gailabs.com");
		driver.findElement(By.xpath(".//*[@id='main-section']/ul/li[1]/a")).click();

		String username = s.getCell(0, row).getContents();
		driver.findElement(By.id("edit-name")).sendKeys(username);

		String email = s.getCell(1, row).getContents();	
		driver.findElement(By.xpath(".//*[@id='edit-mail']")).sendKeys(email);
		
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		String adminusername = s.getCell(2,row).getContents();
		driver.findElement(By.id("edit-name")).sendKeys(adminusername);
		
		String password = s.getCell(3,row).getContents();
		driver.findElement(By.id("edit-pass")).sendKeys(password);
		
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.linkText("People")).click();
		driver.findElement(By.linkText("edit")).click();
		
		String userpassword = s.getCell(4,row).getContents();
		driver.findElement(By.id("edit-pass-pass1")).sendKeys(userpassword);
		
		String userconpass = s.getCell(5,row).getContents();
		driver.findElement(By.id("edit-pass-pass2")).sendKeys(userconpass);
		
		driver.findElement(By.xpath(".//*[@id='edit-roles-4']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-status-1']")).click();
		
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.xpath(".//*[@id='admin-menu-account']/li[1]/a")).click();
		
		String userlogin = s.getCell(6,row).getContents();
		driver.findElement(By.xpath(".//*[@id='edit-name']")).sendKeys(userlogin);
		
		String passlogin = s.getCell(7,row).getContents();
		driver.findElement(By.xpath(".//*[@id='edit-pass']")).sendKeys(passlogin);
		
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		
		driver.findElement(By.xpath(".//*[@id='block-woxgo-custom-wg-user-menu']/div/ul/li")).click();
		driver.findElement(By.xpath(".//*[@id='block-woxgo-custom-wg-user-menu']/div/ul/li/ul/li[6]/a")).click();
}
	}
		@AfterMethod
		public void exit(){
			driver.quit();
		}
}
	
