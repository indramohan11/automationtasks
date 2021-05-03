package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ProductDataPageObjects extends TestBase {

	
	@FindBy(xpath="//input[@id='startdate']")
	WebElement cal_startDate;
	
	@FindBy(xpath="//select[@id='insurancesum']")
	WebElement dd_insuranceSum;
	
	@FindBy(xpath="//select[@id='meritrating']")
	WebElement dd_meritRating;
	
	@FindBy(xpath="//select[@id='damageinsurance']")
	WebElement dd_damage_insurance;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")
	List<WebElement> rbn_optionalProducts;
	
	@FindBy(id="courtesycar")
	WebElement dd_courtesyCar;
	
	@FindBy(xpath="//button[@id='nextselectpriceoption']")
	WebElement btn_next;
	
	
	public ProductDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterProductData(HashMap<String,String> testData)
	{
		cal_startDate.sendKeys(testData.get("Start Date"));
		cm.selectDropdown(dd_insuranceSum, testData.get("Insurance Sum"));
		cm.selectDropdown(dd_meritRating, testData.get("Merit Rating"));
		cm.selectDropdown(dd_damage_insurance, testData.get("Damage Insurance"));
		cm.selectRadioButton(rbn_optionalProducts, testData.get("Optional Products"));
		cm.selectDropdown(dd_courtesyCar, testData.get("Courtesy Car"));
		btn_next.click();
		
		
	}
}
