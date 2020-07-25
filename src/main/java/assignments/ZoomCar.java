package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomCar 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
		driver.findElementByXPath("//button[contains(text(),'Next')]").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> days = driver.findElementsByXPath("//div[@class='day low-price']");
		days.get(0).click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.urlToBe("https://www.zoomcar.com/chennai/search"));
		List<WebElement> lastdays = driver.findElementsByXPath("//div[@class='day']");
		int days2 = lastdays.size();
		lastdays.get(days2-1).click();
		driver.findElementByXPath("//button[text()='Done']").click();
		
		//Find number of car available
		List<WebElement> carList = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println("Total number of cars : " + carList.size());
		
		//Find highest car price and car name
		wait.until(ExpectedConditions.titleContains("Book A Car"));
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		
		
		List<WebElement> car = driver.findElementsByXPath("//div[@class='details']/h3");
		String carName = car.get(0).getText();
		System.out.println("Car name : " + carName);
		
		List<WebElement> carPrice = driver.findElementsByXPath("//div[@class='new-price']");
		String price = carPrice.get(0).getText();
		//String price1 = price.trim();
		System.out.println("Car Price : " + price);
		
		
		System.out.println("Validation completed...");

	}

}
