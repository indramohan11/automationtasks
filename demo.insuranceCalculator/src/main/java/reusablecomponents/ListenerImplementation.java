package reusablecomponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.ObjectRepo;

public class ListenerImplementation extends ObjectRepo implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case:" + result.getMethod().getMethodName() + " is passed");

	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case:" + result.getMethod().getMethodName() + " is failed");
		test.log(Status.FAIL, result.getThrowable());
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String ScreenshotPath = System.getProperty("user.dir") + "/reports/screenshots_" + actualDate + ".png";
		File dest = new File(ScreenshotPath);
		try {
			FileUtils.copyFile(img, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(ScreenshotPath, "screenshot for failed test case");
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		extent = ExtentReport.setupReport();

	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}

}
