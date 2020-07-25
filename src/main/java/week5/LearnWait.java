package week5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://play.letcode.in/waitforalert");
		WebElement btn = driver.findElementById("mye");
		btn.click();
		
		//handle dynamic content
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.alertIsPresent());
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert Text : " + text);
		driver.switchTo().alert().accept();

	}

}
