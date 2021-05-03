package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class InsuranceDataPageObjects extends TestBase
{
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txt_first_Name;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txt_last_Name;
	
	@FindBy(xpath="//input[@id='birthdate']")
	WebElement cal_birthDate;
	
	@FindBy(xpath="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]")
	List<WebElement> dbn_gender;
	
	@FindBy(xpath="//input[@id='streetaddress']")
	WebElement txt_street_Address;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement dd_country;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement txt_zipcode;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txt_city;
	
	
	@FindBy(xpath="//select[@id='occupation']")
	WebElement dd_occupation;
	
	
	@FindBy(xpath="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]")
	List<WebElement> rbn_hobbies;
	
	@FindBy(xpath="//input[@id='website']")
	WebElement txt_website;
	
	@FindBy(xpath="//button[@id='nextenterproductdata']")
	WebElement btn_next;
	
public InsuranceDataPageObjects() {
	PageFactory.initElements(driver, this);
}	

public void enterInsuranceData(HashMap<String,String> testData)
{
	txt_first_Name.sendKeys(testData.get("First name"));
	txt_last_Name.sendKeys(testData.get("Last Name"));
	cal_birthDate.sendKeys(testData.get("Date Of Birth"));
	cm.selectRadioButton(dbn_gender, testData.get("Gender"));
	txt_street_Address.sendKeys(testData.get("Street Address"));
	cm.selectDropdown(dd_country, testData.get("Country"));
	txt_zipcode.sendKeys(testData.get("Zip Code"));
	txt_city.sendKeys(testData.get("City"));
	cm.selectDropdown(dd_occupation, testData.get("Occupation"));
	cm.selectCheckBoxes(rbn_hobbies,testData.get("Hobbies"));
	btn_next.click();
	
	
	
	
}

	
	
	

}
