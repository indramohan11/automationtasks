package seleniumNewcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWaitDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.findElement(By.linkText("New Tours")).click();
		String s=driver.getTitle();
		System.out.print(s);
		driver.close();
		
		
		
		

	}

}
