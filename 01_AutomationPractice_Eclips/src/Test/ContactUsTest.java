package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pom.BaseClass;
import pom.ContactUs;
import pom.HomePage;

public class ContactUsTest extends BaseClass{

	

	@Test
	public void TestContactUs() throws InterruptedException {

		HomePage HP = new HomePage();
		HP.ClickOnContactus();

		ContactUs CU = new ContactUs();
		CU.ChooseSubjectHeading();
		CU.FillOrderRefrence();
		CU.FillEmail();
		CU.FillMessage();
		CU.ClickSend();
		assertEquals(CU.GetContactUsMessage(), "Your message has been successfully sent to our team.");
		Thread.sleep(3000);
	}

	
}
