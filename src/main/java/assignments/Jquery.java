package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
			 
		 WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		 WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		 
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).build().perform();
		 
		System.out.println("Validation completed...");

	}

}
