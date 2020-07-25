package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider
{

	@Test(dataProvider = "positive data")
	public void myTest(String fname, String lname)
	{
		System.out.println(fname);
		System.out.println(lname);
		
		
	}
	
	@DataProvider(name = "positive data")
	public String[][] myData()
	{
		String [][] data = new String[2][2];
		data[0][0] = "Monika";
		data[0][1] = "Gupta";
		data[1][0] = "Nishant";
		data[1][1] = "Singh";
		
		
		return data;
		
	}
	
}
