import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newTab {

	
	
	public static void main (String args []) {
		
		String first_page= null;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.geeksforgeeks.org");
		
		
		String title = driver.getTitle();
		
		Set <String> handles = driver.getWindowHandles();
		
		for(String index: handles) {
			driver.switchTo().window(index);
			if(driver.getTitle().equals("Google")) {
				first_page = index;
				break;
			}
		}
		
		driver.switchTo().window(first_page);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(title);
	}
}
