import org.testng.annotations.Test;

public class grouping {

	@Test(groups = {"smoke"})
	public void firstTest() {
	   System.out.println("first method in smoke");
	}
	
	
	
	
	
	@Test
	public void secondTest() {
		System.out.println("Second method without smoke");
	}
	
	
	
	
	@Test(groups = {"smoke"})
	public void thirdTest() {
		System.out.println("third method in smoke");
	}
}
