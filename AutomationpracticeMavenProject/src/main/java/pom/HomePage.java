package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

	public void homePageClick() {
		BaseClass.getWebDriver().findElement(By.id("header_logo")).click();
	}

	public void clickOnSignin() {
		// driver=BaseClass.getWebDriver();
		BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

	public void ClickOnContactus() {
		BaseClass.getWebDriver().findElement(By.id("contact-link")).click();

	}

	public int getHomePageTotalItemsCount() {

		List<WebElement> itemList = BaseClass.getWebDriver().findElements(By.xpath("//*[@class=\'product-container']"));
		return itemList.size();
	}

	public int getHomePageBestSellerItemsCount() {

		WebElement bestSeller = BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\'blockbestsellers']"));

		List<WebElement> bestSellerList = bestSeller.findElements(By.xpath("//*[@class=\'product-container']"));

		return bestSellerList.size();
	}

}
