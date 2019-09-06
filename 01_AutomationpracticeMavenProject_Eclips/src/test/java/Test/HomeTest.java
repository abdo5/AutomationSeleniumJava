package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;

public class HomeTest extends BaseClass {


	@Test(priority = 1)
	public void testHomeTotalItemCount()  {
		System.out.println("start HomeTesting");
		HomePage HP = new HomePage();
		HP.homePageClick();
		int totalCount = HP.getHomePageTotalItemsCount();
		System.out.println("No of items: " + totalCount);
		assertEquals(totalCount, 14);

	}
/*
	@Test(priority = 2)
	public void testHomeBestSellerItemCount() {
		HomePage HP = new HomePage();
		System.out.println("No of BestSeller items: " + HP.getHomePageBestSellerItemsCount());
		assertEquals(HP.getHomePageBestSellerItemsCount(), 14);

	}
*/
}
