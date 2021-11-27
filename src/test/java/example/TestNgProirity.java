package example;

import org.testng.annotations.Test;

public class TestNgProirity {
  
	@Test(priority=2)
  public void first() {
		System.out.println("f1");
  }
	
	@Test(priority=1)
	public void second()
	{
		System.out.println("f2");
	}
	
	//On same priority execute alphabetically
	@Test(priority=1)
	public void third()
	{
		System.out.println("f3");
	}
	
	@Test
	//no priority means priority =0
	public void fourth()
	{
		System.out.println("f4");
	}
	
	@Test(priority=-1)
	public void fifth()
	{
		System.out.println("f5");
	}
	
}
