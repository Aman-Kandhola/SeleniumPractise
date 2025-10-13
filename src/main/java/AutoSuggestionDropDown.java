import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		
		Thread.sleep(5000);		
		getElements(driver);
	}
	
	
	public static void getElements(WebDriver e) {
		
		
		

		List <WebElement> suggestionsList = e.findElements(By.cssSelector(".ui-menu-item"));
		
		for(WebElement opt: suggestionsList) {
			System.out.println(suggestionsList.get(2));
			if(opt.getText().equalsIgnoreCase("India")) {
				opt.click();
				break;
			}
			System.out.println(opt.getText());
		}
	}

}
