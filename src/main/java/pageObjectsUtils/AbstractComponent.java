package pageObjectsUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
    WebDriver driver;
    
    @FindBy(css ="[routerlink*='cart']")
    WebElement GoToCartButton;
	
	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
	}


	public void ElementToBeVisible(By ByClassInstance) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClassInstance));
		System.out.println("entered");
	}
	
	public void goToCart() {

		GoToCartButton.click();
	}
}
