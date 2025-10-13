import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiblingTraverse {

	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
	    printLocators( driver);
	}
	
	
	   public static void printLocators(WebDriver e) {
			System.out.println(e.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
			System.out.println(e.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[2]")).getText());
			System.out.println(e.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[2]/parent::div/a")).getText());
	   }
	
}





//NeerajMicrosof@12345