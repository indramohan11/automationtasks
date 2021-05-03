package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePageObjects;
import pageObjects.InsuranceDataPageObjects;
import pageObjects.ProductDataPageObjects;
import pageObjects.SelectPriceOptionPageObjects;
import pageObjects.VehicleDataPageObjects;
import reusablecomponents.CommonMethods;
import reusablecomponents.ExtentReport;

public class ObjectRepo {
	
	public   HomePageObjects homePage;
	public VehicleDataPageObjects vehiData;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	public static CommonMethods cm= new CommonMethods(); 
	public static InsuranceDataPageObjects insData;
	public static ProductDataPageObjects proData;
	public static SelectPriceOptionPageObjects priceoption;
	
}
