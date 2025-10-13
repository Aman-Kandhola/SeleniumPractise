import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countingCheckBox {

	public static void main(String args []) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		selectCheckBox(driver);
	}
	
	public static void selectCheckBox(WebDriver driver) {
		
    List < WebElement> divsCBox  =   driver.findElements(By.cssSelector(".fleft"));		
    for(WebElement e : divsCBox) {
    	if(e.getText().equalsIgnoreCase("Student")) {
    		e.click();
    		break;
    	}
    }
		
	}
}
