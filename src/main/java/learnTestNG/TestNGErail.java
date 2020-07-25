package learnTestNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGErail
{

	
	@Test
	public void tc001 () 
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
		 
		 List<String> trainSorted = new ArrayList<String>();
		 
		 //get train numbers
		 for(int i=1; i<=rowSize; i++)
		 {
			 String final_part = first_part+i+second_part;
			 String trainNum = driver.findElement(By.xpath(final_part)).getText();
			 trainSorted.add(trainNum);
			 
		}
		 
		System.out.println("Train number before sorting...." + trainSorted);
		 
		Collections.sort(trainSorted);
		
		System.out.println("Train number after sorting...." + trainSorted);
		
		//sort train 
		driver.findElementByXPath("//a[text()='Train' and @title='Click here to sort on Train Number']").click();
		
		//get train numbers after clicking sorting option
		
		List<String> trainSorted1  = new ArrayList<String>();
		
		 for(int i=1; i<=rowSize; i++)
		 {
			 String final_part = first_part+i+second_part;
			 String trainNum = driver.findElement(By.xpath(final_part)).getText();
			 trainSorted1.add(trainNum);
		 }
		 
		 System.out.println("Train number after sorting option selection...." + trainSorted1);
		
		 if(trainSorted.equals(trainSorted1))
		 {
			 System.out.println("Train numbers are sorted properly...");
		 }
		 else
		 {
			 System.out.println("Train numbers are not sorted properly...");
		 }
		 
		driver.quit();
		
		 
		 
		 
		 
		
	}


}
