package Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileComms {

	
	@AfterTest
	public static void afterT() {
		System.out.println("After test method of MobileCommsClass");
	}
	
	
	@Test
	public static void vodafone() {
		System.out.println("Vodafone in mobile ");
	}
	
	@Test
	public static void Airtel() {
		System.out.println("Airtel in mobile");
	}
	
	
	@BeforeTest
	public static void BeforeT() {
		System.out.println("Before test method of MobileCommsClass");
	}
	
	
	
}
