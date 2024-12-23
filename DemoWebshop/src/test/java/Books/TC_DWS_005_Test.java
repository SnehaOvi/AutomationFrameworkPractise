package Books;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import GenericUtility.BaseClass;
import GenericUtility.ListenerUtility;
import ObjectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test extends BaseClass {
	@Test
	public void clickOnBooks() {
		test= extReport.createTest("clickOnBooks");
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Book", "Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
