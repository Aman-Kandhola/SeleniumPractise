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
import pageObjects.CartProductCheck;
import pageObjects.CheckOut;
import pageObjects.LandingPage;
import pageObjects.ProductCatalogue;

public class PageObjectTestFile {

	
	public static void main (String args []) {
		
		String ProductToOrder = "ZARA COAT 3";
		String Country = "India";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LandingPage page = new LandingPage(driver);
		page.LoginApp("amankandhola01@gmail.com", "Qwerty@12345#");
		
		ProductCatalogue prodCat = new ProductCatalogue(driver);
	    prodCat.getProductslist();		
		prodCat.checkSelectedProduct(ProductToOrder);	
		prodCat.clickAddtoCart(ProductToOrder);
		
		CartProductCheck ch = new CartProductCheck(driver);
	    Boolean foundMatch =  ch.MatchProduct(ProductToOrder);
	    Assert.assertTrue(foundMatch);
	
	    CheckOut cheOut = new CheckOut(driver);
	    cheOut.check(Country);
	    
	    String conformation = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(conformation);
		Assert.assertTrue(conformation.equalsIgnoreCase("thankyou for the order."));
		
		driver.close();
	}
}
