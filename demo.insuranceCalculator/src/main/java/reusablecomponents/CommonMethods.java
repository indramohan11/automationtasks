package reusablecomponents;

import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public List<String> getDropdownValues(WebElement element)
	{
		Select select= new Select(element);
		List<WebElement> values = select.getOptions();
		List<String> actualValues= new ArrayList<>();
		for(WebElement ele:values)
		{
			actualValues.add(ele.getText());
		}
		
		return actualValues;
	}
	
	public void selectDropdown(WebElement webelement,String valueToBeSelected)
	{
		Select os= new Select(webelement);
		os.selectByVisibleText(valueToBeSelected);
		
	}
	public void selectRadioButton(List<WebElement> webelement,String valueToBeSelected)
	{
		for (WebElement ele : webelement) {
			if(ele.getText().equalsIgnoreCase(valueToBeSelected))
			{
				ele.click();
				break;
			}
			
		}
		
	}
	
	public void selectCheckBoxes(List<WebElement> webelement,String check)
	{
		String[] checkArray=check.split(",");
		for(String str:checkArray)
		for (WebElement ele : webelement) {
			if(ele.getText().equalsIgnoreCase(str))
			{
				ele.click();
				break;
			}
			
		}
	}
		
	}


