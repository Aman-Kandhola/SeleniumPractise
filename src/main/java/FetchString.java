import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchString {

	public static String getPassword(WebDriver driver) throws InterruptedException {
		String finalpass;
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("New Name");
	
		
		
        driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).clear();
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("New Name again");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("aman@gmail");
		driver.findElement(By.cssSelector("input[placeholder = 'Phone Number']")).sendKeys("7889345662");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		String fetch=driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/form/p")).getText();
		
		String [] firstsub= fetch.split("'");
		
		
		finalpass = firstsub[1].split("'")[0];
		
		return finalpass;
	}
	
	public static void main(String args []) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
			
			System.out.println(getPassword(driver));
			}	
}
