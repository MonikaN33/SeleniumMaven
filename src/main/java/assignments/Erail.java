package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		
		//select starting point
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS");
		WebElement from = driver.findElementById("txtStationFrom");
		from.sendKeys(Keys.TAB);
		
		
		 //select starting point
		 driver.findElementById("txtStationTo").clear();
		 driver.findElementById("txtStationTo").sendKeys("Kolkata");
		 WebElement to = driver.findElementById("txtStationTo"); to.sendKeys(Keys.TAB);
		 from.sendKeys(Keys.TAB);
		 
		 driver.findElementById("chkSelectDateOnly").click();
		 
		 //get count of rows
		 int rowSize = driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]/tbody/tr").size();
		 System.out.println("Number of rows in webtable : " + rowSize);
		 
		 //get count of columns in each row
		 int colSize = driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]/tbody/tr[1]/td").size();
		 System.out.println("Number of columns in webtable : " + colSize);
		 
		//divided xpath In three parts to pass Row_count and Col_count values.
		 String first_part = "//div[@id='divTrainsList']/table[1]/tbody/tr[";
		 String second_part = "]/td";
		 
		 System.out.println("Train list before sorting...");
		 
		 //get train numbers
		 for(int i=1; i<=rowSize; i++)
		 {
			 String final_part = first_part+i+second_part;
			 String trainNum = driver.findElement(By.xpath(final_part)).getText();
			 System.out.println("Train Number : " + trainNum);
		 }
		 
		 //sort train 
		driver.findElementByXPath("//a[text()='Train' and @title='Click here to sort on Train Number']").click();
		 
		System.out.println("Train list after sorting...");
		 
		 //get train numbers
		 for(int i=1; i<=rowSize; i++)
		 {
			 String final_part = first_part+i+second_part;
			 String trainNum = driver.findElement(By.xpath(final_part)).getText();
			 System.out.println("Train Number : " + trainNum);
		 }
		
	}

}
