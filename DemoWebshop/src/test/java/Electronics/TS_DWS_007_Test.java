package Electronics;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ListenerUtility;
import ObjectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TS_DWS_007_Test extends BaseClass 
{
@Test
	
	public void clickOnElectronics() {
		test=extReport.createTest("clickOnElectronics");
		hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}
}
