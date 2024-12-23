package Computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ListenerUtility;
import ObjectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TS_DWS_006_Test extends BaseClass {
@Test
	
	public void clickOnComputers() {
		test=extReport.createTest("clickOnComputers");
		hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");
	}
}
