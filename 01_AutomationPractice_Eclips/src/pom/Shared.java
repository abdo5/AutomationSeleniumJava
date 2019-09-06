package pom;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Shared {
	

	@BeforeTest
	public void Setup() throws InterruptedException {

		BaseClass BC = new BaseClass();
		BC.Setup();

	}
	
	
	@AfterTest
	public void closeBroser() throws InterruptedException {
		 BaseClass.getWebDriver().close();
		//BaseClass.getWebDriver().quit();
		 System.out.println("closed");
		 Thread.sleep(5000);
	}


}
