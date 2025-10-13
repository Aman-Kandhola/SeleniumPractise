package Test;
import org.testng.annotations.Test;

public class WebCommunications {

	
	@Test
	public static void sat() {
		//System.out.println("Satelite Communicatons");
		/*int count = 1; 
		for(int i = 4; i>0; i--) {
			for(int j =1; j<=i ;j++) {
				System.out.print(count+"  ");
				count ++;
			}
			System.out.println();
		}*/
	
	
	
	int count2 = 1;
	for(int i=1;i<=4;i++) {
		for (int j = 1; j<=i; j++) {
			System.out.print(" "+count2);
			count2++;
		}
		System.out.println();
	}
	}
}
