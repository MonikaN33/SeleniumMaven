package testNGAnnotations;

import org.testng.annotations.Test;

public class LearnAttributes
{

	@Test(priority = 2)
	public void eat()
	{
		System.out.println("Eat...");
	}
	
	@Test(priority = 3)
	public void code()
	{
		System.out.println("Code...");
	}
	
	@Test(priority = 1)
	public void sleep()
	{
		System.out.println("Sleep...");
	}
	
}
