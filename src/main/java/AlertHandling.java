import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Aman entered the text");
		button.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(Duration.ofSeconds(2));
		
		button.click();
		driver.switchTo().alert().dismiss();
		
		//driver.quit();
		
	}
	
}
