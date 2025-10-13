import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DyanamicDropdown {

	
public static void main(String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		
		DynamicDropDown(driver);
		
		
	}
	
public static void DynamicDropDown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value=\"ATQ\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
}

}
