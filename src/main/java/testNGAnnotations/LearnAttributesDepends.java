package testNGAnnotations;

import org.testng.annotations.Test;

public class LearnAttributesDepends
{

	@Test(dependsOnMethods = "sleep") //packagename.classname.methodname
	public void eat()
	{
		System.out.println("Eat...");
		//throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "sleep")
	public void code()
	{
		System.out.println("Code...");
		
	}
	
	@Test(dependsOnMethods = "repeat")
	public void sleep()
	{
		System.out.println("Sleep...");
	}
	
	@Test(dependsOnMethods = "sleep")
	public void repeat()
	{
		System.out.println("Repeat...");
	}
	
}
