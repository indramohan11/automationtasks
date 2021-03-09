package seleniumNewcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicallyChangingWebElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
//		driver.findElement(By.name("btnchkavail87804d4a")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("indra");;
		driver.findElement(By.xpath("//input[starts-with(@name,'btnch')]")).click();
		
		

	}

}
