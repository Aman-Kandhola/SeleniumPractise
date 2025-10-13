package EndToEndTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteOrderTest {

	
	public static void main (String args []) {
		
		String ProductToOrder = "ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("amankandhola01@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Qwerty@12345#");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-4")));
		
		List<WebElement> ItemsList = driver.findElements(By.cssSelector(".col-lg-4"));
		WebElement FetchedProduct = ItemsList.stream().filter(product -> product.findElement(By.cssSelector("H5")).getText().equals(ProductToOrder)).findFirst().orElse(null);
		
		FetchedProduct.findElement(By.cssSelector(".col-lg-4 button:last-of-type")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		System.out.println(driver.findElement(By.cssSelector("#toast-container")).getText());
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(driver.findElement(By.cssSelector("22"))));
		
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		
		Boolean foundMatch = cartProducts.stream().anyMatch(cartProd -> cartProd.getText().equalsIgnoreCase(ProductToOrder));
		Assert.assertTrue(foundMatch);
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.xpath("//input[@placeholder = 'Select Country']")),"India").build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		driver.findElement(By.cssSelector(".ta-results button:last-of-type")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		String conformation = driver.findElement(By.cssSelector("h1")).getText();
		
		System.out.println(conformation);
		
		
		Assert.assertTrue(conformation.equalsIgnoreCase("thankyou for the order."));
		
		driver.close();
	}
}
