import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(Duration.ofSeconds(2));
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=120");
		
		List <WebElement> lastColumnElements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		System.out.println(lastColumnElements.size());
		
		
		for(int i = 0; i < lastColumnElements.size();i++) {
			System.out.println(lastColumnElements.get(i).getText());
		}
	}
	
}
