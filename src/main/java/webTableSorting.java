import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableSorting {

	
	
	public static void main (String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		List<WebElement> tableCon = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	   
		List<String> origional = tableCon.stream().map(s -> s.getText()).collect(Collectors.toList());
	 
		List<String> sorted = origional.stream().sorted().collect(Collectors.toList());
		
	    Assert.assertTrue(origional.equals(sorted));
		
	}
}
