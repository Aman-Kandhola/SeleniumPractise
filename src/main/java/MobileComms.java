import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileComms {

	
	
	
	@Test
	public static void vodafone() {
		System.out.println("Vodafone in mobile ");
	}
	
	@Test
	public static void Airtel() {
		System.out.println("Airtel in mobile");
	}
	
	
	@BeforeTest
	public static void beforeT() {
		System.out.println("Before test method of MobileCommsClass");
	}
	
}
