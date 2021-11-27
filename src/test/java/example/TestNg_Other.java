package example;

import org.testng.annotations.Test;

public class TestNg_Other {
  
	@Test(enabled=false) //to ignore the method
  public void first() {
		System.out.println("f1");
  }
	
	@Test(timeOut=21000)//for synchronization point of 21 seconds
	public void second() {
		System.out.println("f2");
	}
	

	@Test(expectedExceptions=ArithmeticException.class)//Exception handling
	public void third() {
		System.out.println("f3");
	}
	
}
