package seleniumNewcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String url=driver.getCurrentUrl();
		Object o=driver.getClass();
		System.out.println(o);
		System.out.println(url);
		

	}

}
