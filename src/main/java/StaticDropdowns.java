import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdowns {

	public static void main(String args []) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		
		WebElement StaticDropDown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(StaticDropDown);
		
		staticDropDownwithIndex(sel);
		
		staticDropDownwithVisibleText(sel);
		
		staticDropDownwithValue(sel);
	}
	
	
	
	public static void staticDropDownwithIndex(Select selectClassObj) {
		
		System.out.println("\nBelow selected with index");
		
		selectClassObj.selectByIndex(0);
		System.out.println(selectClassObj.getFirstSelectedOption().getText());// this getFist is gets the selected element or can get default selected 
		
		selectClassObj.selectByIndex(1);
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByIndex(2);
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByIndex(3);
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
	}

	public static void staticDropDownwithVisibleText(Select selectClassObj) {
	
		System.out.println("\nBelow selected with Visible text");
	
		
		selectClassObj.selectByVisibleText("INR");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByVisibleText("AED");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByVisibleText("USD");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
	}
	
	
	public static void staticDropDownwithValue(Select selectClassObj) {
		
		System.out.println("\nBelow selected with Value");
		
		selectClassObj.selectByValue("INR");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByValue("AED");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
		
		selectClassObj.selectByValue("USD");
		System.out.println(selectClassObj.getFirstSelectedOption().getText());
	}
		
}
