package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFlipkartExample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		//driver.switchTo().alert().accept();

		
		driver.findElementByXPath("//span[text()='Electronics']").click();
		driver.findElementByXPath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		//wait.until(ExpectedConditions.urlMatches("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi");
		
		System.out.println(driver.getTitle());
		
		

	}

}
