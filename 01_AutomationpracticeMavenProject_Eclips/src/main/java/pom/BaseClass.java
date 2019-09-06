package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseClass {

	static WebDriver driver;

	@BeforeTest
	public void Setup() throws InterruptedException {

		driver = new ChromeDriver();
		//System.setProperty("webdriver.cjrome.driver", "chromedriver.exe");
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeBroser() throws InterruptedException {
		// BaseClass.getWebDriver().close();
		BaseClass.getWebDriver().quit();
		System.out.println("closed");

	}

	public static WebDriver getWebDriver() {
		// use this to get driver without creating object in test class
		// driver = new ChromeDriver();
		// driver.get("http://automationpractice.com");

		return driver;
	}

}
