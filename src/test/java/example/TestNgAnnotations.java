package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
  
	
	@BeforeMethod
	public void before_method()
	{
		
		System.out.println("Before Method");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest //executed before test in test suite
	public void before_test(){
		
		System.out.println("Before Test");
		
	}
   
	@BeforeClass
	public void before_class()
	{
		System.out.println("Before class");
	}
	
	
	
	
	
	@Test
	public void sample2()
	{
		System.out.println("Hello");
	}
	
	@Test
    public void sample1()//As alphabetical order execution
    //this method will get executed first
 
	{
	  
	  System.out.println("World");
	  
  }
	
	  @AfterSuite
		public void aftersuite()
		{
			System.out.println("After suite");
		}

	@AfterMethod
	public void after_method()
	{
		
		System.out.println("After Method");
	}
	
    @AfterClass
	public void after_class()
	{
		System.out.println("afte class");
	}


    @AfterTest
	public void after_test(){
		
		System.out.println("After Test");
		
	}

  
}
