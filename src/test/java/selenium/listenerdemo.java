package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listenerdemo {
	
	
	WebDriver driver;
	@Test
	public void test1()
	{
		System.out.println("this is test1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("this is test3");
		throw new SkipException("Test");
	}


}
