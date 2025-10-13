import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	
	public static void main(String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/wits/Documents/cdriver/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Amand");
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.cssSelector("button.submit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("New Name");
	
		
		
        driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).clear();
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("New Name again");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("aman@gmail");
		driver.findElement(By.cssSelector("input[placeholder = 'Phone Number']")).sendKeys("7889345662");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/form/p")).getText());
		
		
		Assert.assertEquals(false, null);
		
		//driver.quit();
	}
	
}
