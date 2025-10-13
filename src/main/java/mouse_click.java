
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class mouse_click {

public static void main(String args []) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/a/span/span[2]/span"))).contextClick().build().perform();
	
}
	
}
