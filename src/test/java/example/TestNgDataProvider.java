package example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNgDataProvider {

	calculator calc=new calculator();
  @Test (dataProvider="dpaddition")
  public void add1(int exp_value,int a,int b) {
    Assert.assertEquals(exp_value, calc.add1(a, b));
  }
  @Test(groups="Smoke")
  public void sub1() {
	  Assert.assertEquals(calc.sub1(5, 5), 0);
   }  
  
  @DataProvider(name="dpaddition")//can give any name
  
  public Object[][] getdata()
  {
	  	  
	  return new Object[][] {{10,5,5},{20,10,10},{50,25,25},{45,25,25}};
  }
}
