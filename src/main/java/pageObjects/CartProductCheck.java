package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjectsUtils.AbstractComponent;

public class CartProductCheck extends AbstractComponent{
	WebDriver driver;

@FindBy(css =".cartSection h3")
List <WebElement> cartProducts;
	
	public CartProductCheck(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> GetProducts() {
		return cartProducts;
		//List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));		
	}
	
	public boolean MatchProduct(String ProductToOrder) {
		
		Boolean foundMatch = GetProducts().stream().anyMatch(cartProd -> cartProd.getText().equalsIgnoreCase(ProductToOrder));
		return foundMatch;
	}
}

