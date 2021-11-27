package example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class calculatorTest {

	calculator calc=new calculator();
	
	@Before
	public void a1()
	{
		System.out.println("Before Method");
	}
	
	@After
	
	public void b1()
	{
		System.out.println("After Method");
	}
	@Ignore 
	@Test
	public void testAdd1() {

    assertEquals(calc.add1(5, 5),10);
	}

	@Test
	public void testSub1() {
    assertEquals(calc.sub1(5, 5),0);
    }

}
