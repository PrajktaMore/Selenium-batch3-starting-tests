package example;

import org.testng.annotations.Test;

import org.testng.Assert;


public class calculatorTestTestNg {

	calculator calc=new calculator();
  @Test
  public void add1() {

	  Assert.assertEquals(calc.add1(5, 5), 10);
	  
  }
  @Test
  public void sub1() {
    
	  Assert.assertEquals(calc.sub1(5, 5), 0);
	  
  }
}
