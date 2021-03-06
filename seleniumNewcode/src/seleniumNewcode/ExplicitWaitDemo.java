package seleniumNewcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Selenium']")));
		
// intensionally making fail		
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='eelenium']")));
		boolean status=element.isDisplayed();
		if(status) {
			System.out.print("visible");
		}else {
			System.out.print("Not visible");
		}
		driver.close();
		
			}

}
