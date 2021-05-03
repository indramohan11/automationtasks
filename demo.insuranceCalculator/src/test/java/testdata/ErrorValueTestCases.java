package testdata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.HomePageObjects;
import reusablecomponents.ExcelOperations;
import testBase.TestBase;

public class ErrorValueTestCases extends TestBase {
	
	ExcelOperations ex= new ExcelOperations("Sheet1");
	@Test(enabled = false)
	public void errorMessageOfCylinder() throws InterruptedException {
		homePage.clickOnAutomobileLink();
		vehiData.enterValueInLastPrice("121");
		test.log(Status.PASS, "cylinder capacity filled with data: 121");
//    	Thread.sleep(4000);
		String actResult=vehiData.erroMsgOfLastPrice();
		String ExpResult="Must be a number between 500 and 100000";
		Assert.assertEquals(actResult, ExpResult);
		
		

		
	}
	
	@Test(enabled = false)
	public void errorMessageOfCylinder1() throws InterruptedException {
		homePage.clickOnAutomobileLink();
		vehiData.enterValueInLastPrice("121");
		test.log(Status.PASS, "cylinder capacity filled with data: 121");
//    	Thread.sleep(4000);
		String actResult=vehiData.erroMsgOfLastPrice();
		String ExpResult="Must be a number between 500 and 1";
		Assert.assertEquals(actResult, ExpResult);
		
	}
		@Test(enabled = false)
		public void verifyMakedropdown() throws InterruptedException {
			homePage.clickOnAutomobileLink();
//			vehiData.enterVehicleData("1221");
//			insData.enterInsuranceData(testData);
//			List<String> dropdoenList=vehiData.accessDropdown();
//			test.log(Status.INFO, "dropdown actual values"+dropdoenList);
////	    	Thread.sleep(4000);
//			
//			List<String> ExpResult=Arrays.asList("– please select –","Petrol","Diesel","Electric Power","Other");
//			test.log(Status.INFO, "dropdown expected values"+ExpResult);
//			Assert.assertEquals(dropdoenList, ExpResult);
		
	}
		
		@Test(enabled=true ,dataProvider = "vehicledata")
		public void sample(Object obj1)
		
		{
			HashMap<String, String> testData= (HashMap<String, String>) obj1;
//			System.out.print(testData);
			homePage.clickOnAutomobileLink();
			vehiData.enterVehicleData(testData);
			insData.enterInsuranceData(testData);
			proData.enterProductData(testData);
			String expected="255.00";
			String actual=priceoption.getPriceOption(testData.get("Select Option"));
			Assert.assertEquals(actual, expected);
			priceoption.selectPlanOption(testData.get("Select Option"));
			
		}
		
		
		@DataProvider(name="vehicledata")
		public Object[][] testDataSupplier() throws Exception
		{
			Object[][] obj = new Object[2][1];
			for(int i=1;i<=ex.rowCount();i++)
			{
				HashMap<String ,String> testData=ex.getTestData(i);
				obj[i-1][0]=testData;
				
			}
			return obj;
			
		}


}
