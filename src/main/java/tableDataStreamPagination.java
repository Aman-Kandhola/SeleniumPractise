import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableDataStreamPagination {

	public static void main(String args []) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().window().maximize();
		
	
		List<String> newList;
	
		do {
			List<WebElement> tableCon = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			newList = tableCon.stream().filter(s -> s.getText().contains("Beans")).map(s-> getPrice(s)).collect(Collectors.toList());
			
			newList.forEach(a -> System.out.println(a));
			if(newList.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}
		while(newList.size()<1);
		driver.quit();
	}

	private static String getPrice(WebElement s) {
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	
}
