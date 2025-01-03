package GenericUtility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String methodName=result.getName();
		test.log(Status.FAIL, methodName+" is Failed");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+methodName+jLib.getSystemTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64)); //adding screenshot in extent report
	}
}
