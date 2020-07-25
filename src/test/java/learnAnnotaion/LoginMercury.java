package learnAnnotaion;

import org.testng.annotations.Test;

public class LoginMercury extends BaseMercury
{
	@Test
	public void login()
	{
		
		driver.findElementByName("userName").sendKeys("abc@we");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("login").click();
		System.out.println("Login completed...");

	}

}
