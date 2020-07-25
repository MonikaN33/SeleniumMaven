package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceNow1 
{

	public static void main(String[] args) throws InterruptedException
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
		driver.findElementByXPath("//div[@class='sn-widget-list-title' and text()='Create New']").click();
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 30);
		//wait1.until(ExpectedConditions.titleContains("Create INC"));
		
		
		 for (String handle : driver.getWindowHandles())
		 { 
			 try 
			 {
				 driver.switchTo().window(handle);
		 
			 } 
			 catch (NoSuchWindowException e) 
			 { 
				 
				 System.out.println("Exceptional case....");
			 } 
			 
		 }
		 
		
		//store INC value
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.titleContains("Create INC"));
		driver.switchTo().frame("gsft_main");
		WebElement textbox = driver.findElementByXPath("//input[@id='incident.number']");
		String textValue = textbox.getAttribute("value");
		System.out.println(textValue);
		
		System.out.println("Validation completed....");
		
		
		
		
		//driver.quit();

	}

}
