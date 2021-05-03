package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SelectPriceOptionPageObjects extends TestBase
{
	
	
	public String getPriceOption(String plan)
	{
		String xpath="//table[@id='priceTable']//tr[1]//td[@data-label='"+plan+"']/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public void selectPlanOption(String priceOption)
	{
		String xpath="//input[@name='Select Option' and @value='"+priceOption+"'] ";
		driver.findElement(By.xpath(xpath)).click();
		
	}

	public SelectPriceOptionPageObjects() {
		PageFactory.initElements(driver, this);
	}
	

}
