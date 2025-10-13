package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grouping {

	
	
	@Parameters({"BaseURL"})
	@Test
	public void UrlSetup(String URL ) {
		System.out.println(URL);
		
	}
	
	
	@Test(groups = {"smoke"})
	public void firstTest() {
	   System.out.println("first method in smoke");
	}
	
	
	
	@Test(dataProvider="getData")
	public void PrintDataProviderElements(String Name1, String Name2) {
		System.out.println(Name1);
		System.out.println(Name2);
	}
	
	
	@Test(enabled=true)
	public void secondTest() {
		System.out.println("Second method without smoke");
	}
	
	
	
	
	@Test(groups = {"smoke"})
	public void thirdTest() {
		System.out.println("third method in smoke");
	}
	
	
	
	@Test(dependsOnMethods = {"secondTest"})
	public void fourthTest() {
		System.out.println("This is fourth test");
		}
	
	
	@Test
	public void afifthMethod() {
		System.out.println("This is the fifth method function");
	}
	



	@DataProvider
	public void fetchData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstRowName";
		data[0][1] = "firstRoWName2";
		
		data[1][0] = "SecondRowName";
		data[1][1] = "SecondRowName2";
		
		data[2][0] = "ThirdRowName";
		data[2][1] = "ThirdRowName2";
	}
}
