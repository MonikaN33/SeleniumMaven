package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://developer.servicenow.com/dev.do");
		
		//working with shadow DOM and finding sign-in button
		
		WebElement root1 = driver.findElementByCssSelector("dps-app");
		WebElement shadowRoot1 = expandRootElement(root1);
		
		WebElement root2 = driver.findElementByCssSelector("dps-navigation-header");
		WebElement shadowRoot2 = expandRootElement(root2);
		
		WebElement root3 = driver.findElementByCssSelector("dps-login");
		WebElement shadowRoot3 = expandRootElement(root3);
		
		WebElement root4 = driver.findElementByCssSelector("dps-button");
		WebElement shadowRoot4 = expandRootElement(root4);
		
		shadowRoot4.findElement(By.xpath("//span[text()='Sign In']"));
	}
	
	
		
		
		



	private static WebElement expandRootElement(WebElement root1)
	{
		WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root1);
		return ele;
	}

}
