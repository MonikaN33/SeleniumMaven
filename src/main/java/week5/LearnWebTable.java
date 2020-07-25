package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://play.letcode.in/table");
		
		Thread.sleep(5000);
		int rowSize = driver.findElementsByXPath("//div[@class='form-label-group']/table/tbody/tr").size();
		System.out.println("Number of rows in webtable : " + rowSize);
		
		 int colSize = driver.findElementsByXPath("//div[@class='form-label-group']/table/tbody/tr[1]/td").size();
		 System.out.println("Number of columns in webtable : " + colSize);
		 
		 String first_part = "//div[@class='form-label-group']/table/tbody/tr[";
		 String second_part = "]/td[";
		 String third_part = "]";
		 String name1 = "Mary";
		 
		 for(int i=1; i<=rowSize; i++)
		 {
			 for(int j=1; j<=colSize; j++)
			 {
				 String final_part = first_part+i+second_part+j+third_part;
				 String name = driver.findElement(By.xpath(final_part)).getText();
				 if(name == name1)
				 {
					 driver.findElement(By.xpath(final_part)).click();
				 }
			 
			 }
			 
		}
		 
		 System.out.println("Validation completed...");
		
		

	}

}
