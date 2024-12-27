package Giftcards;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import ObjectRepository.HomePage;

public class TS_DWS_011_Test extends BaseClass
{
@Test
			
	public void clickOnGiftCards() {
	test=extReport.createTest("clickOnGiftCards");
	hp=new HomePage(driver);
	hp.getComputersLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Giftcards page is not displayed");
	test.log(Status.PASS, "GiftCards page is displayed");
	}
}
