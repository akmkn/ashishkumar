package com.keyword.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyWordExample extends KeyWordExecution{

	static WebDriver driver;
	static WebDriverWait wait;

	public void open_Browser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
				driver = new ChromeDriver();
				}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	public void enter_URL(String URL) {
		driver.navigate().to(URL);
	}

	public By locatorValue(String locatorType, String value) {
		By by;
		switch (locatorType) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		return by;
	}

	public void enter_Text(String locatorType, String value, String text) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.sendKeys(text);
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Link(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Button(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	public void close_Browser() {
		driver.quit();
	}
}