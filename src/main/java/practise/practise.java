package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise {

	public static void main (String args []) {
       WebDriverManager.chromedriver().setup();   
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       
       
       driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Amandeep Singh");
       
       
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
    //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //List <WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='wM6W7d']/span"/*.eIPGRd span:first-child*/))));
       
       List <WebElement> suggestions = driver.findElements(By.cssSelector(".aajZCb span:first-child"/*.eIPGRd span:first-child*/));
       
       for (int i =0; i<suggestions.size(); i++) {
    	   System.out.println(suggestions.get(i));
       }
       
       suggestions.stream().forEach(fetched -> System.out.println(fetched.getText()+"vdvd"));
	}
}
