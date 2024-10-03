package selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameterization {

	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println("value of a & b"+(a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println("value of a & b"+(a-b));
	}
}
