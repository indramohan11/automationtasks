package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import pageObjects.InsuranceDataPageObjects;
import pageObjects.ProductDataPageObjects;
import pageObjects.SelectPriceOptionPageObjects;
import pageObjects.VehicleDataPageObjects;
import reusablecomponents.PropertiesOperations;

public class TestBase  extends ObjectRepo{
	
	@BeforeMethod
	public void launchBrowser() throws Exception {
		String browser= PropertiesOperations.getPropertyValueByKey("browser");
		String url= PropertiesOperations.getPropertyValueByKey("url");
		 
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
			
		}
		
		homePage=new HomePageObjects();
		vehiData= new VehicleDataPageObjects();
		insData= new InsuranceDataPageObjects();
		proData= new ProductDataPageObjects();
		priceoption= new SelectPriceOptionPageObjects();

		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
