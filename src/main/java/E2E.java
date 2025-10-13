import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {

	
	public static void main (String args[]) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if (driver.findElement(By.xpath("//div[text()=\"Return Date\"]")).getDomAttribute("style").contains("1"))
	{
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()=\"Return Date\"]")).getDomAttribute("style").contains("1"),false);
	}

		
	else {
	
		if(driver.findElement(By.cssSelector("div[data-testid*='one-way-radio-button']")).isEnabled()){
			System.out.print("One way is aleready enabled");
			
			
			
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div[2]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
	/*	List <WebElement> cities = driver.findElements(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[@data-testid='to-testID-origin']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq']/div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/div[@class='css-1dbjc4n r-18u37iz']/div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']/div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div/div[1]/div[1]"));
		
		for(WebElement g : cities) {
			if(g.getText().equalsIgnoreCase("Agra")) {
				
				System.out.println("entered starting location");
				g.click();
				
			}
		}
		*/
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//div[contains(text(),'Bhopal')]")).click();
		
		/*List <WebElement> Destinations = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div/div[1]/div[1]"));
		
		for(WebElement D : Destinations) {
			if(D.getText().equalsIgnoreCase("Bhopal")) {
				System.out.println("Entered the Destination location");
				D.click();
			}
					
		}*/
		
		
		driver.findElement(By.cssSelector("div[data-testid='undefined-month-July-2025'] div[data-testid='undefined-calendar-day-23']")).click();
		//driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();	
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']")).click();
		//driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		//driver.findElement(By.cssSelector("div[data-testid='Children-testID-plus-one-cta']")).click();
		Thread.sleep(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]")).click();
		
		
		}
		else {
			Assert.assertEquals(driver.findElement(By.cssSelector("div[data-testid*='one-way-radio-button']")).isEnabled(), true);
		}
		
	}
	
}		
}
