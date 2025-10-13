package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LandingPage {
	WebDriver driver;	

public LandingPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(css = "#userEmail")
WebElement mail;

@FindBy(css = "#userPassword")
WebElement password;

@FindBy(xpath = "//input[@name='login']")
WebElement loginButton;

public void  LoginApp(String Email, String Password) {
	mail.sendKeys(Email);
	password.sendKeys(Password);
	loginButton.click();
} 

}



