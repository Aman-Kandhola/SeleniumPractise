import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {

	public static void main(String args []) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		
		//Thread.sleep(Duration.ofSeconds(7));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
		
		System.out.print("awake");
		System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).isDisplayed());
		
		
	}
}
