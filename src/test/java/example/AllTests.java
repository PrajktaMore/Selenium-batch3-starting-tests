package example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ calculatorTest.class, calculatorTest1.class, calculatorTest1Test.class, test2.class })
public class AllTests {

}
