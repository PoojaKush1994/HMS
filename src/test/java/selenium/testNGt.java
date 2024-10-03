package selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGt {
	
	@Test
	public void testMethod() {
		System.out.println("testmethod");
        // Your test code here
    }

    @BeforeTest
    public void beforeTest() {
    	System.out.println("beforetest");
        // Code to run before each test
    }

    @AfterTest
    public void afterTest() {
    	System.out.println("aftertest");
        // Code to run after each test
    }

}
