package learnAnnotaion;

import org.testng.annotations.Test;

public class BookFlight extends BaseMercury
{
	@Test
	public void bookings()
	{
		
		driver.findElementByName("userName").sendKeys("abc@we");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("login").click();
		driver.findElementByXPath("//input[@name='tripType' and @value='oneway']").click();
		System.out.println("Trip type selected....");
		
	}
}
