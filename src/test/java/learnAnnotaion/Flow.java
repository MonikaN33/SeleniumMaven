package learnAnnotaion;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Flow {
  @Test
  public void test1()
  {
	  System.out.println("test1");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("after class");
  }
  
  @AfterClass
  public void afterClass2()
  {
	  System.out.println("after class2");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite1() 
  {
	  System.out.println("after suite1");
  }
  
  @AfterSuite
  public void afterSuite2() 
  {
	  System.out.println("after suite2");
  }

}
