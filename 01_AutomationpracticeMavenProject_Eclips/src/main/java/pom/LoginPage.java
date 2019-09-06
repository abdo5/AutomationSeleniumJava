package pom;

import org.openqa.selenium.By;

public class LoginPage {
	public void Login(String userName, String password) {
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys(userName);
		BaseClass.getWebDriver().findElement(By.id("passwd")).sendKeys(password);
		BaseClass.getWebDriver().findElement(By.id("SubmitLogin")).click();
	}

	public String getErrorMessage() {
		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}

	public void CheckExistingAccount(String email) throws InterruptedException {
		// BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"create_account_error\"]")).getText();
		BaseClass.getWebDriver().findElement(By.id("email_create")).sendKeys(email);
		BaseClass.getWebDriver().findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
	}

	public String getExistanceAccountErrorMessage() {
		return BaseClass.getWebDriver().findElement(By.id("create_account_error")).getText();
	}
}
