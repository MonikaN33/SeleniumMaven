package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceNow3
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev78844.service-now.com/");
		
		//Sign In
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("Servicenow#33");
		driver.findElementById("sysverb_login").click();
		
		//Search box
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleIs("System Administration | ServiceNow"));
		driver.findElementByXPath("//input[@placeholder='Filter navigator']").sendKeys("incident");
		WebElement enter = driver.findElementByXPath("//input[@placeholder='Filter navigator']");
		enter.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
				
				
		
		System.out.println("Validation completed....");
	}

}
