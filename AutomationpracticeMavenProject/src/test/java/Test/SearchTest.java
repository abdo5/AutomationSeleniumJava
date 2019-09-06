package Test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.SearchPage;
import pom.Shared;

public class SearchTest extends BaseClass {

	@Test(priority = 1)
	public void searchTest() throws InterruptedException {
		System.out.println("startSearchTesting");
		SearchPage SP = new SearchPage();
		SP.fillSearchBox("dress");
		SP.clickSearchButton();
		List<WebElement> inItemList = SP.getInStockElmen();
		for (WebElement item : inItemList) {
			assertEquals(item.getText(), "In stock");
		}
	}

}
