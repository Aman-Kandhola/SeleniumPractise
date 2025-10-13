

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.devtools.v136.log.model.ViolationSetting.Name;
import org.testng.Assert;
import org.testng.annotations.Test;

public class streamPractise {

	
	
	@Test 
	public void regular() {
  ArrayList<String> names = new ArrayList<String>();
  
  names.add("Aman");
  names.add("Jaat");
  names.add("Adam");
  names.add("Agam");
  names.add("Hut");
  
  
  ArrayList<String> names2 = new ArrayList<String>();
  names2.add("2nd list element");
  //names.stream().filter(s -> s.startsWith("A")).forEach(s->System.out.println(s));
  
  //names.stream().filter(s-> s.endsWith("t")).limit(1).forEach(s -> System.out.println(s));
   
 // System.out.println(names.stream().count());
  
  //names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
  
  
  
  Stream<String> Merged =Stream.concat(names.stream(), names2.stream());
  
  //Merged.forEach(s->System.out.println(s));
  
 boolean result =  Merged.anyMatch(s-> s.equalsIgnoreCase("Aman"));
 
 Assert.assertEquals(result, true);
 
 List<String> resultList = names.stream().sorted().collect(Collectors.toList());
 
 System.out.println(resultList);
  
  }
	
}
