package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class VehicleDataPageObjects extends TestBase {
	
	@FindBy(xpath="//select[@id='make']")
	WebElement dd_make;
	
	@FindBy(xpath ="//input[@id='engineperformance']")
	WebElement txt_enginePerformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement cal_dateOfMafacture;
	
	@FindBy(id="numberofseats")
	WebElement dd_noOfSeats;
	
	@FindBy(xpath="//input[@id='listprice']/following-sibling::span")
	WebElement errorMsg_lastPrice;
	
	@FindBy(name="Fuel Type")
	WebElement dd_fuelType;
	
	@FindBy(id="listprice")
	WebElement txt_price;
	
	@FindBy(id="licenseplatenumber")
	WebElement txt_license;
	
	@FindBy(xpath = "//input[@id='annualmileage']")
	WebElement txt_mileage;
	
	@FindBy(xpath="//button[@id='nextenterinsurantdata']")
	WebElement btn;
	
	public VehicleDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterValueInLastPrice(String value)
	{
		txt_price.sendKeys(value);
	}
	 public String erroMsgOfLastPrice()
	 {
		 return errorMsg_lastPrice.getText();
	 }
	 public List<String> accessDropdown()
	 {
		return cm.getDropdownValues(dd_fuelType);
	 }
	 
	 public void enterVehicleData(HashMap<String,String> testData)
	 {
		 cm.selectDropdown(dd_make, testData.get("Make"));
		 txt_enginePerformance.sendKeys(testData.get("Engine Performance"));
		 cal_dateOfMafacture.sendKeys(testData.get("Date Of manufacture"));
		 cm.selectDropdown(dd_noOfSeats, testData.get("number Of Seats"));
		 cm.selectDropdown(dd_fuelType, testData.get("Fuel type"));
		 txt_price.sendKeys(testData.get("List Price"));
//		 txt_license.sendKeys();
		 txt_mileage.sendKeys(testData.get("Annual Milleage"));
		 btn.click();
		 
		 
		 
	 }
	
	

}
