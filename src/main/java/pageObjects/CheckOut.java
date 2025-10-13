package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObjectsUtils.AbstractComponent;

public class CheckOut extends AbstractComponent{
	
	WebDriver driver;
	
	@FindBy (xpath="//button[text()='Checkout']")
	WebElement checkOutButton;
	@FindBy(xpath = "//input[@placeholder = 'Select Country']")
	WebElement CountryField;
	@FindBy(css = ".ta-results button:last-of-type")
	WebElement CountryFromSuggestions;
	@FindBy(css = ".action__submit")
	WebElement Submit;
	
	By elementsVisible = By.cssSelector(".ta-results");	
	
	public CheckOut(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void check(String Country) {
		checkOutButton.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(CountryField,Country).build().perform();
		
		ElementToBeVisible(elementsVisible);
		
		CountryFromSuggestions.click();
		Submit.click();
		
	}
	
}
