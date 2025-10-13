import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {

	
	public static void main (String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		String [] veggies = {"Tomato", "Cucumber", "Cashews"};
		int click = 0;
		
		
		List <WebElement> availableVeggies = driver.findElements(By.cssSelector(".product-name"));
		
		for(int i=0; i<availableVeggies.size(); i++ ) {
			String fetch = availableVeggies.get(i).getText();
			String finalString = fetch.split(" ")[0].trim();
			System.out.println(finalString);
			
		  if(click<=veggies.length) {
			   for(int j=0; j<veggies.length;j++) {
			    	 if(finalString.equals(veggies[j])) {
			    		 
			    		 driver.findElements(By.cssSelector(".product-action")).get(i).click();
			    		 click++;
			    		 System.out.println(veggies[j]);
			    		 
			    	 }
			     }
		  }
		  else {
			  
			  break;
		  }
		}
	}
	
	
}
