package example;

import org.testng.annotations.Test;

public class TestNgDependsOnMethod {
  
	
	  @Test
       public void sample2() {
		System.out.println("Hello");
	     }	
	 
		@Test(dependsOnMethods="sample2")
		public void sample1()
		{
			System.out.println("World");
		}
 
}
