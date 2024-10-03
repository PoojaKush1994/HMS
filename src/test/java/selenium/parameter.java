package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class parameter {
	
	@Test (dependsOnMethods = {"test2","test3"})
	public void test1()
	{
	System.out.println("this is 1");
	}
	@Test
	public void test2()
	{
	System.out.println("this is 2");
	Assert.assertTrue(true);
	}
	@Test
	public void test3()
	{
	System.out.println("this is 3");
	}
	
	

}
