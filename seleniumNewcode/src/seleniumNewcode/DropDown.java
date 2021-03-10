package seleniumNewcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demo.guru99.com/test/newtours/register.php");
		dr.manage().window().maximize();
		Select select= new Select(dr.findElement(By.name("country")));
		select.selectByIndex(7);
		select.selectByValue("BANGLADESH");
		select.selectByVisibleText("AUSTRIA");
		



	}

}
