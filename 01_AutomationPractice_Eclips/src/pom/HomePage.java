package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	public void clickOnSignin() {
		// driver=BaseClass.getWebDriver();
		BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

	public void ClickOnContactus() {
		BaseClass.getWebDriver().findElement(By.id("contact-link")).click();

	}

	public int getHomePageTotalItemsCount() {

		List<WebElement> itemList = BaseClass.getWebDriver().findElements(By.xpath("//*[@class='product-container']"));
		return itemList.size();
	}

	public int getHomePageBestSellerItemsCount() {

		// List<WebElement> itemList =
		// getElement(BaseClass.getWebDriver(),sBy,"homefeatured").findElements(By.xpath("//*[@class=\'product-container']"));

		// List<WebElement> rows =
		// getElement(driver,sBy,"table_div_id").findElements(By.tagName("tr"));

		// WebElement bestSeller =
		// BaseClass.getWebDriver().findElement(By.id("blockbestsellers"));

		// WebElement bestSeller =
		// BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a"));
		// WebElement bestSeller =
		// BaseClass.getWebDriver().findElement(By.xpath("//*[@class=\'blockbestsellers']"));

		// WebElement bestSeller =
		// BaseClass.getWebDriver().findElement(By.xpath("//*[@class=\'product_list grid
		// row blockbestsellers tab-pane active']"));
		WebElement bestSeller = BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\'blockbestsellers']"));

		// WebElement bestSeller =
		// BaseClass.getWebDriver().findElement(By.id("blockbestsellers"));

		// id=blockbestsellers

		// List<WebElement> bestSellerList =
		// bestSeller.findElements(By.xpath("//*[@class=\'product-container']"));
		// List<WebElement> bestSellerList =
		// bestSeller.findElements(By.xpath("//*[@class=\'product-container']"));

		// List<WebElement> bestSellerList =
		// bestSeller.findElements(By.xpath("//*[@class=\'ajax_block_product col-xs-12
		// col-sm-4 col-md-3 first-in-line first-item-of-tablet-line
		// first-item-of-mobile-line']"));

		List<WebElement> bestSellerList = bestSeller.findElements(By.xpath("//*[@class='product-container']"));

		// product-container
		// *[@id="blockbestsellers"]/li[1]
		// blockbestsellers

		return bestSellerList.size();
	}

}
