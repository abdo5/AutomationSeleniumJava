package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
	
	public void ChooseSubjectHeading() {
		
		new Select (BaseClass.getWebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
	}


	public void FillEmail() {
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys("test@gmail.com");
	}
	
	public void FillOrderRefrence() {
		BaseClass.getWebDriver().findElement(By.id("id_order")).sendKeys("123");
	}
	
	public void FillMessage() {
		BaseClass.getWebDriver().findElement(By.id("message")).sendKeys("message");
	}
	
	public void ClickSend() throws InterruptedException {
		BaseClass.getWebDriver().findElement(By.id("submitMessage")).click();
		Thread.sleep(1000);
	}
	
	public String GetContactUsMessage() {
		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
	}
	
	
}
