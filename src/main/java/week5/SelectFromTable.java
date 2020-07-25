package week5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFromTable
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/table");
		
		Thread.sleep(5000);
		WebElement table = driver.findElementByClassName(".table ");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=1; i<rows.size(); i++)
		{
			WebElement eachRow = rows.get(1);
			List<WebElement> alldata = eachRow.findElements(By.tagName("td"));
			
		}
		
	}

}
