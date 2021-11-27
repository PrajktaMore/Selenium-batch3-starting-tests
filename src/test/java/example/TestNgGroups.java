package example;

import org.testng.annotations.Test;

public class TestNgGroups {
  
	
	
	@Test(groups="Smoke")
  public void first() {
		System.out.println("f1");
  }
	
	@Test(groups= {"Regression","Smoke"})
	  public void third() {
			System.out.println("f3");
	  }
		
	
	@Test(groups="Smoke")
	  public void second() {
			System.out.println("f2");
	  }
		
	
	@Test(groups="Regression")
	  public void fourth() {
			System.out.println("f4");
	  }
		
	
}
