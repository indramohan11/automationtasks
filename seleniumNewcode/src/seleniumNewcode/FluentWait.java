//package seleniumNewcode;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.*;
//
//import com.google.common.base.Function;
//
//public class FluentWait {
//
//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.chrome.driver","D:\\selenium data\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("abcd");
////		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
//		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				 .withTimeout(Duration.ofSeconds(30))
//		            .pollingEvery(Duration.ofMillis(500))
//		            .ignoring(NoSuchElementException.class);
//
//		        until(new Function<WebElement, Boolean>() 
//		        {
//		            public Boolean apply(WebElement element)
//		            {
//		                return element.getText().endsWith("04");
//		            }
//
//		            private void until(Function<WebElement, Boolean> function)
//		            {
//		                driver.findElement(By.linkText("Sample Post2"));
//		            }
//		        }
//		    }
//		}