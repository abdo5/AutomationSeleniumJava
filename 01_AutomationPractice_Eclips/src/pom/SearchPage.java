package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public void fillSearchBox(String search) {
		
		BaseClass.getWebDriver().findElement(By.id("search_query_top")).sendKeys(search);
	}
	
	public void clickSearchButton() {
		BaseClass.getWebDriver().findElement(By.name("submit_search")).click();
	}

	public List<WebElement> getInStockElmen(){

		List <WebElement> inStock = BaseClass.getWebDriver().findElements(By.xpath("//*[@class='available-now']"));
		
		return inStock;
	}
}
