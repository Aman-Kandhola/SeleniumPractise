package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObjectsUtils.AbstractComponent;

public class ProductCatalogue extends AbstractComponent{

	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css = ".col-lg-4")
	List<WebElement> products;

	By Products = By.cssSelector(".col-lg-4");
	By goToCart= By.cssSelector(".col-lg-4 button:last-of-type");
	By ToastMessage = By.cssSelector("#toast-container");
	
	public List<WebElement> getProductslist(){
		ElementToBeVisible(Products);
		
			return products;
	}
	
	public WebElement checkSelectedProduct(String ProductToBeSelected) {
		//List<WebElement> ItemsList = driver.findElements(By.cssSelector(".col-lg-4"));
		WebElement FetchedProduct = getProductslist().stream().filter(product -> product.findElement(By.cssSelector("H5")).getText().equals(ProductToBeSelected)).findFirst().orElse(null);
		return FetchedProduct;
	}
	
	public void clickAddtoCart(String ProductToBeSelected) {
		WebElement product = checkSelectedProduct(ProductToBeSelected);
		product.findElement(goToCart).click();
		ElementToBeVisible(ToastMessage);
		goToCart();
	}
}
