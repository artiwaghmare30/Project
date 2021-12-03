package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeSuite
	public void beforesuite3()
	{
		System.out.println("beforesuite3");
	}

	@BeforeTest
	public void beforetestmethod3()
	{
		System.out.println("beforetestmethod3");
	}

	@BeforeClass
	public void beforeclass3()
	{
		System.out.println("beforeclass3");
	}
	@BeforeMethod
	public void beforemethod3()
	{
		System.out.println("beforemethod3");
	}
	@Test
	public void testC()
	{
		System.out.println("testclassC");
	}
	@Test
	public void testD()
	{
		System.out.println("testclassD");
	}
	
	@AfterMethod
	public void Aftermethod3()
	{
		System.out.println("Aftermethod3");
	}
	@AfterClass
	public void Afterclass3()
	{
		System.out.println("Afterclass3");
	}
	@AfterTest
	public void afterstmethod3()
	{
		System.out.println("aftertestmethod3");
	}
	@AfterSuite
	public void aftersuite3()
	{
		System.out.println("aftersuite3");
	}


}



