package Test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.SearchPage;

public class SearchTest extends BaseClass{
	


	@Test
	public void searchTest() throws InterruptedException {
		SearchPage SP = new SearchPage();
		SP.fillSearchBox("dress");
		SP.clickSearchButton();
		List<WebElement> inItemList = SP.getInStockElmen();
		for(WebElement item : inItemList)
		{
			assertEquals(item.getText(), "In stock");
		}
		
		Thread.sleep(400);
	}
	
	


}
